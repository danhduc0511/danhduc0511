/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2_2;

/**
 *
 * @author An Nguyen Van
 */
public class DoUong extends MatHang{
    private boolean coNongKhong;

    public DoUong() {
    }

    public DoUong(boolean coNongKhong, String tenMatHang, String maHang, int soLuong, double giaVon) {
        super(tenMatHang, maHang, soLuong, giaVon);
        this.coNongKhong = coNongKhong;
    }

    public boolean isCoNongKhong() {
        return coNongKhong;
    }

    public void setCoNongKhong(boolean coNongKhong) {
        this.coNongKhong = coNongKhong;
    }

    @Override
    public double tinhGiaTrenMenu() {
        return super.tinhGiaTrenMenu();
    }

    @Override
    public String toString() {
        return super.toString() + ", Co Nong Khong: " + coNongKhong;
    }
}
