
package Model;

public class NguoiDung {
    protected String hoTen;
    protected String diaChi;
    protected String ngaySinh;
    protected String soCMND;
    protected String soDT;
    protected String tenTK;
    protected String matKhau;
    protected String loaiTK;
    public NguoiDung(){
        this.hoTen = "";
        this.diaChi = "";
        this.ngaySinh = "";
        this.soCMND = "";
        this.soDT = "";
        this.tenTK = "";
        this.matKhau = "";
        this.loaiTK = "";
    }

    public NguoiDung(String hoTen, String diaChi, String ngaySinh, String soCMND, String soDT, String tenTK, String matKhau, String loaiTK) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.soCMND = soCMND;
        this.soDT = soDT;
        this.tenTK = tenTK;
        this.matKhau = matKhau;
        this.loaiTK = loaiTK;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public String getSoDT() {
        return soDT;
    }

    public String getTenTK() {
        return tenTK;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public String getLoaiTK() {
        return loaiTK;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public void setLoaiTK(String loaiTK) {
        this.loaiTK = loaiTK;
    }


    
    
    
}
