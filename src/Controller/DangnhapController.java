/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ConnectDB.Connect;
import Model.NguoiDung;
import Model.TaiKhoan;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class DangnhapController {
    Connect conn = new Connect();
    public DangnhapController(){
        conn.getConnect();
    }
    public ArrayList<TaiKhoan> getlist_admin() throws Exception{
        String sql = "select USERNAME, PASSWORD, LOAITK from NGUOIDUNG";
        ArrayList<TaiKhoan> templist = new ArrayList<>();
        ResultSet rs = conn.GetData(sql);
        while(rs.next()){
            TaiKhoan tk = new TaiKhoan();
            tk.setUserName(rs.getString("USERNAME"));
            tk.setPassWord(rs.getString("PASSWORD"));
            tk.setLoaiTK(rs.getString("LOAITK"));
            templist.add(tk);
        }
        return templist;
    }
}
