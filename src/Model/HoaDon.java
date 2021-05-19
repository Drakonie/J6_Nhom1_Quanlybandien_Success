
package Model;

/**
 *
 * @author Bui Quoc Anh
 */
public class HoaDon {
    private String maHD;
    private NguoiDung nguoiDung;
    
    
    public HoaDon(){
        this.maHD = "";
        this.nguoiDung = new NguoiDung();
    }

    public HoaDon(String maHD, NguoiDung nguoiDung) {
        this.maHD = maHD;
        this.nguoiDung = nguoiDung;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public NguoiDung getNguoiDung() {
        return nguoiDung;
    }

    public void setNguoiDung(NguoiDung nguoiDung) {
        this.nguoiDung = nguoiDung;
    }
    
    
}
