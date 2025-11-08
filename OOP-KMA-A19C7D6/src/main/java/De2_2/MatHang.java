/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2_2;

/**
 *
 * @author An Nguyen Van
 */
public class MatHang {
    private String tenMatHang;
    private String maHang;
    private int soLuong;
    private double giaVon;
    protected final double TY_LE_GIA_VON = 0.4;

    public MatHang() {
    }

    public MatHang(String tenMatHang, String maHang, int soLuong, double giaVon) {
        this.tenMatHang = tenMatHang;
        this.maHang = maHang;
        this.soLuong = soLuong;
        this.giaVon = giaVon;
    }

    public String getTenMatHang() {
        return tenMatHang;
    }

    public void setTenMatHang(String tenMatHang) {
        this.tenMatHang = tenMatHang;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaVon() {
        return giaVon;
    }

    public void setGiaVon(double giaVon) {
        this.giaVon = giaVon;
    }
    
    public double tinhGiaTrenMenu(){
        return (giaVon) / TY_LE_GIA_VON;
    }

    @Override
    public String toString() {
        return "tenMatHang=" + tenMatHang + ", maHang=" + maHang + ", soLuong=" + soLuong + ", giaVon=" + giaVon + ", TY_LE_GIA_VON=" + TY_LE_GIA_VON;
    }
}
