/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Nguoi {
    private String hoten_250;
    private int socmnd_250;
    private Date ngaysinh_250;
    public Nguoi(){    
    }
    public Nguoi(String hoten, int socmnd, Date ngaysinh) {
        this.hoten_250 = hoten;
        this.socmnd_250 = socmnd;
        this.ngaysinh_250 = ngaysinh;
    }   
    public void NhapThongTin(Scanner sc){
        System.out.print("\nNhap ho ten :");
        hoten_250 = sc.nextLine();
        System.out.print("\nNhap ngay sinh (dd/MM/yyyy)");
        String strDate = sc.nextLine();
        ngaysinh_250 = strToDate(strDate);
        System.out.println("\nNhap CMND : ");
        socmnd_250 = sc.nextInt();
    }
     private Date strToDate (String strDate){
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            date = sdf.parse(strDate);
            
        }catch(ParseException e){
            System.out.println("Loi dinh dang ngay thang !");
        }
    return date;
    }
    public void HienThiThongTin(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("\nHo ten:"+ hoten_250);
        System.out.println("\nNgay sinh: "+ (ngaysinh_250 != null ? sdf.format(ngaysinh_250) : "null"));
        System.out.println("\nSo CMND: "+socmnd_250);
    }
    
    public int getCMND(){
        return socmnd_250;
    }
}


