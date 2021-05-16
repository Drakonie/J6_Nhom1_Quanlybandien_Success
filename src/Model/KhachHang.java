
package Model;


public class KhachHang extends NguoiDung{
    private String maKH;
    private ThietBi tb;
    private String ngayDKy;
    private int trangThai;

    public KhachHang(){
        super();
        this.maKH = "";
        tb = new ThietBi();
        this.ngayDKy = "";
        this.trangThai = 1;
    }

    public KhachHang(String maKH, ThietBi tb, String ngayDKy, int trangThai, String hoTen, String diaChi, String ngaySinh, String soCMND, String soDT, String tenTK, String matKhau, String loaiTK) {
        super(hoTen, diaChi, ngaySinh, soCMND, soDT, tenTK, matKhau, loaiTK);
        this.maKH = maKH;
        this.tb = tb;
        this.ngayDKy = ngayDKy;
        this.trangThai = trangThai;
    }

    

    public String getMaKH() {
        return maKH;
    }

    public ThietBi getTb() {
        return tb;
    }

    public String getNgayDKy() {
        return ngayDKy;
    }

    public int getTrangThaiHD() {
        return trangThai;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public void setTb(ThietBi tb) {
        this.tb = tb;
    }

    public void setNgayDKy(String ngayDKy) {
        this.ngayDKy = ngayDKy;
    }

    public void setTrangThaiHD(int trangThai) {
        this.trangThai = trangThai;
    }
    
}
