/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ConnectDB.Connect;
import Model.NCC;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Admin
 */
public class QuanlymuadienController {
    Connect conn = new Connect();
    public QuanlymuadienController(){
        conn.getConnect();
    }
    public ArrayList<NCC> getlist_ncc() throws SQLException{
        ArrayList<NCC> tempList = new ArrayList<>();
        String sql = "Select * from NCC";
        ResultSet rs = conn.GetData(sql);
        while(rs.next()){
            NCC ncc = new NCC();
            ncc.setMaNCC(rs.getString("MANCC"));
            ncc.setTenNCC(rs.getString("TENNCC"));
            ncc.setDiaChiNCC(rs.getString("DIACHINCC"));
            ncc.setGiaBan(rs.getFloat("DONGIANCC"));
            tempList.add(ncc);
        }
        return tempList;
    }
    public void themNCC(String ma, String ten, String diachi, int dongia) throws Exception{
        String sql = "insert into NCC (mancc, tenncc, diachincc, dongiancc) values ('"+ma+"', '"+ten+"', '"+diachi+"', "+dongia+")";
        conn.executeNonQuery(sql);
    }
    public void suaNCC(String ma, String ten, String diachi, int dongia) throws Exception{
        String sql = "update NCC set tenncc = '"+ten+"', diachincc = '"+diachi+"',dongiancc = "+dongia+" where mancc = '"+ma+"'";
        conn.executeNonQuery(sql);
    }
    public void xoaNCC(String ma) throws Exception{
        String sql = "delete from NCC where mancc = '"+ma+"'";
        conn.executeNonQuery(sql);
    }
}
