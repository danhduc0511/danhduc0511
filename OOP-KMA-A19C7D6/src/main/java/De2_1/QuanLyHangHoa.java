/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author An Nguyen Van
 */
public class QuanLyHangHoa {
    public static void main(String[] args) {
        ArrayList<HangHoa> danhSachHangHoa = new ArrayList<>();
        
        try{
            File file = new File("hanghoaDe2_1.txt");
            
            Scanner scanner = new Scanner(file);
            
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                
                String[] parts = line.split("\\$");
                
                boolean isString = false;
                
                if(parts[parts.length - 1].contains(Character.toString('x'))){
                    isString = true;
                }
                
                if(isString == false){
                    danhSachHangHoa.add(new DienThoai(parts[1], parts[2], Double.parseDouble(parts[3]), Double.parseDouble(parts[4]), Double.parseDouble(parts[5])));
                }
                else{
                    danhSachHangHoa.add(new MayTinhBang(parts[1], parts[2], Double.parseDouble(parts[3]), Double.parseDouble(parts[4]), parts[5]));
                }
            }
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }
        for(HangHoa hh : danhSachHangHoa){
            System.out.println(hh);
        }
        System.out.println("Doc File Thanh Cong!");
    }
}
