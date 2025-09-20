package Bai8;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Nguoi {
    private String hoten_250;
    private String ngaysinh_250;
    private String quequan_250;
     public Nguoi(){
         
     }

    public Nguoi(String hoten, String ngaysinh, String quequan) {
        this.hoten_250 = hoten;
        this.ngaysinh_250 = ngaysinh;
        this.quequan_250 = quequan;
    }
     public void NhapThongTin(Scanner sc){
         System.out.println("Nhap ho ten :");
         hoten_250 =sc.nextLine();
         System.out.println("Nhap ngay sinh (dd/MM/yy) :");
         ngaysinh_250= sc.nextLine();
         System.out.println("Nhap que quan: ");
         quequan_250= sc.nextLine();
     }
     
     
     public void HienThiThongTin(){
         
         System.out.println("Ho ten :"+hoten_250);
         System.out.println("Ngay sinh :"+ngaysinh_250 );
         System.out.println("Que quan :"+quequan_250);
     }
     
}
