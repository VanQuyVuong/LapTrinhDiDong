package Bai4;
import java.util.Scanner;

public class KhoiA extends ThiSinh {
    private String mon1_250;
    private String mon2_250;
    private String mon3_250;   
    public KhoiA(){      
   }
  public KhoiA(String mon1, String mon2, String mon3) {
        
        this.mon1_250 = mon1;
        this.mon2_250 = mon2;
        this.mon3_250 = mon3;
    }
  public void NhapThongTin(Scanner sc){
        super.NhapThongTin(sc);
        System.out.print("\nNhap ten mon 1:");
        mon1_250= sc.nextLine();
        
        System.out.print("\nNhap ten mon 2:");
        mon2_250=sc.nextLine();
         
        System.out.print("\nNhap ten mon 3:");
        mon3_250= sc.nextLine();
         
    }
    
    public void HienThiThongTin(){
        super.HienThiThongTin();
        System.out.print("\n To hop mon: " + mon1_250 + ", "+ mon2_250 +"," + mon3_250+".\n");
    }
}
