
package Controller;

import ConnectDB.Connect;
import Model.HoaDon;
import Model.NguoiDung;
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
    public ArrayList<HoaDon> getList_Chisodien() throws SQLException{
        ArrayList<HoaDon> tempList = new ArrayList<>();
        String sql = "select * from hoadon inner join nguoidung on hoadon.manguoidung = nguoidung.manguoidung inner join thang on hoadon.mathang = nguoidung.mathang";
        ResultSet rs = conn.GetData(sql);
        while(rs.next()){
            //String maHD, NguoiDung nguoiDung, Thang thang, int soDienDau, int soDienCuoi
            NguoiDung nguoiDung = new NguoiDung(rs.getString("manguoidung"))
            HoaDon hd = new HoaDon(rs.getString(1), nguoiDung, rs.getStringThang, 0, 0)
            tempList.add();
        }
    }
}
