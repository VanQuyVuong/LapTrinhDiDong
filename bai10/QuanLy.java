/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai10;
import java.util.*;

public class QuanLy {
    private ArrayList<BienLai> ds_250;
    
    public QuanLy(){
        ds_250=new ArrayList<BienLai>(10);
    }   
    public void themBL(BienLai bl){
        ds_250.add(bl);
    }    
    public void nhapDS(Scanner sc){
        BienLai bl ;
        System.out.println("Nhap vao so luong bien lai :");
        int n = sc.nextInt(); sc.nextLine();
        System.out.println("Nhap vao danh sach bien lai ");
        for(int i = 0 ; i <n ;i ++){
            System.out.println("Bien lai thu "+(i+1)+" la :");
            bl= new BienLai();
            bl.Nhap(sc);
            themBL(bl);
        }
    }   
    public void HienThiDS(){
        for (int i =0 ; i< ds_250.size(); i++){
            System.out.println("Bien lai thu "+(i+1)+" la:");
            ds_250.get(i).HienThi();
            System.out.println("");
            
        }
    }
    }
