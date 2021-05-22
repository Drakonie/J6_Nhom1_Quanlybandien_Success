/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ConnectDB.Connect;
import Model.NguoiDung;
import java.sql.Date;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class QuanlykhachhangController {
    Connect conn = new Connect();
    
    public QuanlykhachhangController(){
        conn.getConnect();
    }
    public ArrayList<NguoiDung> getList_qlkh() throws SQLException{
        ArrayList<NguoiDung> tempList = new ArrayList<>();
        String sql = "Select * from nguoidung where loaitk = "+0+"";
        ResultSet rs = conn.GetData(sql);
        while(rs.next()){
            NguoiDung nd = new NguoiDung();
            nd.setMaNguoiDung(rs.getString("MANGUOIDUNG"));
            nd.setHoTen(rs.getString("HOTEN"));
            nd.setSoCMT(rs.getString("SOCMT"));
            nd.setNgaySinh(rs.getDate("NGAYSINH").toString());
            nd.setSoDienThoai(rs.getString("SODT"));
            nd.setNgayDangKy(rs.getDate("NGAYDK").toString());
            nd.setThanhToan(rs.getInt("THANHTOAN"));
            nd.setDoiTuong(rs.getString("DOITUONG"));
            nd.getTaiKhoan().setUserName(rs.getString("USERNAME"));
            nd.getTaiKhoan().setPassWord(rs.getString("PASSWORD"));
            nd.getTaiKhoan().setLoaiTK(String.valueOf(rs.getInt("LOAITK")));
            nd.setDiaChi(rs.getString("DIACHI"));
            tempList.add(nd);
        }
        return tempList;
    }
    public void themKH(String makh, String hoten, String socmt, Date ns, String sodt, Date ngaydk, int tt, String doituong, String username, String password, int loaitk, String diachi) throws Exception{
        String sql = "insert into nguoidung (manguoidung, hoten, socmt, ngaysinh, sodt, ngaydk, thanhtoan, doituong, username, password, loaitk, diachi) values ('"+makh+"', '"+hoten+"', '"+socmt+"', '"+ns+"', '"+sodt+"', '"+ngaydk+"', "+tt+", '"+doituong+"', '"+username+"', '"+password+"', "+loaitk+", '"+diachi+"') ";
        conn.executeNonQuery(sql);
    }
    public void suaKH(String makh, String hoten, String socmt, Date ns, String sodt, Date ngaydk, int tt, String doituong, String username, String password, int loaitk, String diachi) throws Exception{
        String sql = "update nguoidung set hoten = '"+hoten+"', socmt = '"+socmt+"', ngaysinh = '"+ns+"', sodt = '"+sodt+"', ngaydk = '"+ngaydk+"', thanhtoan = "+tt+", doituong = '"+doituong+"', username = '"+username+"', password = '"+password+"', loaitk = "+loaitk+", diachi = '"+diachi+"' where manguoidung = '"+makh+"'";
        conn.executeNonQuery(sql);
    }
    public void xoaKH(String makh) throws Exception{
        String sql = "delete from nguoidung where manguoidung = '"+makh+"'";
        conn.executeNonQuery(sql);
    }
    public ArrayList<NguoiDung> getlist_timKH(String makh) throws Exception{
        String sql = "Select * from nguoidung where manguoidung = '"+makh+"'";
        ArrayList<NguoiDung> tempList = new ArrayList<>();
        ResultSet rs = conn.GetData(sql);
        while(rs.next()){
            NguoiDung nd = new NguoiDung();
            nd.setMaNguoiDung(rs.getString("MANGUOIDUNG"));
            nd.setHoTen(rs.getString("HOTEN"));
            nd.setSoCMT(rs.getString("SOCMT"));
            nd.setNgaySinh(rs.getDate("NGAYSINH").toString());
            nd.setSoDienThoai(rs.getString("SODT"));
            nd.setNgayDangKy(rs.getDate("NGAYDK").toString());
            nd.setThanhToan(rs.getInt("THANHTOAN"));
            nd.setDoiTuong(rs.getString("DOITUONG"));
            nd.getTaiKhoan().setUserName(rs.getString("USERNAME"));
            nd.getTaiKhoan().setPassWord(rs.getString("PASSWORD"));
            nd.getTaiKhoan().setLoaiTK(String.valueOf(rs.getInt("LOAITK")));
            nd.setDiaChi(rs.getString("DIACHI"));
            tempList.add(nd);
        }
        return tempList;
    }
}
