/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai10;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        QuanLy ql= new QuanLy();
        ql.nhapDS(sc);
        
        System.out.println("Danh sach bien lai cua cac ho gia dinh ");
        ql.HienThiDS();
        
        sc.close();
        
    }
}
