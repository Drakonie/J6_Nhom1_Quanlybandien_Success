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

/**
 *
 * @author Admin
 */
public class QuanlynoController {
    Connect conn = new Connect();
    public QuanlynoController(){
        conn.getConnect();
    }
    public ArrayList<NguoiDung> getlist_qlno(int mathang) throws SQLException{
        ArrayList<NguoiDung> templist = new ArrayList<>();
        String sql = "select NGUOIDUNG.MANGUOIDUNG, HOTEN, DIACHI, THANHTOAN, MATHANG from NGUOIDUNG inner join HOADON on NGUOIDUNG.MANGUOIDUNG = HOADON.MANGUOIDUNG where mathang = "+mathang+"";
        ResultSet rs = conn.GetData(sql);
        while(rs.next()){
            String mand, hoten, diachi;
            int tt;
            mand = rs.getString("MANGUOIDUNG");
            hoten = rs.getString("HOTEN");
            diachi = rs.getString("DIACHI");
            tt = rs.getInt("THANHTOAN");
            NguoiDung nd = new NguoiDung(mand, hoten, diachi, tt);
            templist.add(nd);
        }
        return templist;
    }
    public int soSanh_mathang(int mathang) throws SQLException{
        int kq = 0;
        String sql = "select * from NGUOIDUNG inner join HOADON on NGUOIDUNG.MANGUOIDUNG = HOADON.MANGUOIDUNG";
        ResultSet rs = conn.GetData(sql);
        while(rs.next()){
            if(rs.getInt("MATHANG") == mathang)
                kq++;
        }
        return kq;
    }
    public void updateTT(String mand) throws Exception{
        String sql = "update NGUOIDUNG set THANHTOAN = "+1+" where MANGUOIDUNG = '"+mand+"'";
        conn.executeNonQuery(sql);
    }
}
