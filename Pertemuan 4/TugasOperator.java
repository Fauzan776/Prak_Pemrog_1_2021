import java.util.Scanner;

public class TugasOperator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan nilai a : ");
        double a = scan.nextDouble();
        
        System.out.print("Masukkan nilai b : ");
        int b = scan.nextInt();

        double hasil = a + b;
        System.out.println("Hasil penjumlahan : " + hasil);

        hasil = a - b;
        System.out.println("Hasil pengurangan : " + hasil);

        hasil = a * b;
        System.out.println("Hasil perkalian : " + hasil);

        hasil = a / b;
        System.out.println("Hasil pembagian : " + hasil);

        hasil = a % b;
        System.out.println("Hasil modulus : " + hasil);
    }
}
