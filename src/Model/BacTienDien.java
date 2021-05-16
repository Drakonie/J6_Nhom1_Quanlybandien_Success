
package Model;


public class BacTienDien {
    private float giaB1;
    private float giaB2;
    private float giaB3;
    private float giaB4;
    private float giaB5;
    private float giaB6;
    private String doiTuongDC;

    public BacTienDien(){
        this.giaB1 = 0;
        this.giaB2 = 0;
        this.giaB3 = 0;
        this.giaB4 = 0;
        this.giaB5 = 0;
        this.giaB6 = 0;
        this.doiTuongDC = "";
    }
    public BacTienDien(float giaB1, float giaB2, float giaB3, float giaB4, float giaB5, float giaB6, String doiTuongDC) {
        this.giaB1 = giaB1;
        this.giaB2 = giaB2;
        this.giaB3 = giaB3;
        this.giaB4 = giaB4;
        this.giaB5 = giaB5;
        this.giaB6 = giaB6;
        this.doiTuongDC = doiTuongDC;
    }

    public float getGiaB1() {
        return giaB1;
    }

    public float getGiaB2() {
        return giaB2;
    }

    public float getGiaB3() {
        return giaB3;
    }

    public float getGiaB4() {
        return giaB4;
    }

    public float getGiaB5() {
        return giaB5;
    }

    public float getGiaB6() {
        return giaB6;
    }

    public String getDoiTuongDC() {
        return doiTuongDC;
    }

    public void setGiaB1(float giaB1) {
        this.giaB1 = giaB1;
    }

    public void setGiaB2(float giaB2) {
        this.giaB2 = giaB2;
    }

    public void setGiaB3(float giaB3) {
        this.giaB3 = giaB3;
    }

    public void setGiaB4(float giaB4) {
        this.giaB4 = giaB4;
    }

    public void setGiaB5(float giaB5) {
        this.giaB5 = giaB5;
    }

    public void setGiaB6(float giaB6) {
        this.giaB6 = giaB6;
    }

    public void setDoiTuongDC(String doiTuongDC) {
        this.doiTuongDC = doiTuongDC;
    }
    
}
