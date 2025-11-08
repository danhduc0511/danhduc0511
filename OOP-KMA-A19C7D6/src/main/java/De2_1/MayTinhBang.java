/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2_1;

/**
 *
 * @author An Nguyen Van
 */
public class MayTinhBang extends HangHoa{
    private String kichThuongManHinh;

    public MayTinhBang() {
    }

    public MayTinhBang(String tenHang, String maHang, double giaNhap, double giaBan, String kichThuongManHinh) {
        super(tenHang, maHang, giaNhap, giaBan);
        this.kichThuongManHinh = kichThuongManHinh;
    }

    public String getKichThuongManHinh() {
        return kichThuongManHinh;
    }

    public void setKichThuongManHinh(String kichThuongManHinh) {
        this.kichThuongManHinh = kichThuongManHinh;
    }

    @Override
    public double tinhLoiNhuan() {
        return super.tinhLoiNhuan();
    }

    @Override
    public String toString() {
        return super.toString() + ", Kich thuoc man hinh=" + kichThuongManHinh;
    }
}
