/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        QLHS list = new QLHS();
        
        list.NhapDanhSachHS(sc);
        
        System.out.println("Nhung hoc sinh sinh nam 1985 va que Thai Nguyen la : ");
        list.TimKiemThongTin(1985, "Thai Nguyen");
        
        System.out.println("Nhung hoc sinh hoc lô 10A1 la :");
        list.TimKiemThongTin("10A1");
        
        sc.close();
    }
}
