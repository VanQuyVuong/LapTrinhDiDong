package Bai4;
import java.util.Scanner;
public class ThiSinh {
    private int sobaodanh_250;
    private String hoten_250;
    private String diachi_250 ;
    private String dienUuTienKV_250;    
    public ThiSinh(){        
    }
    public ThiSinh(int sobaodanh, String hoten, String diachi, String dienUuTienKV) {
        this.sobaodanh_250 = sobaodanh;
        this.hoten_250 = hoten;
        this.diachi_250 = diachi;
        this.dienUuTienKV_250 = dienUuTienKV;
    }   
    public void NhapThongTin(Scanner sc){
        System.out.print("\n Nhap so bao danh :");
        sobaodanh_250= sc.nextInt();
        sc.nextLine();
        System.out.print("\n Nhap ho ten :");
        hoten_250= sc.nextLine();
        System.out.print("\n Nhap dia chi :");
        diachi_250= sc.nextLine();
        System.out.print("\n Nhap dien uu tien khu vuc nao :");
        dienUuTienKV_250= sc.nextLine();       
    }   
    public void HienThiThongTin(){
        System.out.print("\nSo bao danh : " + sobaodanh_250);
        System.out.print("\nHo ten: " + hoten_250);
        System.out.print("\nDia chi : " + diachi_250);
        System.out.print("\nDien uu tien thuoc khu vuc : " + dienUuTienKV_250);
    }
    public int getThiSinh(){
        return sobaodanh_250;
    }
}
