
package Model;

/**
 *
 * @author Bui Quoc Anh
 */
public class HoaDon {
    private String maHD;
    private KhachHang kh;
    private NguoiQuanTri nqt;
    private QuanLyChiSoDien qlcsd;
    private NCC ncc;
    
    public HoaDon(){
        maHD = "";
        kh = new KhachHang();
        nqt = new NguoiQuanTri();
        qlcsd = new QuanLyChiSoDien();
        ncc = new NCC();
    }

    public HoaDon(String maHD, KhachHang kh, NguoiQuanTri nqt, QuanLyChiSoDien qlcsd, NCC ncc) {
        this.maHD = maHD;
        this.kh = kh;
        this.nqt = nqt;
        this.qlcsd = qlcsd;
        this.ncc = ncc;
    }
    
}
