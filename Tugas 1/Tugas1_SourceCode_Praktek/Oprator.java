/* Contoh pengoperasian variabel bertype dasar */
/*13020240021
M. Rivaldi Juliadin
Jumat,3/4/2026
19:00*/
public class Oprator {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        boolean Bool1, Bool2, TF;
        int i,j, hsl ;
        float x,y,res;
        /* algoritma */
        System.out.println("Silahkan baca teksnya dan tambahkan perintah program di bawah ini untuk menampilkan output program");
        Bool1 = true; Bool2 = false;
        TF = Bool1 && Bool2 ; /* Boolean AND */
        System.out.println("Operasi Logika");
        System.out.println("Bool1 && Bool2 = " + TF);
        TF = Bool1 || Bool2 ; /* Boolean OR */
        System.out.println("Bool1 || Bool2 = " + TF);
        TF = ! Bool1 ; /* NOT */
        System.out.println("!Bool1 = " + TF);
        TF = Bool1 ^Bool2; /* XOR */
        System.out.println("Bool1 ^ Bool2 = " + TF);
        /* operasi numerik */
        System.out.println("\nOperasi Numerik");
        i = 5; j = 2 ;
        hsl = i+j;
        System.out.println(i + " + " + j + " = " + hsl);
        hsl = i - j;
        System.out.println(i + " - " + j + " = " + hsl);
        hsl = i / j;
        System.out.println(i + " / " + j + " = " + hsl);
        hsl = i * j;
        System.out.println(i + " * " + j + " = " + hsl);
        hsl = i /j ; /* pembagian bulat */
        System.out.println(i + " / " + j + " (bulat) = " + hsl);
        hsl = i%j ; /* sisa modulo */
        System.out.println(i + " % " + j + " = " + hsl);
        /* operasi numerik */
        System.out.println("\nOperasi Numerik dengan tipe data float");
        x = 5 ; y = 5 ;
        res = x + y;
        System.out.println(x + " + " + y + " = " + res);
        res = x - y;
        System.out.println(x + " - " + y + " = " + res);
        res = x / y;
        System.out.println(x + " / " + y + " = " + res);
        res = x * y;
        System.out.println(x + " * " + y + " = " + res);
        /* operasi relasional numerik */
        System.out.println("\nOperasi Relasional");
        TF = (i==j);
        System.out.println("(" + i + " == " + j + ") = " + TF);
        TF = (i!=j);
        System.out.println("(" + i + " != " + j + ") = " + TF);
        TF = (i < j);
        System.out.println("(" + i + " < " + j + ") = " + TF);
        TF = (i > j);
        System.out.println("(" + i + " > " + j + ") = " + TF);
        TF = (i <= j);
        System.out.println("(" + i + " <= " + j + ") = " + TF);
        TF = (i >= j);
        System.out.println("(" + i + " >= " + j + ") = " + TF);
        /* operasi relasional numerik */
        System.out.println("\nOperasi Relasional dengan tipe data float");
        TF = (x != y);
        System.out.println("(" + x + " != " + y + ") = " + TF);
        TF = (x < y);
        System.out.println("(" + x + " < " + y + ") = " + TF);
        TF = (x > y);
        System.out.println("(" + x + " > " + y + ") = " + TF);
        TF = (x <= y);
        System.out.println("(" + x + " <= " + y + ") = " + TF);
        TF = (x >= y);
        System.out.println("(" + x + " >= " + y + ") = " + TF);
    }
}