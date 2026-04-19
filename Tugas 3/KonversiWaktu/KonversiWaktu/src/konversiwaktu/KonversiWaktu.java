/*13020240021
M. Rivaldi Juliadin
Minggu, 19/04/2026
14:00 WITA
*/
package konversiwaktu;

public class KonversiWaktu {
    private long totalDetik;
    private long detikSekarang;
    private long totalMenit;
    private long menitSekarang;
    private long totalJam;
    private long jamSekarang;
   
    public KonversiWaktu(long td){
        this.totalDetik = td;
    }
    
    public long HitungDetikSekarang(){
       detikSekarang = totalDetik%60;
       return detikSekarang;
    }
    public long HitungTotalMenit(){
        totalMenit = totalDetik / 60;
        return totalMenit;
    }
    public long HitungMenitSekarang(){
        menitSekarang = totalMenit % 60;
        return menitSekarang;
    }
    public long HitungTotalJam(){
        totalJam = totalMenit / 60;
        return totalJam;
    }
    public long HitungJamSekarang(){
        jamSekarang = totalJam%24;
        return jamSekarang ;
    }
    
    public void konversi(){
        HitungDetikSekarang();
        HitungTotalMenit();
        HitungMenitSekarang();
        HitungTotalJam();
        HitungJamSekarang();
    }
    
    public void tampilkanWaktu(){
        System.out.println("Total detik: " + totalDetik);
        System.out.println("=================");
        System.out.printf("Waktu: %02d:%02d:%02d%n", 
            jamSekarang, menitSekarang, detikSekarang);
        System.out.println("=================");
        System.out.println();
        System.out.println("Total Detik   : " + totalDetik);
        System.out.println("detikSaat ini : " + detikSekarang);
        System.out.println("menitSaat ini : " + menitSekarang);
        System.out.println("jamSaat ini   : " + jamSekarang);
    }
}
