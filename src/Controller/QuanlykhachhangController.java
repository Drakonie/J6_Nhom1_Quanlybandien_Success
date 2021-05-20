/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ConnectDB.Connect;
import Model.NguoiDung;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.derby.client.am.SqlException;
/**
 *
 * @author Admin
 */
public class QuanlykhachhangController {
    Connect conn = new Connect();
    Statement st = null;
    ResultSet rs = null;
    public QuanlykhachhangController(){
        conn.getConnect();
    }
    public ArrayList<NguoiDung> getList_qlkh() throws SQLException{
        ArrayList<NguoiDung> tempList = new ArrayList<>();
        String sql = "Select * from nguoidung";
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
    public void themKH(){
        
    }
}
