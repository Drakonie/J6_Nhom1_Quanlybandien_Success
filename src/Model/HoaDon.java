
package Model;

/**
 *
 * @author Bui Quoc Anh
 */
public class HoaDon {
    private String maHD;
    private NguoiDung nguoiDung;
    
    Thang thang;
    int soDienDau;
    int soDienCuoi;
            
    
    public HoaDon(){
        this.maHD = "";
        this.nguoiDung = new NguoiDung();
        
        this.thang = new Thang();
        this.soDienDau = 0;
        this.soDienCuoi = 0;
    }

    public HoaDon(String maHD, NguoiDung nguoiDung, Thang thang, int soDienDau, int soDienCuoi) {
        this.maHD = maHD;
        this.nguoiDung = nguoiDung;
        
        this.thang = thang;
        this.soDienDau = soDienDau;
        this.soDienCuoi = soDienCuoi;
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


    public Thang getThang() {
        return thang;
    }

    public void setThang(Thang thang) {
        this.thang = thang;
    }

    public int getSoDienDau() {
        return soDienDau;
    }

    public void setSoDienDau(int soDienDau) {
        this.soDienDau = soDienDau;
    }

    public int getSoDienCuoi() {
        return soDienCuoi;
    }

    public void setSoDienCuoi(int soDienCuoi) {
        this.soDienCuoi = soDienCuoi;
    }

    


    
}
