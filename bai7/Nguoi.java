package Bai7;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Nguoi {
    protected String hoten_250;
    private Date ngaysinh_250;
    private String quequan_250;    
    public Nguoi(){      
    }
    public Nguoi(String hoten, Date ngaysinh, String quequan) {
        this.hoten_250 = hoten;
        this.ngaysinh_250 = ngaysinh;
        this.quequan_250 = quequan;
    }   
    public void NhapThongTin(Scanner sc){
        System.out.println("Nhap thong tin ho ten :");
        hoten_250 = sc.nextLine();
        System.out.println("Nhap thong tin ngay sinh :");
        String strDate = sc.nextLine();
        ngaysinh_250 = strToDate(strDate);
        System.out.println("Nhap thong tin que quan :");
        quequan_250 = sc.nextLine();
    }
     private Date strToDate (String strDate){
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            date = sdf.parse(strDate);
            
        }catch(ParseException e){
            System.out.println("Loi dinh dang ngay thang !");
        }
    return date;
    }
     
     public void HienThiThongTin(){
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
         System.out.println("Ho ten :" + hoten_250);
         System.out.println("Ngay sinh :"+(ngaysinh_250 != null ? sdf.format(ngaysinh_250) : "null"));
         System.out.println("Que quan :"+quequan_250);
     }
     
     public Date getNgaySinh(){
         return ngaysinh_250;
     }
     public String getQueQuan(){
         return quequan_250;
     }
}
