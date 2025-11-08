/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2_1;

/**
 *
 * @author An Nguyen Van
 */
public class DienThoai extends HangHoa{
    private double giaSimGhep;

    public DienThoai() {
    }

    public DienThoai(String tenHang, String maHang, double giaNhap, double giaBan, double giaSimGhep) {
        super(tenHang, maHang, giaNhap, giaBan);
        this.giaSimGhep = giaSimGhep;
    }

    public double getGiaSimGhep() {
        return giaSimGhep;
    }

    public void setGiaSimGhep(double giaSimGhep) {
        this.giaSimGhep = giaSimGhep;
    }

    @Override
    public double tinhLoiNhuan() {
        return super.tinhLoiNhuan() - giaSimGhep; 
    }

    @Override
    public String toString() {
        return super.toString() + ", Gia sim ghep=" + giaSimGhep;
    }
}
