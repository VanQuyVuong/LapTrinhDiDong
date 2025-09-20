package Bai9;
import java.text.SimpleDateFormat;
import java.util.*;

public class SinhVien {
   protected String hoten_250;
   protected String msv_250;
   protected String ngaysinh_250;
   protected String quequan_250;
   
   public SinhVien(){       
   }

    public SinhVien(String hoten, String msv, String ngaysinh, String quequan) {
        this.hoten_250 = hoten;
        this.msv_250 = msv;
        this.ngaysinh_250 = ngaysinh;
        this.quequan_250 = quequan;
    }
   public void NhapThongTin(Scanner sc){
         System.out.println("Nhap ho ten :");
         hoten_250 =sc.nextLine();
         System.out.println("Nhap ma sinh vien :");
         msv_250= sc.nextLine();
         System.out.println("Nhap ngay sinh (dd/MM/yy) :");
         ngaysinh_250= sc.nextLine();
         System.out.println("Nhap que quan: ");
         quequan_250= sc.nextLine();
     }
   public void HienThiThongTin(){
         System.out.println("Ho ten :"+hoten_250);
         System.out.println("Ma sinh vien :"+msv_250);
         System.out.println("Ngay sinh :"+ngaysinh_250 );
         System.out.println("Que quan :"+quequan_250);
     }  
}
