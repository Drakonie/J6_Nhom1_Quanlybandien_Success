
package Controller;

import ConnectDB.Connect;
import Model.BacTienDien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Bui Quoc Anh
 */
public class QuanlybactiendienController {
    Connect conn = new Connect();
    public QuanlybactiendienController(){
        conn.getConnect();
    }
    public ArrayList<BacTienDien> getListBacTienDien() throws SQLException{
        ArrayList<BacTienDien> tempList = new ArrayList<>();
        String sql = "select * from bactiendien order by sodientoithieu asc";
        ResultSet rs = conn.GetData(sql);
        while(rs.next()){
            BacTienDien b = new BacTienDien(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getFloat(4), rs.getString(5));
            tempList.add(b);
        }
        return tempList;
    }
    
    public void themBacTienDien(String maBac, int sodientoithieu, int sodientoida, float giaban, String doituong) throws Exception{
        String sql = "insert into bactiendien values('"+maBac+"', "+sodientoithieu+", "+sodientoida+", "+giaban+", '"+doituong+"')";
        conn.executeNonQuery(sql);
    }
    public void suaBacTienDien(String mabac, int sodientoithieu, int sodientoida, float giaban, String doituong) throws Exception{
        String sql = "update bactiendien set sodientoithieu="+sodientoithieu+", sodientoida="+sodientoida+", giaban="+giaban+", doituong='"+doituong+"' where mabac='"+mabac+"'";
        conn.executeNonQuery(sql);
    }
    public void xoaBacTienDien(String mabac, String doituong) throws Exception{
        String sql = "delete from bactiendien where doituong='"+doituong+"' and mabac='"+mabac+"'";
        conn.executeNonQuery(sql);
    }
    
    
    public ArrayList<BacTienDien> findByMaBac(String mabac) throws SQLException{
        ArrayList<BacTienDien> tempList = new ArrayList<>();
        String sql = "select * from BacTienDien where mabac='"+mabac+"'";
        ResultSet rs = conn.GetData(sql);
        while(rs.next()){
            BacTienDien b = new BacTienDien(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getFloat(4), rs.getString(5));
            tempList.add(b);
        }
        return tempList;
    }
    public ArrayList<BacTienDien> findByDOiTuong(String doituong) throws SQLException{
        ArrayList<BacTienDien> tempList = new ArrayList<>();
        String sql = "select * from BacTienDien where doituong='"+doituong+"'";
        ResultSet rs = conn.GetData(sql);
        while(rs.next()){
            BacTienDien b = new BacTienDien(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getFloat(4), rs.getString(5));
            tempList.add(b);
        }
        return tempList;
    }
    
    public ArrayList<BacTienDien> findByMaBac_DoiTuong(String maBac, String doituong) throws SQLException{
        ArrayList<BacTienDien> tempList = new ArrayList<>();
        String sql = "select * from BacTienDien where mabac='"+maBac+"' and doituong='"+doituong+"'";
        ResultSet rs = conn.GetData(sql);
        while(rs.next()){
            BacTienDien b = new BacTienDien(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getFloat(4), rs.getString(5));
            tempList.add(b);
        }
        return tempList;
    }
}
