/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De4_2;

/**
 *
 * @author An Nguyen Van
 */
public abstract class MatHang {
    private String maHang;
    private String tenHang;
    private boolean duocPhepMuaBan;
    
    public MatHang(){
        
    }

    public MatHang(String maHang, String tenHang, boolean duocPhepMuaBan) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.duocPhepMuaBan = duocPhepMuaBan;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public boolean isDuocPhepMuaBan() {
        return duocPhepMuaBan;
    }

    public void setDuocPhepMuaBan(boolean duocPhepMuaBan) {
        this.duocPhepMuaBan = duocPhepMuaBan;
    }
    
    public abstract void InThongTinMatHang();
}
