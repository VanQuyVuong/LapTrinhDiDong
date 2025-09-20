/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;
import java.text.ParseException;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        Scanner sc= new Scanner(System.in);
        
        KhuPho qlkp = new KhuPho();
        qlkp.NhapDanhSach(sc);
        
        System.out.println("\nDanh sach ho dan co nguoi mung tho 80 tuoi la :");
        qlkp.TimKiemThongTin();
    }
   
}
