package Bai3;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        QuanLySach qls = new QuanLySach();
        qls.NhapDanhSach(sc);
        System.out.print("\n Nhap vao phuong thuc tim kiem theo: \n 1- Theo loai tai lieu \n 2- Theo ma so tai lieu \n:");
        int chon = sc.nextInt();
        sc.nextLine();
        switch(chon){
            case 1:
                System.out.print("\nNhap vao loai tai lieu can tim:");
                String loai = sc.nextLine();
                qls.TimLoaiTL(loai);
                break;
            case 2:
                
                System.out.print("\nNhap vao ma tai lieu can tim ");
                String maTL = sc.nextLine();
                qls.TimMaTL(maTL);
                break;
                
            default:
               System.out.print("Lua chon khong hop le!"); 
        sc.close();
    }
  }
 }
