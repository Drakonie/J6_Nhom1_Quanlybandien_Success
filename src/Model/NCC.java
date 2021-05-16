
package Model;


public class NCC {
    private String maNCC;
    private String tenNCC;
    private String diaChi;
    private float giaBan;
    public NCC(){
        this.maNCC = "";
        this.tenNCC = "";
        this.diaChi = "";
        this.giaBan = 0;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }
    
}
