package Bai7;
import java.util.*;

public class QLHS {
    private ArrayList<HocSinh> dshs;
   
    public QLHS(){
        dshs= new ArrayList<HocSinh>(10);
    }
    
    public void themHS(HocSinh hs){
        dshs.add(hs);
        
    }
    
    public void NhapDanhSachHS(Scanner sc){
        HocSinh hs;
        
        System.out.println("Nhap vao so luong hoc sinh :");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap thong tin hoc sinh trong danh sach !");
        for(int i =0 ; i<n; i ++){
            System.out.println("\tHoc sinh thu " + (i+1) + " la :");
            hs= new HocSinh();
            hs.NhapThongTin(sc);
            themHS(hs);       
    }
    }
    
    public void HienThiDS(){
        int n = dshs.size();
        for(int i=0 ; i<n ; i++){
            System.out.println("\t Hoc sinh thu " +(i+1)+" la:");
            dshs.get(i).HienThiThongTin();
        }
    }
    
    public void TimKiemThongTin( int namSinh ,String Que){
        for(HocSinh hs: dshs){
            if((hs.getNgaySinh().getYear()+1900==namSinh)&& Que.trim().equalsIgnoreCase(hs.getQueQuan().trim())){
                hs.HienThiThongTin();
            }
        }
    }
    public void TimKiemThongTin(String Lop){
        for(HocSinh hs:dshs){
            if(Lop.equals(hs.getLop_250()))
                hs.HienThiThongTin();
        }
    }
}
