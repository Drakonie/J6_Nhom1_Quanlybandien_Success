
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
            BacTienDien b = new BacTienDien(rs.getString("mabac"), rs.getInt("sodientoithieu"), rs.getInt("sodientoida"), rs.getFloat("giaban"), rs.getString("doituong"));
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
}
