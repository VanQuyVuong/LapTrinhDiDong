/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class CongNhan extends CanBo {
    private String bac_250;
    
    public CongNhan(){
        
    }
    public CongNhan(String bac, String hoten, Date ngaysinh, String gioitinh, String diachi) {
        super(hoten, ngaysinh, gioitinh, diachi);
        this.bac_250 = bac;
    }
    
    public void NhapThongTin(Scanner sc) throws ParseException{
        super.NhapThongTin(sc);
        System.out.print("\n Bac  :");
        bac_250 = sc.nextLine();
    }
    public void HienThiThongTin(){
        super.HienThiThongTin();
        System.out.print("\n\t Bac :"+ bac_250);
    }
}
