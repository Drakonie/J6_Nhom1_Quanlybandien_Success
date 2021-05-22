
package Controller;

import ConnectDB.Connect;
import Model.BacTienDien;
import Model.HoaDon;
import Model.NguoiDung;
import Model.TaiKhoan;
import Model.Thang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Bui Quoc Anh
 */
public class QuanlychisodienController {
    Connect conn = new Connect();
    public QuanlychisodienController(){
        conn.getConnect();
    }
    //Ham lay du lieu
    public ArrayList<HoaDon> getList_Chisodien() throws SQLException{
        ArrayList<HoaDon> tempList = new ArrayList<>();
        String sql = "select * from hoadon inner join nguoidung on hoadon.manguoidung = nguoidung.manguoidung inner join thang on hoadon.mathang = thang.mathang order by mahd asc";
        ResultSet rs = conn.GetData(sql);
        while(rs.next()){
            //String maHD, NguoiDung nguoiDung, Thang thang, int soDienDau, int soDienCuoi
            
            
            //String maNguoiDung, String hoTen, String soCMT, String ngaySinh, String diaChi, String soDienThoai,
            //String ngayDangKy, int thanhToan, String doiTuong, ThietBi thietBi, TaiKhoan taiKhoan
            TaiKhoan tk = new TaiKhoan(rs.getString("username"), rs.getString("password"), rs.getString("loaiTK"));
            NguoiDung nguoiDung = new NguoiDung(rs.getString("manguoidung"), rs.getString("hoten"),rs.getString("socmt"), rs.getDate("ngaySinh").toString(), rs.getString("diachi"), rs.getString("sodt"), rs.getString("ngaydk"), rs.getInt("thanhtoan"), rs.getString("doituong"), null, tk);
            Thang thang = new Thang(rs.getString("mathang"));
            HoaDon hd = new HoaDon(rs.getString("mahd"), nguoiDung, thang, rs.getInt("sodiendau"), rs.getInt("sodiencuoi"));
            tempList.add(hd);
        }
        return tempList;
    }
    public void themHoadon(String mahd, String manguoidung, int maThang, int sodiendau, int sodiencuoi) throws Exception{
        String sql = "insert into hoadon(mahd, manguoidung, mathang, sodiendau, sodiencuoi) values ('"+mahd+"', '"+manguoidung+"', "+maThang+", "+sodiendau+", "+sodiencuoi+")";
        conn.executeNonQuery(sql);
    }
    public void suaHoaDon(String mahd, String manguoidung, int maThang, int sodiendau, int sodiencuoi) throws Exception{
        String sql = "update hoadon set manguoidung='"+manguoidung+"', mathang="+maThang+", sodiendau="+sodiendau+", sodiencuoi="+sodiencuoi+" where mahd='"+mahd+"'";
        conn.executeNonQuery(sql);
    }
    public void xoaHoaDon(String mahd) throws Exception{
        String sql = "delete from hoadon where mahd='"+mahd+"'";
        conn.executeNonQuery(sql);
    }
    public double tinhTienDien(int soDienCu, int soDienMoi, String loaidien) throws SQLException{
        String sql = "select * from bactiendien where doituong='"+loaidien+"' order by sodientoithieu ASC";
        ResultSet rs = conn.GetData(sql);
        ArrayList<BacTienDien> listBTD = new ArrayList<>();
        while(rs.next()){
            BacTienDien b = new BacTienDien(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getFloat(4), rs.getString(5));
            listBTD.add(b);
        }
        float bac1 = listBTD.get(0).getGiaBan(), bac2 = listBTD.get(1).getGiaBan(), bac3 = listBTD.get(2).getGiaBan(), bac4 = listBTD.get(3).getGiaBan();
        float bac5 = listBTD.get(4).getGiaBan(), bac6 = listBTD.get(5).getGiaBan();
        
        int muc1 = listBTD.get(0).getSoDienToiDa() - listBTD.get(0).getSoDienToiThieu(), muc2 = listBTD.get(1).getSoDienToiDa() - listBTD.get(1).getSoDienToiThieu() + 1, muc3 = listBTD.get(2).getSoDienToiDa() - listBTD.get(2).getSoDienToiThieu() + 1;
        int muc4 = listBTD.get(3).getSoDienToiDa() - listBTD.get(3).getSoDienToiThieu() + 1, muc5 = listBTD.get(4).getSoDienToiDa() - listBTD.get(4).getSoDienToiThieu() + 1;
        int muc6 = listBTD.get(5).getSoDienToiThieu()-1;
        int soDienTieuThu = soDienMoi - soDienCu;
        if(soDienTieuThu <= muc1){
            return soDienTieuThu*bac1;
        }
        else if(soDienTieuThu <= muc2){
            return muc1*bac1 + (soDienTieuThu-muc1)*bac2;
        }
        else if(soDienTieuThu <= muc3){
            return muc1*bac1 + muc2*bac2 + (soDienTieuThu - muc2 -muc1)*bac3;
        }
        else if(soDienTieuThu <= muc4){
            return muc1*bac1 + muc2*bac2 + muc3*bac3 + (soDienTieuThu - muc3 -muc2- muc1)*bac4;
        }
        else if(soDienTieuThu <= muc5){
            return muc1*bac1 + muc2*bac2 + muc3*bac3 + muc4*bac4 + (soDienTieuThu - muc4 - muc3 -muc2- muc1)*bac5;
        }
        else{
            return muc1*bac1 + muc2*bac2 + muc3*bac3 + muc4*bac4 + muc5*bac5 + (soDienTieuThu - muc5 - muc4 - muc3 -muc2- muc1)* bac6;
        }
    }
}
