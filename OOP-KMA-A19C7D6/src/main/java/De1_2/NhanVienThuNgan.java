/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De1_2;

/**
 *
 * @author An Nguyen Van
 */
public class NhanVienThuNgan extends NhanVien{
    private boolean isBietNgoaiNgu;

    public NhanVienThuNgan() {
    }

    public NhanVienThuNgan(String hoTen, int thamNien, String queQuan, float soGioLamViec, boolean isBietNgoaiNgu) {
        super(hoTen, thamNien, queQuan, soGioLamViec);
        this.isBietNgoaiNgu = isBietNgoaiNgu;
    }

    public boolean isIsBietNgoaiNgu() {
        return isBietNgoaiNgu;
    }

    public void setIsBietNgoaiNgu(boolean isBietNgoaiNgu) {
        this.isBietNgoaiNgu = isBietNgoaiNgu;
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong();
    }

    @Override
    public String toString() {
        return super.toString() + ", isBietNgoaiNgu: " + isBietNgoaiNgu + ", Luong: " + tinhLuong();
    }
}
