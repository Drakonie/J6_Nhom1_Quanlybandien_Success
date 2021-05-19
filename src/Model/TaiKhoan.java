/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Bui Quoc Anh
 */
public class TaiKhoan {
    private String userName;
    private String passWord;
    private String loaiTK;
    public TaiKhoan(){
        this.userName = "";
        this.passWord = "";
        this.loaiTK = "";
    }

    public TaiKhoan(String userName, String passWord, String loaiTK) {
        this.userName = userName;
        this.passWord = passWord;
        this.loaiTK = loaiTK;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getLoaiTK() {
        return loaiTK;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setLoaiTK(String loaiTK) {
        this.loaiTK = loaiTK;
    }
    
}
