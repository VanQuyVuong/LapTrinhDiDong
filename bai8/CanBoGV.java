package Bai8;
import java.text.DecimalFormat;
import java.util.*;

public class CanBoGV extends Nguoi{
   private double luongcung_250;
   private double thuong_250;
   private double phat_250;
   private double luongthuclinh_250;  
   public CanBoGV(){     
   }
    public void NhapThongTin(Scanner sc){
        super.NhapThongTin(sc);
        System.out.println("Nhap muc luong cung (*.000.000) :");
        luongcung_250=sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap muc thuong *.000.000) :");
        thuong_250 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap muc phat *.000.000) :");
        phat_250= sc.nextDouble();
        sc.nextLine();
        luongthuclinh_250= luongcung_250+thuong_250-phat_250;
    }
    public void HienThiThongTin(){
        super.HienThiThongTin();
        DecimalFormat df= new DecimalFormat("#,###.##");
        System.out.println("Muc luong cung : " + df.format(luongcung_250));
        System.out.println("Muc tien thuong : " + df.format(thuong_250));
        System.out.println("Muc tien phat : " + df.format(phat_250));
        System.out.println("Muc luong thuc linh : " + df.format(luongthuclinh_250));
    }
    public double getLUongThucLinh(){
        return luongthuclinh_250;
    }    
}
