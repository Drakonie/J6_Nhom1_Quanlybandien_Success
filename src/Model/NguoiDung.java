
package Model;



/**
 *
 * @author Bui Quoc Anh
 */
public class NguoiDung {
    private String maNguoiDung;
    private String hoTen;
    private String soCMT;
    private String ngaySinh;
    private String diaChi;
    private String soDienThoai;
    private String ngayDangKy;
    private int thanhToan;
    private String doiTuong;
    ThietBi thietBi;
    TaiKhoan taiKhoan;
    
    
    
    public NguoiDung(){
        this.maNguoiDung = "";
        this.hoTen = "";
        this.soCMT = "";
        this.ngaySinh = "";
        this.diaChi = "";
        this.soDienThoai = "";
        this.ngayDangKy = "";
        this.thanhToan = 1;
        this.doiTuong = "";
        this.thietBi = new ThietBi();
        this.taiKhoan = new TaiKhoan();
        
        
    }

    public NguoiDung(String maNguoiDung, String hoTen, String soCMT, String ngaySinh, String diaChi, String soDienThoai, String ngayDangKy, int thanhToan, String doiTuong, ThietBi thietBi, TaiKhoan taiKhoan) {
        this.maNguoiDung = maNguoiDung;
        this.hoTen = hoTen;
        this.soCMT = soCMT;
        this.ngaySinh = "";
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.ngayDangKy = ngayDangKy;
        this.thanhToan = thanhToan;
        this.doiTuong = doiTuong;
        
        this.thietBi = thietBi;
        this.taiKhoan = taiKhoan;
        
    }

    public String getMaNguoiDung() {
        return maNguoiDung;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getSoCMT() {
        return soCMT;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public String getNgayDangKy() {
        return ngayDangKy;
    }

    public int getThanhToan() {
        return thanhToan;
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public ThietBi getCongToDien() {
        return thietBi;
    }

    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }



    public void setMaNguoiDung(String maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setSoCMT(String soCMT) {
        this.soCMT = soCMT;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setNgayDangKy(String ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    public void setThanhToan(int thanhToan) {
        this.thanhToan = thanhToan;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    public void setCongToDien(ThietBi thietBi) {
        this.thietBi = thietBi;
    }

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }


    
}
