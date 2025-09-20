/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Bao extends TaiLieu {
    private String ngayphathanh_250;
    public Bao(){
        
    }

    public Bao(String ngayphathanh, String matailieu, String tennhaxb, int sobanphathanh) {
        super(matailieu, tennhaxb, sobanphathanh);
        this.ngayphathanh_250 = ngayphathanh;
    }
    
    public void NhapThongTin(Scanner sc){
        super.NhapThongTin(sc);
        System.out.print("\n Nhap ngay phat hanh:");
        ngayphathanh_250 = sc.nextLine();
        sc.nextLine();
    }
    public void HienThiThongTin(){
        super.HienThiThongTin();
        System.out.print("\n Ngay phat hanh:" + ngayphathanh_250);
    }
}
