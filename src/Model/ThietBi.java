
package Model;

/**
 *
 * @author Bui Quoc Anh
 */
public class ThietBi {
    private String maTB;
    private float tinhTrang;
    private String ngayLap;
    public ThietBi(){
        this.maTB = "";
        this.tinhTrang = 100;
        this.ngayLap = "";
                
    }

    public ThietBi(String maTB, float tinhTrang, String ngayLap) {
        this.maTB = maTB;
        this.tinhTrang = tinhTrang;
        this.ngayLap = ngayLap;
    }

    public String getMaTB() {
        return maTB;
    }

    public float getTinhTrang() {
        return tinhTrang;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setMaTB(String maTB) {
        this.maTB = maTB;
    }

    public void setTinhTrang(float tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }
            
    
}
