/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De3_1;

/**
 *
 * @author An Nguyen Van
 */
public class ThiSinhKhoiA extends ThiSinh{
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public ThiSinhKhoiA() {
    }

    public ThiSinhKhoiA(double diemToan, double diemLy, double diemHoa, String hoTen, String soBaoDanh, String truongHoc, double diemCong) {
        super(hoTen, soBaoDanh, truongHoc, diemCong);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }
    
    public double tinhDiem(){
        return (diemToan * 2 + diemLy + diemHoa) / 4 + this.getDiemCong();
    }

    @Override
    public String toString() {
        return super.toString() + ", Diem Toan: " + diemToan + ", Diem Ly: " + diemLy + ", Diem Hoa: " + diemHoa + ", Tong diem: " + tinhDiem();
    }
}
