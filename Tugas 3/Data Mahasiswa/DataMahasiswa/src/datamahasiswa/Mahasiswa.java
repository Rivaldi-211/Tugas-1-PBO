/*13020240021
M. Rivaldi Juliadin
Minggu, 19/04/2026
14:00 WITA
*/
package datamahasiswa;
import java.util.Scanner;

public class Mahasiswa {
    private String nama;
    private String nim;
    private int[] nilai;
    private int jumlahMK;
    
    public Mahasiswa(String nm, String ni, int jmk){
    this.nama = nm;
    this.nim = ni;
    this.jumlahMK = jmk;
    this.nilai = new int[jmk];
    }
    
    public void inputNilai(Scanner sc){
        for (int i=0; i < jumlahMK; i++ ){
            System.out.print("NilaiMk " + (i+1) + " = ");
            nilai[i]=sc.nextInt();
        }
    }
    
    public double hitungRataRata(){
        int total = 0;
        for (int i=0; i<jumlahMK; i++){
            total += nilai[i];
        }
        return (double) total / jumlahMK;
    }
    
    public char tentukanGrade(){
        double avg = hitungRataRata();
        if (avg >= 85) return 'A';
        else if (avg >= 75) return 'B';
        else if (avg >= 60) return 'C'; 
        else return 'D';
    }
    
    public boolean lulus(){
        return hitungRataRata() >= 60;
    }
    
    public void tampilRapor(){
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
        System.out.println("Nilai : ");
        for (int i=0; i<jumlahMK; i++)
            System.out.println(" MK-" + (i+1) +" : " + nilai[i]);
        System.out.printf("Rata : %.2f\n", hitungRataRata());
        System.out.println("Grade : " + tentukanGrade());
        System.out.println("Lulus : " + (lulus() ? "Ya" : "Tidak"));
    }
}
