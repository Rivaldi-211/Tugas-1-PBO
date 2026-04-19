/*13020240021
M. Rivaldi Juliadin
Minggu, 19/04/2026
14:00 WITA
*/
package Main;

import datamahasiswa.Mahasiswa;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nama: ");
            String nama = sc.nextLine();
        System.out.print("Nim: ");
            String nim = sc.nextLine();
        System.out.print("Jumlah MK: ");
            int jmk = sc.nextInt();
            
        Mahasiswa mhs = new Mahasiswa(nama, nim, jmk);
        mhs.inputNilai(sc);
        
        System.out.println("\n=== RAPOR ===");
        mhs.tampilRapor();
    }
    
}