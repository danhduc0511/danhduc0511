/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De3_1;

/**
 *
 * @author An Nguyen Van
 */
public class ThiSinh {
    private String hoTen;
    private String soBaoDanh;
    private String truongHoc;
    private double diemCong;
    protected final int DIEM_SAN = 3;

    public ThiSinh() {
    }

    public ThiSinh(String hoTen, String soBaoDanh, String truongHoc, double diemCong) {
        this.hoTen = hoTen;
        this.soBaoDanh = soBaoDanh;
        this.truongHoc = truongHoc;
        this.diemCong = diemCong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(String soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String getTruongHoc() {
        return truongHoc;
    }

    public void setTruongHoc(String truongHoc) {
        this.truongHoc = truongHoc;
    }

    public double getDiemCong() {
        return diemCong;
    }

    public void setDiemCong(double diemCong) {
        this.diemCong = diemCong;
    }

    @Override
    public String toString() {
        return "hoTen=" + hoTen + ", soBaoDanh=" + soBaoDanh + ", truongHoc=" + truongHoc + ", diemCong=" + diemCong + ", DIEM_SAN=" + DIEM_SAN;
    }
}
