
package Controller;

import ConnectDB.Connect;
import Model.NguoiDung;
import Model.ThietBi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Bui Quoc Anh
 */
public class QuanlythietbiController {
    Connect conn = new Connect();
    public QuanlythietbiController(){
        conn.getConnect();
    }
    public ArrayList<NguoiDung> getListThietBi() throws SQLException{
        ArrayList<NguoiDung> tempList = new ArrayList<>();
        String sql = "select * from nguoidung";
        ResultSet rs = conn.GetData(sql);
        while(rs.next()){
            ThietBi tb = new ThietBi(rs.getString("matb"), rs.getInt("tinhtrang"), rs.getDate("ngaylapdat").toString());
            NguoiDung nd = new NguoiDung();
            nd.setMaNguoiDung(rs.getString("MANGUOIDUNG"));
            nd.setHoTen(rs.getString("HOTEN"));
            nd.setSoCMT(rs.getString("SOCMT"));
            nd.setNgaySinh(rs.getDate("NGAYSINH").toString());
            nd.setSoDienThoai(rs.getString("SODT"));
            nd.setNgayDangKy(rs.getDate("NGAYDK").toString());
            nd.setThanhToan(rs.getInt("THANHTOAN"));
            nd.setDoiTuong(rs.getString("DOITUONG"));
            nd.setThietBi(tb);
            nd.getTaiKhoan().setUserName(rs.getString("USERNAME"));
            nd.getTaiKhoan().setPassWord(rs.getString("PASSWORD"));
            nd.getTaiKhoan().setLoaiTK(String.valueOf(rs.getInt("LOAITK")));
            nd.setDiaChi(rs.getString("DIACHI"));
            tempList.add(nd);
        }
        return tempList;
    }
    public void updateThietBi(String makh, String matb, double tinhtrang, String ngaylap) throws Exception{
        String sql = "update nguoidung set matb='"+matb+"', tinhtrang = "+tinhtrang+", ngaylapdat='"+ngaylap+"' where manguoidung='"+makh+"'";
        conn.executeNonQuery(sql);
        
    }
    public ArrayList<NguoiDung> findByMakh(String makh) throws SQLException{
        String sql = "select * from nguoidung where manguoidung = '"+makh+"'";
        ResultSet rs = conn.GetData(sql);
        ArrayList<NguoiDung> tempList = new ArrayList<>();
        while(rs.next()){
             ThietBi tb = new ThietBi(rs.getString("matb"), rs.getInt("tinhtrang"), rs.getDate("ngaylapdat").toString());
            NguoiDung nd = new NguoiDung();
            nd.setMaNguoiDung(rs.getString("MANGUOIDUNG"));
            nd.setHoTen(rs.getString("HOTEN"));
            nd.setSoCMT(rs.getString("SOCMT"));
            nd.setNgaySinh(rs.getDate("NGAYSINH").toString());
            nd.setSoDienThoai(rs.getString("SODT"));
            nd.setNgayDangKy(rs.getDate("NGAYDK").toString());
            nd.setThanhToan(rs.getInt("THANHTOAN"));
            nd.setDoiTuong(rs.getString("DOITUONG"));
            nd.setThietBi(tb);
            nd.getTaiKhoan().setUserName(rs.getString("USERNAME"));
            nd.getTaiKhoan().setPassWord(rs.getString("PASSWORD"));
            nd.getTaiKhoan().setLoaiTK(String.valueOf(rs.getInt("LOAITK")));
            nd.setDiaChi(rs.getString("DIACHI"));
            tempList.add(nd);
        }
        return tempList;
    }
    public ArrayList<NguoiDung> findByNgayLap(String ngaylap) throws SQLException{
        String sql = "select * from nguoidung where ngaylapdat = '"+ngaylap+"'";
        ResultSet rs = conn.GetData(sql);
        ArrayList<NguoiDung> tempList = new ArrayList<>();
        while(rs.next()){
             ThietBi tb = new ThietBi(rs.getString("matb"), rs.getInt("tinhtrang"), rs.getDate("ngaylapdat").toString());
            NguoiDung nd = new NguoiDung();
            nd.setMaNguoiDung(rs.getString("MANGUOIDUNG"));
            nd.setHoTen(rs.getString("HOTEN"));
            nd.setSoCMT(rs.getString("SOCMT"));
            nd.setNgaySinh(rs.getDate("NGAYSINH").toString());
            nd.setSoDienThoai(rs.getString("SODT"));
            nd.setNgayDangKy(rs.getDate("NGAYDK").toString());
            nd.setThanhToan(rs.getInt("THANHTOAN"));
            nd.setDoiTuong(rs.getString("DOITUONG"));
            nd.setThietBi(tb);
            nd.getTaiKhoan().setUserName(rs.getString("USERNAME"));
            nd.getTaiKhoan().setPassWord(rs.getString("PASSWORD"));
            nd.getTaiKhoan().setLoaiTK(String.valueOf(rs.getInt("LOAITK")));
            nd.setDiaChi(rs.getString("DIACHI"));
            tempList.add(nd);
        }
        return tempList;
    }
    public ArrayList<NguoiDung> findByMakh_NgayLap(String makh, String ngaylap) throws SQLException{
         String sql = "select * from nguoidung where manguoidung = '"+makh+"' and ngaylapdat = '"+ngaylap+"'";
        ResultSet rs = conn.GetData(sql);
        ArrayList<NguoiDung> tempList = new ArrayList<>();
        while(rs.next()){
             ThietBi tb = new ThietBi(rs.getString("matb"), rs.getInt("tinhtrang"), rs.getDate("ngaylapdat").toString());
            NguoiDung nd = new NguoiDung();
//            nd.setMaNguoiDung(rs.getString("MANGUOIDUNG"));
//            nd.setHoTen(rs.getString("HOTEN"));
//            nd.setSoCMT(rs.getString("SOCMT"));
//            nd.setNgaySinh(rs.getDate("NGAYSINH").toString());
//            nd.setSoDienThoai(rs.getString("SODT"));
//            nd.setNgayDangKy(rs.getDate("NGAYDK").toString());
//            nd.setThanhToan(rs.getInt("THANHTOAN"));
//            nd.setDoiTuong(rs.getString("DOITUONG"));
            nd.setThietBi(tb);
            nd.getTaiKhoan().setUserName(rs.getString("USERNAME"));
            nd.getTaiKhoan().setPassWord(rs.getString("PASSWORD"));
            nd.getTaiKhoan().setLoaiTK(String.valueOf(rs.getInt("LOAITK")));
            nd.setDiaChi(rs.getString("DIACHI"));
            tempList.add(nd);
        }
        return tempList;
    }
}
