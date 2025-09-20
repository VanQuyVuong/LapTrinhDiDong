/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai10;
import java.util.*;

public class BienLai extends KhachHang {
    private int chisomoi_250;
    private int chisocu_250;
    private double tien_250;
    
    public BienLai(){
        
    }
    public BienLai(int chisomoi, int chisocu, double tien, String hotenchuho) {
        this.hotenchuho_250=hotenchuho;
        this.chisomoi_250 = chisomoi;
        this.chisocu_250 = chisocu;
        this.tien_250 = tien;
    }   
    public void Nhap(Scanner sc){
        super.Nhap(sc);
        System.out.println("Nhap chi so moi :");
        chisomoi_250=sc.nextInt();sc.nextLine();
        System.out.println("Nhap chi so cu : ");
        chisocu_250=sc.nextInt();sc.nextLine();        
      tien_250 =(chisomoi_250-chisocu_250)*750;
    }  
    public void HienThi(){
        super.HienThi();
        System.out.println("Chi so moi :"+chisomoi_250);
        System.out.println("Chi so cu :"+chisocu_250);
        System.out.println("Tien :"+tien_250 +" vnd.");
    }
}
