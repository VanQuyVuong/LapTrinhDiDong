package Bai4;
import java.util.ArrayList;
import java.util.Scanner;
public class TuyenSinh {
    private ArrayList<ThiSinh> dsts;
    public TuyenSinh(){
        dsts = new ArrayList<ThiSinh>(10);
    }
    public void ThemThiSinh(ThiSinh ts){
        dsts.add(ts);
    }
    public void NhapDanhSach(Scanner sc){
        ThiSinh ts;
        int chon;       
        System.out.print("\nNHAP VAO SO LUONG THI SINH :");
        int n = sc.nextInt(); sc.nextLine();       
        for(int i =0 ; i<n ; i++){
            System.out.print("\nThi sinh thuoc khoi nao \n 1- Khoi A \n 2- Khoi B \n 3-Khoi C \n:");
            chon= sc.nextInt();    
            switch (chon){
            case 1:
                ts=new KhoiA("Toan","Ly","hoa");
                break;
            case 2:
                ts=new KhoiB("Toan","hoa","Sinh");
                break;
            case 3:
                ts= new KhoiC("Van","Su","Dia");
                break;
            default :
                ts=new KhoiA("Toan","Ly","hoa");
                break;
        }
        ts.NhapThongTin(sc);
        ThemThiSinh(ts);
    }
    }
    
    public void HienThiDanhSach(){
        int n = dsts.size();
        for(int i =0 ; i<n ; i++)
        {
            System.out.print("\nThi sinh thu " + (i+1)+" la :");
            dsts.get(i).HienThiThongTin();
        }
        
    }
    public void TimKimTSSBD(int Sobaodanh){
        for(ThiSinh ts :dsts)
        if(ts.getThiSinh()==Sobaodanh){
            ts.HienThiThongTin();
        }
    }
}
