package Bai5;
import java.text.ParseException;
import java.util.*;
public class KhuPho  {
    private ArrayList<HoDan> dshd;    
    public KhuPho(){
        dshd = new ArrayList<HoDan>(10);
    }
    public void ThemHoDan(HoDan hoDan){
        dshd.add(hoDan);       
    }
    public void NhapDanhSach(Scanner sc) throws ParseException{
        HoDan hoDan;
        System.out.println("\nNhap vao so ho dan :");
        int soHoDan=sc.nextInt();
        sc.nextLine();
        System.out.println("\nNhap vao thong tin cho tung ho dan");
        for(int i =0; i<soHoDan; i++){
            System.out.println("\nHo dan thu"+(i+1)  +" la :");
            hoDan= new HoDan();
            hoDan.NhapThongTin(sc);
            ThemHoDan(hoDan);
        }
    }
    public void HienThiDanhSach(){
        int n = dshd.size();
        
        for(int i =0; i< n ; i++){
            System.out.println("\nHp dan thu : "+(i+1) +"  la :");
            dshd.get(i).HienThiThongTin();
        }
    }    
    public void TimKiemThongTin() {
    Calendar cal = Calendar.getInstance();
    int namhientai = cal.get(Calendar.YEAR);

    for (HoDan hoDan : dshd) {
        Nguoi[] dstv = hoDan.getList();
        for (int i = 0; i < hoDan.getSoNguoi(); i++) {
            Date ngaySinh = dstv[i].getNgaySinh();
            if (ngaySinh != null) {
                cal.setTime(ngaySinh);
                int namsinh = cal.get(Calendar.YEAR);
                int tuoi = namhientai - namsinh;

                if (tuoi >= 80) {
                    System.out.println("Tim thay nguoi 80 tuoi trong ho dan:");
                    hoDan.HienThiThongTin();
                }
            }
        }
    }
}

}