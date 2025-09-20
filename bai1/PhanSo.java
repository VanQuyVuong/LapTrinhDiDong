package Bai1;
import java.util.Scanner;

public class PhanSo {
    private int tuSo250 ;
    private int mauSo250;

    public PhanSo() {
    this.tuSo250 = 0;
    this.mauSo250 = 1; 
}
    public int getTuSo250() {
        return tuSo250;
    }
    public void setTuSo250(int tuSo250) {
        this.tuSo250 = tuSo250;
    }
    public int getMauSo250() {
        return mauSo250;
    }
    public void setMauSo250(int mauSo250) {
        this.mauSo250 = mauSo250;
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo250 = tuSo;
        this.mauSo250 = mauSo;
    }
 
     public void NhapPhanSo(Scanner sc){
         int a; 
         int b;
         do{
         System.out.println("\n Nhap vao tu so :");
         a= sc.nextInt();
         System.out.print("\n Nhap vao mau so:");
         b=sc.nextInt();
         if(b==0 ){
             System.out.println("Mau so khong duoc bang khong:");            
         }else
         {
             this.tuSo250=a;
             this.mauSo250=b;            
         }
         }while(b==0);
     }
     public void hienThiPS(){
         if(mauSo250*tuSo250 <0){
             System.out.println("\t -"+Math.abs(tuSo250)+"/"+Math.abs(mauSo250));
         }else
         {
             System.out.println("\t "+Math.abs(tuSo250)+"/"+Math.abs(mauSo250));
         }
     }     
     public PhanSo congPS(PhanSo ps2){
         int a = tuSo250*ps2.mauSo250+ps2.tuSo250*mauSo250;
         int b = mauSo250*ps2.mauSo250;        
         return new PhanSo(a,b);
     }    
     public PhanSo truPS(PhanSo ps2){
         int a = tuSo250*ps2.mauSo250-ps2.tuSo250*mauSo250;
         int b = mauSo250*ps2.mauSo250;
         
         return new PhanSo(a,b);
     }
    public PhanSo nhanPS(PhanSo ps2){
         int a = tuSo250*ps2.tuSo250;
         int b = mauSo250*ps2.mauSo250;        
         return new PhanSo(a,b);
     }     
     public PhanSo chiaPS(PhanSo ps2){
         int a = tuSo250*ps2.mauSo250;
         int b = mauSo250*ps2.tuSo250;         
         return new PhanSo(a,b);
     }     
     public int UCLN(int a , int b ){
         while( a!=b){
             if(a>b){
                 a=a-b;
             }else
             {
                 b=b-a;
             }
         }
         return a;
     }     
     public boolean kiemTraPSTG(){
         if(UCLN(tuSo250,mauSo250)==1){
             return true;
         }else
             return false;
     }
     
     public void toiGianPS(){
         int x= UCLN(tuSo250, mauSo250);
         tuSo250/=x;
         mauSo250/=x;
     }
}
