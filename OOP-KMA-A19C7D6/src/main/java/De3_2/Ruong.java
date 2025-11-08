/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De3_2;

/**
 *
 * @author An Nguyen Van
 */
public class Ruong {
    private String maRuong;
    private String tenChuHo;
    private String loaiCayTrong;
    protected final int DIEN_TICH_MAX = 100;
    
    public Ruong(){
        
    }
    
    public Ruong(String maRuong, String tenChuHo, String loaiCayTrong) {
        this.maRuong = maRuong;
        this.tenChuHo = tenChuHo;
        this.loaiCayTrong = loaiCayTrong;
    }

    public String getMaRuong() {
        return maRuong;
    }

    public void setMaRuong(String maRuong) {
        this.maRuong = maRuong;
    }

    public String getTenChuHo() {
        return tenChuHo;
    }

    public void setTenChuHo(String tenChuHo) {
        this.tenChuHo = tenChuHo;
    }

    public String getLoaiCayTrong() {
        return loaiCayTrong;
    }

    public void setLoaiCayTrong(String loaiCayTrong) {
        this.loaiCayTrong = loaiCayTrong;
    }

    @Override
    public String toString() {
        return "maRuong=" + maRuong + ", tenChuHo=" + tenChuHo + ", loaiCayTrong=" + loaiCayTrong + ", DIEN_TICH_MAX=" + DIEN_TICH_MAX;
    }
}
