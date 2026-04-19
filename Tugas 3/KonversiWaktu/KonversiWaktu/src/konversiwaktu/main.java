/*13020240021
M. Rivaldi Juliadin
Minggu, 19/04/2026
14:00 WITA
*/
package konversiwaktu;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan total detik: ");
        long totalDetik = sc.nextLong(); 

        KonversiWaktu kw = new KonversiWaktu(totalDetik);

        kw.konversi();

        kw.tampilkanWaktu();

        sc.close();
    }
    
}
