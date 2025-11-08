/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author An Nguyen Van
 */

public class QuanLyMatHang {
    public static void main(String[] args) {
        ArrayList<MatHang> danhSachMatHang = new ArrayList();
        try{
            File file = new File("mathangDe4_2.txt");
            Scanner scanner = new Scanner(file);
            
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                
                String[] parts = line.split("\\$");
                
                if(parts[0].equals("TienTe")){
                    TienTe tienTe = new TienTe();
                    tienTe.setMaHang(parts[1]);
                    tienTe.setTenHang(parts[2]);
                    tienTe.setDuocPhepMuaBan(Boolean.parseBoolean(parts[3]));
                    tienTe.setTiGiaChuyenDoi(Double.parseDouble(parts[4]));
                    
                    danhSachMatHang.add(tienTe);
                }
                else if(parts[0].equals("TrangSuc")){
                    TrangSuc trangSuc = new TrangSuc();
                    trangSuc.setMaHang(parts[1]);
                    trangSuc.setTenHang(parts[2]);
                    trangSuc.setDuocPhepMuaBan(Boolean.parseBoolean(parts[3]));
                    trangSuc.setGiaTheoCan(Double.parseDouble(parts[4]));
                    
                    danhSachMatHang.add(trangSuc);
                }
            }
            
            for(MatHang mh : danhSachMatHang){
                System.out.println();
                mh.InThongTinMatHang();
            }
        }catch(FileNotFoundException ex){
            System.out.println("Loi Khi Doc File!" + ex.getMessage());
        }
        
    }
}
