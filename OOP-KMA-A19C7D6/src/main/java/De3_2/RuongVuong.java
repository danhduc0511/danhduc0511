/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De3_2;

/**
 *
 * @author An Nguyen Van
 */
public class RuongVuong extends Ruong{
    private double doDaiCanh;
    
    public RuongVuong(){
        
    }
    
    public RuongVuong(double doDaiCanh, String maRuong, String tenChuHo, String loaiCayTrong) {
        super(maRuong, tenChuHo, loaiCayTrong);
        this.doDaiCanh = doDaiCanh;
    }

    public double getDoDaiCanh() {
        return doDaiCanh;
    }

    public void setDoDaiCanh(double doDaiCanh) {
        this.doDaiCanh = doDaiCanh;
    }
    
    public double tinhDienTich(){
        return doDaiCanh * doDaiCanh;
    }

    @Override
    public String toString() {
        return super.toString() + ", Do danh Canh: " + doDaiCanh + ", Dien Tich: " + tinhDienTich();
    }
}