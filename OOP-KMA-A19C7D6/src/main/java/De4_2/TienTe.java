/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De4_2;

/**
 *
 * @author An Nguyen Van
 */
public class TienTe extends MatHang{
    private double tiGiaChuyenDoi;
    
    public TienTe(){
        
    }

    public TienTe(double tiGiaChuyenDoi) {
        this.tiGiaChuyenDoi = tiGiaChuyenDoi;
    }

    public TienTe(double tiGiaChuyenDoi, String maHang, String tenHang, boolean duocPhepMuaBan) {
        super(maHang, tenHang, duocPhepMuaBan);
        this.tiGiaChuyenDoi = tiGiaChuyenDoi;
    }

    public double getTiGiaChuyenDoi() {
        return tiGiaChuyenDoi;
    }

    public void setTiGiaChuyenDoi(double tiGiaChuyenDoi) {
        this.tiGiaChuyenDoi = tiGiaChuyenDoi;
    }

    @Override
    public void InThongTinMatHang() {
        System.out.println("Ma Hang: " + getMaHang());
        System.out.println("Ten Hang: " + getTenHang());
        System.out.println("Co Duoc Phep Mua Ban Khong? (True or False): " + isDuocPhepMuaBan());
        System.out.println("Ty Gia Chuyen Doi: " + tiGiaChuyenDoi);
    }
}
