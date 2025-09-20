/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai9;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        QuanLy ql= new QuanLy();
        
        ql.NhapDS(sc);
        
        System.out.println("Danh sach sinh vien tra sach cuoi thang la :");
        ql.HienThiDStraCuoiThang();
        
        sc.close();
    }
}
