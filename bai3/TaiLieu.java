/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;
import java.util.Scanner;
public class TaiLieu {
    private String matailieu_250;
    private String tennhaxb_250;
    private int sobanphathanh_250;
    
    public TaiLieu(){      
    }
    public TaiLieu(String matailieu, String tennhaxb, int sobanphathanh) {
        this.matailieu_250 = matailieu;
        this.tennhaxb_250 = tennhaxb;
        this.sobanphathanh_250 = sobanphathanh;
    }    
    public void NhapThongTin(Scanner sc){
        System.out.print("\n Nhap ma tai lieu:");
        matailieu_250 = sc.nextLine();
        System.out.print("\n Nhap ten nha xuat ban :");
        tennhaxb_250 = sc.nextLine();
        System.out.print("\n Nhap ban phat hanh :");
        sobanphathanh_250 = sc.nextInt();
        sc.nextLine();
    }
    public void HienThiThongTin(){
        System.out.print("\n Ma tai lieu :"+ matailieu_250);
        System.out.print("\n Ten nha xuat ban  :"+ tennhaxb_250);
        System.out.print("\n So ban phat hanh :"+ sobanphathanh_250);
    }      
    public String getMaTaiLieu(){
        return matailieu_250;
    }
}
