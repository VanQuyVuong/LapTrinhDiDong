package Bai2;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class CanBo {
    private String hoten_250;
    private Date ngaysinh_250;
    private String gioitinh_250;
    private String diachi_250;

    public String getHoten_250() {
        return hoten_250;
    }
    public void setHoten_250(String hoten_250) {
        this.hoten_250 = hoten_250;
    }
    public Date getNgaysinh_250() {
        return ngaysinh_250;
    }
    public void setNgaysinh_250(Date ngaysinh_250) {
        this.ngaysinh_250 = ngaysinh_250;
    }
    public String getGioitinh_250() {
        return gioitinh_250;
    }
    public void setGioitinh_250(String gioitinh_250) {
        this.gioitinh_250 = gioitinh_250;
    }
    public String getDiachi_250() {
        return diachi_250;
    }
    public void setDiachi_250(String diachi_250) {
        this.diachi_250 = diachi_250;
    }
    
    
    public CanBo(){        
    }
    public CanBo(String hoten, Date ngaysinh, String gioitinh, String diachi) {
        this.hoten_250 = hoten;
        this.ngaysinh_250 = ngaysinh;
        this.gioitinh_250 = gioitinh;
        this.diachi_250 = diachi;
    }  
    public void NhapThongTin(Scanner sc) throws ParseException{
     System.out.print("\n Nhap ten nhan vien :");
     hoten_250 = sc.nextLine();
     System.out.print("\n Nhap ngay sinh nhan vien :");
     String input = sc.nextLine();
     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
     Date ngaysinh = sdf.parse(input);
     System.out.print("\n Nhap gioi tinh nhan vien :");
     gioitinh_250 = sc.nextLine();
     System.out.print("\n Nhap dia chi nhan vien :");
     diachi_250 = sc.nextLine();     
    }
    public void HienThiThongTin(){
     System.out.print("\n\t ho ten " + hoten_250);
     System.out.print("\n\t ngay sinh  " + ngaysinh_250);
     System.out.print("\n\t gioi tinh " + gioitinh_250 );
     System.out.print("\n\t dia chi " + diachi_250 );
    }   
    public String gethoten(){
        return this.hoten_250;
    }
}
