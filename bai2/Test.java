/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner (System.in);
        
        QLCB qlcb = new QLCB();
        qlcb.NhapDanhSach(sc);
        System.out.print("\nNhap vao ho ten can tim :");
        String name= sc.nextLine();
        qlcb.TimKiemCanBo(name);
        
        
        sc.close();
    }
}
