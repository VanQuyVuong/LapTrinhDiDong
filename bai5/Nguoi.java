
package Bai5;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Nguoi {
    private String hoten_250;
    private Date ngaysinh_250;
    private String nghenghiep_250;   
public Nguoi(){   
}
    public Nguoi(String hoten, Date ngaysinh, String nghenghiep) {
        this.hoten_250 = hoten;
        this.ngaysinh_250 = ngaysinh;
        this.nghenghiep_250 = nghenghiep;
    }
    public void NhapThongTin(Scanner sc) throws ParseException{
        System.out.println("\nNhap vao ho ten :");
        hoten_250= sc.nextLine();
        System.out.println("\nNhap ngay sinh (dd/MM/yy):");
        String input = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        this.ngaysinh_250 = sdf.parse(input);
        System.out.println("\nNhap nghe nghiep :");
        nghenghiep_250=sc.nextLine();
    }   
    public void HienThiThongTin(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("\nHo ten :"+ hoten_250);
        System.out.println("\nNgay sinh :"+(ngaysinh_250 != null ? sdf.format(ngaysinh_250) : "Chưa nhập"));
        System.out.println("\nNghe nghiep :"+nghenghiep_250);
    }
    public Date getNgaySinh(){
        return ngaysinh_250;
    }    
}


