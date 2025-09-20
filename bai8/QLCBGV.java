package Bai8;
import java.util.*;
public class QLCBGV {
    private ArrayList<CanBoGV> dscbgv;
    public QLCBGV(){
        dscbgv = new ArrayList<CanBoGV>(10);
    }
    public void themCBGV(CanBoGV cbgv){
        dscbgv.add(cbgv);
    }
    public void NhapVaoDS(Scanner sc){
        CanBoGV cbgv ;
        System.out.println("Nhap vao so luong can bo :");
        int n =sc.nextInt();
        sc.nextLine(); 
        System.out.println("Nhap vao danh sanh:");
        for(int i =0; i<n; i++){
            System.out.println("Can bo thu "+(i+1)+" la :");
            cbgv= new CanBoGV();
            cbgv.NhapThongTin(sc);
            themCBGV(cbgv);
        }
    }
    public void HienThiDS(){
        for(CanBoGV cbgv :dscbgv){
            cbgv.HienThiThongTin();           
        }
    }
    public void TimKiem( double Luong){
        for(CanBoGV cbgv :dscbgv){
            if(cbgv.getLUongThucLinh()>=Luong){
                cbgv.HienThiThongTin();
            }
        }
    }
}
