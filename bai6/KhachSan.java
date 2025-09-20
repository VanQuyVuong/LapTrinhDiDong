package Bai6;
import java.util.*;

public class KhachSan {
   private ArrayList<KhachTro> ds;
   
   public KhachSan(){
       ds= new ArrayList<KhachTro>(10);
   }
   
   public void themKhachTro(KhachTro kt){
       ds.add(kt);
   }

   public void xoaKhachTro(int cmnd){
       Iterator<KhachTro> it = ds.iterator();
       while(it.hasNext()){
           if(it.next().getCMND()==cmnd){
               it.remove();
               break;
           }
       }
   }

   public void NhapDanhSach (Scanner sc){
       KhachTro khach;
       int chon;
       do {
           System.out.println("Chon 1 de nhap thong tin khach tro");
           System.out.println("Chon 2 de xoa thong tin khach tro");
           System.out.println("Chon 3 de tinh tien");
           System.out.println("Chon 4 de thoat");
           chon=sc.nextInt();sc.nextLine();
           switch (chon){
               case 1:
                   System.out.println("Nhap vao so luong khach:");
                   int n = sc.nextInt();
                   sc.nextLine();
                   for(int i =0 ; i<n ; i++){
                       System.out.println("Khach tro thu " + (i+1)+" la :");
                       khach=new KhachTro();
                       khach.NhapThongTin(sc);
                       themKhachTro(khach);
                       khach.HienThiThongTin();
                   }
                   break;
               case 2:
                   System.out.println("Nhap vao so cmnd khach tro can xoa:");
                   int cmnd = sc.nextInt();
                   sc.nextLine();
                   xoaKhachTro(cmnd);
                   System.out.println("Danh sach khach tro sau khi xoa:");
                   hienThiDanhSach();
                   break;
           
               case 3:
                System.out.print("Nhap cmnd khach can tinh tien: ");
                int cmndtinhtien = sc.nextInt();
                System.out.println("==> Tong tien la: " + tinhTien(cmndtinhtien));
                break;
            case 4:
                return; 
            default:
                System.out.println("Lua chon khong hop le");
           }
       } while(chon!=4);
   }
   public void hienThiDanhSach() {
    if (ds.isEmpty()) {
        System.out.println("Danh sach khach tro dang rong!");
        return;
    }
    System.out.println("=== Danh sach khach tro ===");
    for (KhachTro kt : ds) {
        kt.HienThiThongTin(); // in thông tin từng khách
    }
}

   public double tinhTien(int cmnd){
       double tien=0;
       for(KhachTro khach : ds){
           if(khach.getCMND()==cmnd){
               tien=khach.getSoNgayTro()*khach.getGiaPhong();
           }
       }
       return tien;
   }
}
