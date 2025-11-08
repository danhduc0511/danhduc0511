/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2_1;

/**
 *
 * @author An Nguyen Van
 */
public class HangHoa {
    private String tenHang;
    private String maHang;
    private double giaNhap;
    private double giaBan;
    protected final double THUONG_BAN_HANG = 0.2;

    public HangHoa() {
    }

    public HangHoa(String tenHang, String maHang, double giaNhap, double giaBan) {
        this.tenHang = tenHang;
        this.maHang = maHang;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    
    public double tinhLoiNhuan(){
        return (giaBan - giaNhap) * (1 - THUONG_BAN_HANG);
    }

    @Override
    public String toString() {
        return "tenHang=" + tenHang + ", maHang=" + maHang + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + ", THUONG_BAN_HANG=" + THUONG_BAN_HANG;
    }
}
