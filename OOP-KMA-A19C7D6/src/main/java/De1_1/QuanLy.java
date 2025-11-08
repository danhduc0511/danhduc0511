/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De1_1;

/**
 *
 * @author An Nguyen Van
 */
public class QuanLy extends CanBo{
    private double heSoChucVu;

    public QuanLy() {
    }

    public QuanLy(double heSoChucVu, String hoTen, String namSinh, String gioiTinh, String diaChi, double heSoLuong) {
        super(hoTen, namSinh, gioiTinh, diaChi, heSoLuong);
        this.heSoChucVu = heSoChucVu;
    }

    public double getHeSoChucVu() {
        return heSoChucVu;
    }

    public void setHeSoChucVu(double heSoChucVu) {
        this.heSoChucVu = heSoChucVu;
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong() * (1 + heSoChucVu);
    }

    @Override
    public String toString() {
        return super.toString() + ", heSoChucVu=" + heSoChucVu + ", Luong: " + tinhLuong(); 
    }
}
