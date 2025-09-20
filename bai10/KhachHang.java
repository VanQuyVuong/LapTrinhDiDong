/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai10;
import java.util.*;

public class KhachHang {
    protected String hotenchuho_250;
    protected int sonha_250;
    protected String macongto_250;
    
    public KhachHang(){     
    }

    public KhachHang(String hotenchuho, int sonha, String macongto) {
        this.hotenchuho_250 = hotenchuho;
        this.sonha_250 = sonha;
        this.macongto_250 = macongto;
    }
    public void Nhap(Scanner sc){
        System.out.println("Nhap ho ten chu ho :");
        hotenchuho_250=sc.nextLine();
        System.out.println("Nhap so nha :");
        sonha_250=sc.nextInt();sc.nextLine();
        System.out.println("Nhap ma cong to :");
        macongto_250 = sc.nextLine();
    }
    
    public void HienThi(){
        System.out.println("Ho ten chu ho :"  +hotenchuho_250);
        System.out.println("So nha :"+sonha_250);
        System.out.println("Ma cong to : "+macongto_250);
    }
}
