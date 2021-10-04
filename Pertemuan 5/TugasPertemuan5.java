import java.util.Scanner;

public class TugasPertemuan5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = scan.nextLine();
        
        System.out.print("Masukkan Prodi Anda: ");
        String prodi = scan.nextLine();

        System.out.print("Masukkan nilai IPK Anda: ");
        double nilai = scan.nextDouble();

        System.out.print("Masukkan lama studi Anda (dalam tahun): ");
        double studi = scan.nextDouble();

        System.out.println("Nama Anda adalah " + nama);
        System.out.println("Prodi Anda Adalah " + prodi);
        if((nilai >= 3.51 && nilai <= 4.0) && (studi == 4)) {
            System.out.println("Selamat! Anda lulus dengan predikat Summa Cumlaude.");
        } else if((nilai >= 3.51 && nilai <= 4.0) && (studi > 4)) {
            System.out.println("Selamat! Anda lulus dengan predikat Cumlaude.");
        } else if((nilai >= 3.01 && nilai < 3.51) && (studi >= 4)) {
            System.out.println("Selamat! Anda lulus dengan predikat sangat memuaskan.");
        } else if((nilai >= 2.76 && nilai < 3.01) && (studi >= 4)) {
            System.out.println("Selama! Anda lulus dengan predikat memuaskan.");
        } else if((nilai >= 2.00 && nilai < 2.76) && (studi >= 4)) {
            System.out.println("Selamat! Anda lulus dengan predikat cukup.");
        } else if((nilai >= 0 && nilai < 2.00) && (studi >= 4)) {
            System.out.println("Mohon maaf! Anda tidak lulus.");
        } else {
            System.out.println("Nilai tidak valid!");
        } 
    }
}