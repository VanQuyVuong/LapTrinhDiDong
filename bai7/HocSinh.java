package Bai7;
import java.util.*;

public class HocSinh extends Nguoi {
    private String lop_250;
    private String khoahoc_250;
    private String kyhoc_250;
    
    public HocSinh (){        
    }
    public HocSinh(String lop, String khoahoc, String kyhoc, String hoten) {
        this.hoten_250= hoten;
        this.lop_250 = lop;
        this.khoahoc_250 = khoahoc;
        this.kyhoc_250 = kyhoc;
    }   
    public void NhapThongTin(Scanner sc){
        super.NhapThongTin(sc);
        System.out.println("Nhap thong tin lop hoc (vd 10A1):");
        lop_250= sc.nextLine();
        System.out.println("Nhap thong tin khoa hoc :");
        khoahoc_250=sc.nextLine();
        System.out.println("Nhap thong tin ky hoc :");
        kyhoc_250=sc.nextLine();
    }   
    public void HienThiThongTin(){
        super.HienThiThongTin();
        
        System.out.println("\tLop: "+lop_250);
        System.out.println("\tKhoa hoc :"+khoahoc_250);
        System.out.println("\tKy hoc :"+kyhoc_250);
        
    }
      public String getLop_250(){
        return lop_250;
    }
}
