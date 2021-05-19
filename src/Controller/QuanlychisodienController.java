
package Controller;

import ConnectDB.Connect;
import Model.BacTienDien;
import Model.QuanLyChiSoDien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class QuanlychisodienController {
    
    Connect conn = new Connect();
    public QuanlychisodienController(){
        conn.getConnect();
    }
    public ArrayList<QuanLyChiSoDien> getListFromJDBC(){
        ArrayList<QuanLyChiSoDien> tempList = new ArrayList<>();
        try{
            String sql = "select * from QUANLYCHISODIEN";
            ResultSet rst = conn.GetData(sql);
            while(rst.next()){
                //String maKh, int soDienCu, int soDienMoi, String thangTinhTien, BacTienDien bacTinhTienDien
                BacTienDien btd = new BacTienDien(0, 0, 0, 0, 0, 0, sql)
                QuanLyChiSoDien qlcsd = new QuanLyChiSoDien(rst.getString("MAKH"), rst.getString("SODIENCU"), rst.getString("SODIENMOI"), );
                
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Lỗi không thể lấy dữ liệu từ bảng quản lý chỉ số điện");
        }
        
    }
}
