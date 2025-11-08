/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2_2;

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
        ArrayList<MatHang> danhSachMatHang = new ArrayList<>();
        
        try{
            File file = new File("mathangDe2_2.txt");
            
            Scanner scanner = new Scanner(file);
            
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                
                String[] parts = line.split("\\$");
                
                if(parts[0].equals("MonAn")){
                    danhSachMatHang.add(new MonAn(Boolean.parseBoolean(parts[parts.length - 1]), parts[1], parts[2], Integer.parseInt(parts[3]), Double.parseDouble(parts[4])));
                }
                else if(parts[0].equals("DoUong")){
                    danhSachMatHang.add(new DoUong(Boolean.parseBoolean(parts[parts.length - 1]), parts[1], parts[2], Integer.parseInt(parts[3]), Double.parseDouble(parts[4])));
                }
            }
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }
        
        System.out.println("TIEN HANH DOC FILE");
        for(MatHang mh : danhSachMatHang){
            System.out.println(mh);
        }
    }
}
