package Bai9;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TheMuon extends SinhVien{
    private int sophieumuon_250;
    private Date ngaymuon_250;
    private Date hantra_250;
    private String sohieusach_250;
    
    public TheMuon(){    
    }
    public TheMuon(int sophieumuon, Date ngaymuon, Date hantra, String sohieusach) {
       
        this.sophieumuon_250 = sophieumuon;
        this.ngaymuon_250 = ngaymuon;
        this.hantra_250 = hantra;
        this.sohieusach_250 = sohieusach;
    }
    
    public void NhapThongTin(Scanner sc){
        super.NhapThongTin(sc);
        
        System.out.println("Nhap so phieu muon :");
        sophieumuon_250= sc.nextInt();
        sc.nextLine();
        
        System.out.println("Nhap so ngay muon (dd/MM/yyy) :");
        String strngaymuon=  sc.nextLine();
        ngaymuon_250 = strToDate(strngaymuon);
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(ngaymuon_250);
        cal.add(Calendar.MONTH, 1); 
        hantra_250 = cal.getTime();
        
        System.out.println("Nhap so hieu sach :");
        sohieusach_250=sc.nextLine();
    }
    public Date strToDate( String strngaymuon){
        Date date = null;
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            date= sdf.parse(strngaymuon);
        }catch(ParseException e){
            System.out.println("Loi dinh dang ngay thang ");
        }
        return date;
    }
    
    public void HienThiThongTin(){
        super.HienThiThongTin();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("So phieu muon "+sophieumuon_250);
        System.out.println("Ngay muon: " + (ngaymuon_250 != null ? sdf.format(ngaymuon_250) : "null"));
        System.out.println("Han tra: " + (hantra_250 != null ? sdf.format(hantra_250) : "null"));
        System.out.println("So hieu sach :"+sohieusach_250);
    }
    
    public Date getHanTra(){
        return hantra_250;
    }
}
