/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2_2;

/**
 *
 * @author An Nguyen Van
 */
public class MonAn extends MatHang{
    private boolean canTrinhDien;

    public MonAn() {
    }

    public MonAn(boolean canTrinhDien, String tenMatHang, String maHang, int soLuong, double giaVon) {
        super(tenMatHang, maHang, soLuong, giaVon);
        this.canTrinhDien = canTrinhDien;
    }

    public boolean isCanTrinhDien() {
        return canTrinhDien;
    }

    public void setCanTrinhDien(boolean canTrinhDien) {
        this.canTrinhDien = canTrinhDien;
    }

    @Override
    public double tinhGiaTrenMenu() {
        return super.tinhGiaTrenMenu() + 200000;
    }

    @Override
    public String toString() {
        return super.toString() + ", Can Trinh Dien: " + canTrinhDien;     
    }
}
