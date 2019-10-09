/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118056.latihan19.tabungan;

/**
 *
 * @author 
 * NAMA     : Mirrazibrahim
 * KELAS    : IF-2
 * NIM      : 10118056
 */
public class PBO210118056Latihan19Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,total,bunga;
        total=2500000;
        bunga= (int) (total*0.15);
        total=total+bunga;
        i=1;
        do{
            System.out.println("Saldo di bulan ke-" + i +" Rp." + total);
            i++;
            bunga= (int) (total*0.15);
            total +=bunga;
        }while(i<=6);
    }
    
}
