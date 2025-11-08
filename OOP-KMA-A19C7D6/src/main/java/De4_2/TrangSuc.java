/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De4_2;

/**
 *
 * @author An Nguyen Van
 */
public class TrangSuc extends MatHang{
    private double giaTheoCan;

    public TrangSuc() {
    }

    public TrangSuc(double giaTheoCan, String maHang, String tenHang, boolean duocPhepMuaBan) {
        super(maHang, tenHang, duocPhepMuaBan);
        this.giaTheoCan = giaTheoCan;
    }

    public double getGiaTheoCan() {
        return giaTheoCan;
    }

    public void setGiaTheoCan(double giaTheoCan) {
        this.giaTheoCan = giaTheoCan;
    }

    @Override
    public void InThongTinMatHang() {
        System.out.println("Ma Hang: " + getMaHang());
        System.out.println("Ten Hang: " + getTenHang());
        System.out.println("Co Duoc Phep Mua Ban Khong? (True or False): " + isDuocPhepMuaBan());
        System.out.println("Gia Theo Can: " + giaTheoCan);
    }
}
