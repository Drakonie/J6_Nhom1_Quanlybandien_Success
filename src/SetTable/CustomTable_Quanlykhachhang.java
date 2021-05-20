package SetTable;




import Model.NguoiDung;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
//import PhongThi_ThiSinh.ThiSinh;
/**
 *Data model đảm nhận nhiệm vụ cung cấp dữ liệu hiển thị cho JTable. 
 * Sử dụng data model giúp ứng dụng “MVC” hơn bằng việc tách riêng phần 
 * data và phần UI, tạo ra sự custom tốt hơn cho những bài toán phức tạp.
 Về cơ bản, một data model được cài đặt 9 phương thức do interface 
 * TableModel 
 * định nghĩa. Các phương thức đó được liệt kê trong hình dưới đây:
 getRowCout():int
 * getColumnCount():int
 * getValueAt(row, column): object
 * getColumnName(column:int):String
 * getColumnClass(column:int):class
 * isCellEditable(row:int, column:int):boolean
 * addTableModelListener(listener:TableModelListener):void
 * removeTableeModelListener(listener:tablleModelListener):void
 
 */
public class CustomTable_Quanlykhachhang extends AbstractTableModel
{
    //Khai báo xâu chứa tiêu đề của bảng.
    private String name[]={"Mã KH","Họ tên","Số CMND", "Ngày Sinh", "Địa chỉ", "Số ĐT", "Ngày Đky", "Trạng thái thanh toán", "Mục đích sd", "Loại tài khoản", "Tên đăng nhập", "Mật khẩu"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[]={String.class,String.class,String.class,String.class, String.class, String.class, String.class, Integer.class, String.class, String.class, String.class, String.class};
    //Tạo một đối tượng arrayList có tên listThiSinh.
    ArrayList<NguoiDung> ds=new ArrayList<NguoiDung>();

    //phương thức khởi tạo cho class có tham số truyền vào.
    public CustomTable_Quanlykhachhang(ArrayList<NguoiDung> listPTB2)
    {
       this.ds=listPTB2;
    }


    //lấy số phần tử của listThiSinh
    @Override
    public int getRowCount()
    {
        return ds.size();
    }
    //Lấy số lượng tiêu để của mảng.
    @Override
    public int getColumnCount()
    {
        return name.length;
    }
    //Đưa thông tin của phần tử trong arrayList lên jTable
    public Object getValueAt(int rowIndex,int columnIndex)
    {
        switch(columnIndex)
        {
            //"Mã KH","Họ tên","Số CMND", "Ngày Sinh", "Địa chỉ", "Số ĐT", "Ngày Đky", "Trạng thái thanh toán", "Loại tài khoản", "Tên đăng nhập", "Mật khẩu"
            //Cột số a
            case 0: return ds.get(rowIndex).getMaNguoiDung();
            //Cột b
            case 1: return ds.get(rowIndex).getHoTen();
            //cột c
            case 2: return ds.get(rowIndex).getSoCMT();
            //cột kq
            case 3: return ds.get(rowIndex).getNgaySinh();
            
            case 4: return ds.get(rowIndex).getDiaChi();
            case 5: return ds.get(rowIndex).getSoDienThoai();
            case 6: return ds.get(rowIndex).getNgayDangKy();
            case 7: return ds.get(rowIndex).getDoiTuong();
            case 8: return ds.get(rowIndex).getThanhToan();
            
            
            
            case 9: return ds.get(rowIndex).getTaiKhoan().getUserName();
            case 10: return ds.get(rowIndex).getTaiKhoan().getPassWord();
            default :return null;
        }
    }
    @Override
    public Class getColumnClass(int columnIndex)
    {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column)
    {
        return name[column];
    }
}
