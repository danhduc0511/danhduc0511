/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De1_1;

/**
 *
 * @author An Nguyen Van
 */
public class NhanVien extends CanBo{
    private String nganhDaoTao;

    public NhanVien() {
    }

    public NhanVien(String hoTen, String namSinh, String gioiTinh, String diaChi, double heSoLuong, String nganhDaoTao) {
        super(hoTen, namSinh, gioiTinh, diaChi, heSoLuong);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong();
    }

    @Override
    public String toString() {
        return super.toString() + ", nganhDaoTao=" + nganhDaoTao + ", Luong: " + tinhLuong();
    }
}
