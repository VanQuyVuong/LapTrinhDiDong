/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;
import java.util.*;

public class Sach extends TaiLieu {
    private String tentg_250;
    private int sotrang_250;
    
    public Sach(){
        
    }
    public Sach(String tentg, int sotrang, String matailieu, String tennhaxb, int sobanphathanh) {
        super(matailieu, tennhaxb, sobanphathanh);
        this.tentg_250 = tentg;
        this.sotrang_250 = sotrang;
    }   
    public void NhapThongTin(Scanner sc){
        super.NhapThongTin(sc);
        System.out.print("\n Nhap ten tac gia:");
        tentg_250= sc.nextLine();
        System.out.print("\n Nhap so trang:");
        sotrang_250= sc.nextInt();
        sc.nextLine();
    }
    public void HienThiThongTin(){
        super.HienThiThongTin();
        System.out.print("\n Ten tac gia:" + tentg_250);
        System.out.print("\n So trang:" + sotrang_250);
        
    }
    
}
