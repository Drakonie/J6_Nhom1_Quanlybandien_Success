
package Model;

/**
 *
 * @author Bui Quoc Anh
 */
public class BacTienDien {
    private String maBac;
    private int soDienToiThieu;
    private int soDienToiDa;
    private float giaBan;
    private String doiTuong;
    
    
    public BacTienDien(){
        this.maBac = "";
        this.soDienToiDa = 0;
        this.soDienToiThieu = 0;
        this.giaBan = 0;
        this.doiTuong = "";
    }

    public BacTienDien(String maBac, int soDienToiThieu, int soDienToiDa, float giaBan, String doiTuong) {
        this.maBac = maBac;
        this.soDienToiThieu = soDienToiThieu;
        this.soDienToiDa = soDienToiDa;
        this.giaBan = giaBan;
        this.doiTuong = doiTuong;
    }

    public String getMaBac() {
        return maBac;
    }

    public int getSoDienToiThieu() {
        return soDienToiThieu;
    }

    public int getSoDienToiDa() {
        return soDienToiDa;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setMaBac(String maBac) {
        this.maBac = maBac;
    }

    public void setSoDienToiThieu(int soDienToiThieu) {
        this.soDienToiThieu = soDienToiThieu;
    }

    public void setSoDienToiDa(int soDienToiDa) {
        this.soDienToiDa = soDienToiDa;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }
    
    
}
