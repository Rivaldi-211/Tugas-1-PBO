/*13020240021
M. Rivaldi Juliadin
Minggu, 19/04/2026
14:00 WITA
*/
package tokobuah;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
       Buah[] katalog = new Buah[3];
       katalog [0] = new Buah("Apel", 15000, 10);
       katalog [1] = new Buah("Jeruk", 12000, 8);
       katalog [2] = new Buah("Mangga", 20000, 5);
       
       Scanner sc = new Scanner(System.in);
       
       double total = 0.0;
        System.out.println("=== Toko Buah===");
       
       for(int i=0; i < katalog.length; i++){
           System.out.println((i+1)+ ". " +katalog[i].getInfo());
       }
       
       while(true){
           System.out.print("\nPilih (0=stop): ");
           int pilih = sc.nextInt();
           
           if (pilih == 0) break;
       
           
            System.out.print("Jumlah (kg): ");
            int qty = sc.nextInt();
        
            if(katalog[pilih-1].tersedia(qty)){
                double bayar = katalog[pilih-1].htungTotal(qty);
                total += bayar;
                System.out.printf("OK +Rp%.0f%n", bayar);
            }else{
                System.out.println("Stok tidak cukup");
            } 
        }
       System.out.printf("Total Rp%.0f%n", total);
       sc.close();
       
    }
}
