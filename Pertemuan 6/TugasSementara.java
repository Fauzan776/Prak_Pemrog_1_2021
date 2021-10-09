import java.util.Scanner;

public class TugasSementara {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

        System.out.println(".: Program Siakad :.");
        System.out.println("1. Tambah Data");
        System.out.println("2. Edit Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Lihat Data");
        System.out.print("Menu yang Anda pilih = ");
        int menu = scan.nextInt();
        
        System.out.println("---------------------------");
        if (menu == 1){
            System.out.println("Tambah Data: ");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tambah Data Mata kuliah");
            System.out.println("3. Kembali");
            System.out.print("Menu yang Anda pilih = ");
            int menuLagi = scan.nextInt();
            if (menuLagi == 1){
                Scanner scanner = new Scanner(System.in);
                System.out.print("Masukan nama mahasiswa = ");
                String nama = scanner.nextLine();
                System.out.println("Mahasiswa yang Anda tambah adalah atas nama " + nama);
            } else if (menuLagi == 2){
                Scanner scann = new Scanner(System.in);
                System.out.print("Masukan nama mata kuliah = ");
                String matkul = scann.nextLine();
                System.out.println("Mata kuliah yang Anda tambah adalah " + matkul);
            } else if (menuLagi == 3){
                System.out.println("Terimakasih");
            } else {
                System.out.println("Menu tidak ada");
            }
        } else if (menu >= 2 && menu <=4){
            System.out.println("Fitur belum ada");
        } else {
            System.out.println("Fitur tidak ada");
        }

    }
}