
package Model;



/**
 *
 * @author Bui Quoc Anh
 */
public class QuanLyChiSoDien {
    private String maThang;
    private int soDienCu;
    private int soDienMoi;
    BacTienDien bacTienDien;
    
    
    public QuanLyChiSoDien(){
        this.maThang = "";
        this.soDienCu = 0;
        this.soDienMoi = 0;
        this.bacTienDien = new BacTienDien();
    }

    public QuanLyChiSoDien(String maThang, int soDienCu, int soDienMoi, BacTienDien bacTienDien) {
        this.maThang = maThang;
        this.soDienCu = soDienCu;
        this.soDienMoi = soDienMoi;
        this.bacTienDien = bacTienDien;
    }

    public String getMaThang() {
        return maThang;
    }

    public int getSoDienCu() {
        return soDienCu;
    }

    public int getSoDienMoi() {
        return soDienMoi;
    }

    public BacTienDien getBacTienDien() {
        return bacTienDien;
    }

    public void setMaThang(String maThang) {
        this.maThang = maThang;
    }

    public void setSoDienCu(int soDienCu) {
        this.soDienCu = soDienCu;
    }

    public void setSoDienMoi(int soDienMoi) {
        this.soDienMoi = soDienMoi;
    }

    public void setBacTienDien(BacTienDien bacTienDien) {
        this.bacTienDien = bacTienDien;
    }
    
}
