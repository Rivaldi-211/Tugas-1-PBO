/*13020240021
M. Rivaldi Juliadin
Minggu, 19/04/2026
14:00 WITA
*/
package kalkulator;

public  class Kalkulator{
    private double angka1;
    private double angka2;
    private char operator;
    
    public Kalkulator(double a1,double a2, char op){
        this.angka1 = a1;
        this.angka2 = a2;
        this.operator = op;
    }
    
    public double tambah(){
        return angka1 + angka2;
    }
    public double kurang(){
        return angka1 - angka2;
    }
    public double kali(){
        return angka1 * angka2;
    }
    public double bagi(){
        if (angka2 == 0){
            System.out.println("Error: Tidak bisa membagi dengan 0");
            return 0;
        }
        return angka1 / angka2;
    }
    
    public void tampilHasil(){
        double hasil;
        switch (operator) {
            case '+':
                hasil = tambah();
                System.out.println("Hasil =" + angka1 + " + " + angka2 + " = " + hasil);
                
                break;
            case '-':
                hasil = kurang();
                System.out.println("Hasil =" + angka1 + " - " + angka2 + " = " + hasil);
                
                break;
            case '*':
                hasil = kali();
                System.out.println("Hasil =" + angka1 + " * " + angka2 + " = " + hasil);
                break;
            case '/':
                hasil = bagi();
                if (angka2 == 0){
                    System.out.println("Error: Pembagian dengan nol");
                }
                System.out.println("Hasil =" + angka1 + " / " + angka2 + " = " + hasil);
                
                break;
            default:
                System.out.println("Operator tidak dikenali");
        }
    }
}