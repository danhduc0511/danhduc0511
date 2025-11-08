/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De1_2;

/**
 *
 * @author An Nguyen Van
 */
public class NhanVienBep extends NhanVien{
    private boolean isBepTruong;
    private float thuongChucVu;

    public NhanVienBep() {
    }

    public NhanVienBep(String hoTen, int thamNien, String queQuan, float soGioLamViec, boolean isBepTruong, float thuongChucVu) {
        super(hoTen, thamNien, queQuan, soGioLamViec);
        this.isBepTruong = isBepTruong;
        this.thuongChucVu = thuongChucVu;
    }

    public boolean isIsBepTruong() {
        return isBepTruong;
    }

    public void setIsBepTruong(boolean isBepTruong) {
        this.isBepTruong = isBepTruong;
    }

    public float getThuongChucVu() {
        return thuongChucVu;
    }

    public void setThuongChucVu(float thuongChucVu) {
        this.thuongChucVu = thuongChucVu;
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong() + super.tinhLuong() *  (thuongChucVu / 100);
    }

    @Override
    public String toString() {
        return super.toString() + ", isBepTruong: " + isBepTruong + ", thuongChucVu: " + thuongChucVu + ", Luong: " + tinhLuong();
    }
}
