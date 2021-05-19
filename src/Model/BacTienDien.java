
package Model;

/**
 *
 * @author Bui Quoc Anh
 */
public class BacTienDien {
    private int soDienToiThieu;
    private int soDienToiDa;
    private float giaBan;
    private String doiTuong;
    
    
    public BacTienDien(){
        this.soDienToiDa = 0;
        this.soDienToiThieu = 0;
        this.giaBan = 0;
        this.doiTuong = "";
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
