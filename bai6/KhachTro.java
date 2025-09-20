package Bai6;
import java.util.*;
public class KhachTro extends Nguoi{
    private int songaytro_250;
    private String loaiphong_250;
    private double giaphong_250;
    public KhachTro(){     
}
    public KhachTro(int songaytro, String loaiphong, double giaphong, String hoten, int socmnd, Date ngaysinh) {
        super(hoten, socmnd, ngaysinh);
        this.songaytro_250 = songaytro;
        this.loaiphong_250 = loaiphong;
        this.giaphong_250 = giaphong;
    }
    public void NhapThongTin(Scanner sc){
        super.NhapThongTin(sc);
        System.out.println("\nNhap so ngay tro:");
        songaytro_250=sc.nextInt() ;sc.nextLine();
        System.out.println("\nNhap vao loai phong ( 1 -VIP ; 2- LUXURY ; 3- GOOD ; 4- BASIC): ");
        loaiphong_250=sc.nextLine();
        System.out.println("\nNhap gia phong ((1:500 ; 2:400 ; 3: 250 ; 4: 100) / day):");
        giaphong_250=sc.nextDouble();sc.nextLine();
    }
    public void HienThiThongTin(){
        super.HienThiThongTin();
        System.out.println("\n So ngay tro:"+songaytro_250);
        System.out.println("\n Loai phong :"+loaiphong_250);
        System.out.println("\n Gia phong :"+giaphong_250);
    }
    public int getSoNgayTro(){
        return songaytro_250;
    }
    public double getGiaPhong(){
        return giaphong_250;
    }
}
    
    
