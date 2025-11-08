/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De3_1;

/**
 *
 * @author An Nguyen Van
 */
public class ThiSinhKhoiD extends ThiSinh{
    private double diemToan;
    private double diemVan;
    private double diemAnh;

    public ThiSinhKhoiD() {
        
    }

    public ThiSinhKhoiD(double diemToan, double diemVan, double diemAnh, String hoTen, String soBaoDanh, String truongHoc, double diemCong) {
        super(hoTen, soBaoDanh, truongHoc, diemCong);
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    public double getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(double diemAnh) {
        this.diemAnh = diemAnh;
    }
    
    public double tinhDiem(){
        return (diemToan + diemVan + diemAnh * 2) / 4 + this.getDiemCong();
    }

    @Override
    public String toString() {
        return super.toString() + ", Diem Toan: " + diemToan + ", Diem Van: " + diemVan + ", Diem Anh: " + diemAnh + ", Tong Diem: " + tinhDiem();
    }
}
