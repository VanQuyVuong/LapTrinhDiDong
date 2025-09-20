/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai8;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        QLCBGV dscbgv = new QLCBGV();
        
        dscbgv.NhapVaoDS(sc);
        
        System.out.println("Danh sach nhung can bo co luong tren 8 trieu la :");
        dscbgv.TimKiem(8000000);
        sc.close();
    }
}
