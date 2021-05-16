
package Model;

public class QuanLyChiSoDien {
    private String maKh;
    private int soDienCu;
    private int soDienMoi;
    private String thangTinhTien;
    private BacTienDien bacTinhTienDien;
    
    public QuanLyChiSoDien(){
        maKh = "";
        soDienCu = 0;
        soDienMoi = 0;
        thangTinhTien = "";
        bacTinhTienDien = new BacTienDien();
    }

    public QuanLyChiSoDien(String maKh, int soDienCu, int soDienMoi, String thangTinhTien, BacTienDien bacTinhTienDien) {
        this.maKh = maKh;
        this.soDienCu = soDienCu;
        this.soDienMoi = soDienMoi;
        this.thangTinhTien = thangTinhTien;
        this.bacTinhTienDien = bacTinhTienDien;
    }
    
    public int getLuongdientieuthu(){
        return soDienMoi - soDienCu;
    }
    public void reFreshSoDien(){
        soDienCu += soDienMoi;
    }
    
//    public float getTienDien(){
//        
//    }
    
    
    public String getMaKh() {
        return maKh;
    }

    public int getSoDienCu() {
        return soDienCu;
    }

    public int getSoDienMoi() {
        return soDienMoi;
    }

    public String getThangTinhTien() {
        return thangTinhTien;
    }

    public BacTienDien getBacTinhTienDien() {
        return bacTinhTienDien;
    }

    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }

    public void setSoDienCu(int soDienCu) {
        this.soDienCu = soDienCu;
    }

    public void setSoDienMoi(int soDienMoi) {
        this.soDienMoi = soDienMoi;
    }

    public void setThangTinhTien(String thangTinhTien) {
        this.thangTinhTien = thangTinhTien;
    }

    public void setBacTinhTienDien(BacTienDien bacTinhTienDien) {
        this.bacTinhTienDien = bacTinhTienDien;
    }
    
}
