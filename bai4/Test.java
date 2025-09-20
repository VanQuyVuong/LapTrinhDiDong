/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       TuyenSinh dsTuyenSinh = new TuyenSinh();
       System.out.print("\nNhap vao danh sach thi sinh :");
       dsTuyenSinh.NhapDanhSach(sc);
       
       System.out.print("\nDanh sach thi sinh du thi la:");
       dsTuyenSinh.HienThiDanhSach();
       
       System.out.print("\nNhap so bao danh can tim:");
       int Sobaodanh = sc.nextInt();
       
       dsTuyenSinh.TimKimTSSBD(Sobaodanh);
       sc.close();
    }
}
