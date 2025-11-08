/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De1_1;

/**
 *
 * @author An Nguyen Van
 */
public  class CanBo {
    private String hoTen;
    private String namSinh;
    private String gioiTinh;
    private String diaChi;
    private double heSoLuong;
    protected final double LUONG_CO_BAN = 2000000;

    public CanBo() {
    }

    public CanBo(String hoTen, String namSinh, String gioiTinh, String diaChi, double heSoLuong) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.heSoLuong = heSoLuong;
    }

    public String getHoTen() {return hoTen;}

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    
    public double tinhLuong(){
        return heSoLuong * LUONG_CO_BAN;
    }
    
    @Override
    public String toString() {
        return "hoTen=" + hoTen + ", namSinh=" + namSinh + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + ", heSoLuong=" + heSoLuong + ", LUONG_CO_BAN=" + LUONG_CO_BAN;
    }
}
