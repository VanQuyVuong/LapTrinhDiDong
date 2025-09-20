package Bai2;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
  private ArrayList<CanBo> dscb_250;
  public QLCB(){
      dscb_250= new ArrayList<CanBo>(10);
  }
  public void ThemCanBo(CanBo cb){
      dscb_250.add(cb);     
  } 
  public void NhapDanhSach(Scanner sc) throws ParseException{
      CanBo cb;
      System.out.print("Nhap vao so luong can bo: ");
      int n = sc.nextInt(); sc.nextLine();
      System.out.print("\nNhap thong tin chi tiet :");
      for(int i = 0 ; i< n ; i++){
          System.out.print("\nlAN NHAP THU "+ (i+1)+":");
          System.out.print("\nChon can bo \n 1-Ky Su \n 2-Nhan Vien \n 3-Cong Nhan \n :");
          int chon = sc .nextInt(); sc.nextLine();          
          cb= new CanBo();         
          switch (chon){
              case 1 :
                  cb= new KySu();
                  break;
               case 2 :
                   cb= new NhanVien();
                   break;
               case 3 :
                   cb= new CongNhan();
                   break;
               default :
                   cb= new KySu();
                   break;
          }
          cb.NhapThongTin(sc);
          ThemCanBo(cb);          
      }     
  }
  public void TimKiemCanBo(String hoten){
      for(CanBo cb :dscb_250){
          if(hoten.equals(cb.getHoten_250()))
            cb.HienThiThongTin();
      }
  }
}
