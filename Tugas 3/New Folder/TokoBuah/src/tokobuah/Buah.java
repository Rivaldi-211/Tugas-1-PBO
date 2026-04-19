/*13020240021
M. Rivaldi Juliadin
Minggu, 19/04/2026
14:00 WITA
*/
package tokobuah;

public class Buah{
    private String nama;
    private double harga;
    private int stok;
    
    public Buah(String n, double h, int s){
        this.nama = n;
        this.harga = h;
        this.stok = s;
    }
    
    public String getInfo(){
        return String.format("%-8s Rp %,6.0f (stok:%d kg)",
        nama, harga, stok);
    }
    
    public double htungTotal(int qty){
        return harga * qty;
    }
    
    public boolean tersedia(int qty){
        if (stok >= qty){
           stok -= qty;
           return true;
        }
        return false;
    }
    
    
    
    
    
    
}