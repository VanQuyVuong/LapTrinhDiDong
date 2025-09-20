package Bai5;
import java.text.ParseException;
import java.util.*;
public class HoDan extends Nguoi {    
    private int songuoi_250;
    private int sonha_250;
    private Nguoi[] list;    
    public HoDan(){
        list= new Nguoi[10];
    }
  public HoDan(int songuoi, int sonha,  String hoten, Date ngaysinh, String nghenghiep) {
        super(hoten, ngaysinh, nghenghiep);
        this.songuoi_250 = songuoi;
        this.sonha_250 = sonha;     
    }   
    public void NhapThongTin(Scanner sc) throws ParseException {       
        System.out.println("\nNhap so nguoi :");
        this.songuoi_250=sc.nextInt();
        sc.nextLine();
        System.out.println("\nNhap so nha :");
        sonha_250=sc.nextInt();
        sc.nextLine();
        System.out.println("\nNhap thong tin tung nguoi trong ho :");
        for(int i = 0 ; i< songuoi_250; i ++){
            System.out.println("\nNguoi thu " + (i+1) + " la :");
            list[i]=new Nguoi();
            list[i].NhapThongTin(sc);
        }
    }
    public void HienThiThongTin(){
        //super.HienThiThongTin();
        System.out.println("\nSo nguoi : "+songuoi_250);
        System.out.println("\nSo nha : "+sonha_250);
        System.out.println("\nThong tin cua tung nguoi trong gia dinh :");
        for(int i =0 ; i<songuoi_250; i++){
            System.out.println("\nNguoi thu :"+ (i+1) + " la : ");
            list[i].HienThiThongTin();
        }
    }
    public Nguoi[] getList(){
        return list;
    }
    
    public int getSoNguoi(){
        return songuoi_250;
    }
    
}
