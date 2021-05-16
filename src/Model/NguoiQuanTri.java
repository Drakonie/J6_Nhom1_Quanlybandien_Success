
package Model;


public class NguoiQuanTri extends NguoiDung {
    private String maNQT;
    
    public NguoiQuanTri(){
        super();
        this.maNQT = "";
    }

    public NguoiQuanTri(String maNQT, String hoTen, String diaChi, String ngaySinh, String soCMND, String soDT, String tenTK, String matKhau, String loaiTK) {
        super(hoTen, diaChi, ngaySinh, soCMND, soDT, tenTK, matKhau, loaiTK);
        this.maNQT = maNQT;
    }

    

    public String getMaNQT() {
        return maNQT;
    }

    public void setMaNQT(String maNQT) {
        this.maNQT = maNQT;
    }

    
    
}
