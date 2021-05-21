
package Controller;

import ConnectDB.Connect;
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
    
}
