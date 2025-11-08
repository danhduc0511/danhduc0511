/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De1_2;

/**
 *
 * @author An Nguyen Van
 */
public class NhanVien {
    private String hoTen;
    private int thamNien;
    private String queQuan;
    private float soGioLamViec;
    protected final int LUONG_GIO = 100000;

    public NhanVien() {
    }

    public NhanVien(String hoTen, int thamNien, String queQuan, float soGioLamViec) {
        this.hoTen = hoTen;
        this.thamNien = thamNien;
        this.queQuan = queQuan;
        this.soGioLamViec = soGioLamViec;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public float getSoGioLamViec() {
        return soGioLamViec;
    }

    public void setSoGioLamViec(float soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }
    
    public double tinhLuong(){
        return soGioLamViec * LUONG_GIO;
    }

    @Override
    public String toString() {
        return "hoTen=" + hoTen + ", thamNien=" + thamNien + ", queQuan=" + queQuan + ", soGioLamViec=" + soGioLamViec + ", LUONG_GIO=" + LUONG_GIO;
    }
}
