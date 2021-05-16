
package Model;


public class ThietBi {
    public String maTB;
    public String tenTB;
    public String loaiTB;
    public String tinhTrang;
    
    public ThietBi(){
        this.maTB = "";
        this.tenTB = "";
        this.loaiTB = "";
        this.tinhTrang = "";
    }

    public ThietBi(String maTB, String tenTB, String loaiTB, String tinhTrang) {
        this.maTB = maTB;
        this.tenTB = tenTB;
        this.loaiTB = loaiTB;
        this.tinhTrang = tinhTrang;
    }

    public String getMaTB() {
        return maTB;
    }

    public String getTenTB() {
        return tenTB;
    }

    public String getLoaiTB() {
        return loaiTB;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setMaTB(String maTB) {
        this.maTB = maTB;
    }

    public void setTenTB(String tenTB) {
        this.tenTB = tenTB;
    }

    public void setLoaiTB(String loaiTB) {
        this.loaiTB = loaiTB;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
}
