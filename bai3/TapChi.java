/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;
import java.text.SimpleDateFormat;
import java.util.*;

public class TapChi extends TaiLieu {
    private int sophathanh_250;
    private int thangphathanh_250;
    
    public TapChi(){
        
    }
    public TapChi(int sophathanh, int thangphathanh, String matailieu, String tennhaxb, int sobanphathanh) {
        super(matailieu, tennhaxb, sobanphathanh);
        this.sophathanh_250 = sophathanh;
        this.thangphathanh_250 = thangphathanh;
    }   
    public void NhapThongTin(Scanner sc){
        super.NhapThongTin(sc);
        System.out.print("\nNhap so phat hanh :");
        sophathanh_250 = sc.nextInt();
        System.out.print("\nNhap thang phat hanh :");
        thangphathanh_250 = sc.nextInt();
        sc.nextLine();
    }
    public void HienThiThongTin(){
        super.HienThiThongTin();
        System.out.print("\nSo phat hanh:"+ sophathanh_250);
        System.out.print("\nThang phat hanh:"+ thangphathanh_250);
    }
}
