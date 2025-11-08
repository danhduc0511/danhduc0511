/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De3_2;

/**
 *
 * @author An Nguyen Van
 */
public class RuongChuNhat extends Ruong{
    private double chieuDai;
    private double chieuRong;
        
    public RuongChuNhat(){
        
    }
    
    public RuongChuNhat(double chieuDai, double chieuRong, String maRuong, String tenChuHo, String loaiCayTrong) {
        super(maRuong, tenChuHo, loaiCayTrong);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    
    public double tinhDienTich(){
        return chieuDai * chieuRong;
    }

    @Override
    public String toString() {
        return super.toString() + ", Chieu Dai: " + chieuDai + ", Chieu Rong: " + chieuRong + ", Dien Tich: " + tinhDienTich();
    }
}