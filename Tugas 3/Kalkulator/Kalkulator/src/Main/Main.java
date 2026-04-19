/*13020240021
M. Rivaldi Juliadin
Minggu, 19/04/2026
14:00 WITA
*/
package Main;


import java.util.Scanner;
import kalkulator.Kalkulator;


public class Main{
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
            char lagi;
            System.out.flush();
            do {
                System.out.print("Masukkan angka1: ");
                double angka1 = sc.nextDouble();
                
                System.out.print("Masukkan angka2: ");
                double angka2 = sc.nextDouble();
                
                System.out.print("Operator (+, _, *, /): ");
                char operator = sc.next().charAt(0);
                
                Kalkulator k = new Kalkulator(angka1, angka2, operator);
                
                k.tampilHasil();
                
                System.out.print("Hitung lagi? (y/n): ");
                lagi = sc.next().charAt(0);
                
            } while (lagi == 'y'); 
            
            System.out.println("Terima kasih!");
    }
}