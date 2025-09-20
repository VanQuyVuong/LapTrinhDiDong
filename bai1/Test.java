
package Bai1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo ps1= new PhanSo();
        PhanSo ps2 = new PhanSo();
        
        System.out.print("\nNhap vao phan so thu nhat:");
        ps1.NhapPhanSo(sc);
        
        System.out.print("\nNhap vao phan so thu hai:");
        ps2.NhapPhanSo(sc);
        
        System.out.print("\n phan so thu nhat la:");
        ps1.hienThiPS();
        
        System.out.print("\n phan so thu hai la:");
        ps2.hienThiPS();
        
        int loai;
        do{
        System.out.print(" \nChon loai phuong thuc:");
        System.out.print(" \n 1.Cong 2 Phan so: \n 2.Tru 2 Phan so : \n 3.Nhan 2 Phan so \n 4.Chia 2 Phan so \n 5.Thoat \n ");
        loai = sc.nextInt();
        switch(loai){
            case 1 -> { 
                PhanSo a = ps1.congPS(ps2);
                System.out.print("Tong = ");
                a.hienThiPS();
            }
            case 2  ->{
                PhanSo b = ps1.truPS(ps2);
                System.out.print("Hieu :");
                b.hienThiPS();
            }
            case 3 ->{
                PhanSo c= ps1.nhanPS(ps2);
                System.out.print("Tich :");
                c.hienThiPS();
            }
            case 4 ->{
                PhanSo d= ps1.chiaPS(ps2);
                System.out.print("Thuong :");
                d.hienThiPS();
            }  
            case 5 ->{
                System.out.println("Thoat chuong trinh!");
            }
            default -> {
                System.out.println("Lua chon khong hop le!");
            }
                   
    }
}while(loai!=5);
}
}
