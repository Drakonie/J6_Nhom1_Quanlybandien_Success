
package Model;

/**
 *
 * @author Bui Quoc Anh
 */
public class NCC {
    private String maNCC;
    private String tenNCC;
    private String diaChiNCC;
    private float giaBan;
    
    public NCC(){
        this.maNCC = "";
        this.tenNCC = "";
        this.diaChiNCC = "";
        this.giaBan = 0;
    }

    public NCC(String maNCC, String tenNCC, String diaChiNCC, float giaBan) {
        this.maNCC = maNCC;
        this.tenNCC = tenNCC;
        this.diaChiNCC = diaChiNCC;
        this.giaBan = giaBan;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public String getDiaChiNCC() {
        return diaChiNCC;
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

    public void setDiaChiNCC(String diaChiNCC) {
        this.diaChiNCC = diaChiNCC;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }
    
    
}
