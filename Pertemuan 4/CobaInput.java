import java.util.Scanner;

    public class CobaInput {
        public static void main(String[] args){
            System.out.print("Ini adalah program ");
            System.out.println("saya");
            
            Scanner scan = new Scanner(System.in);

            System.out.print("Masukkan Nama Anda: ");
            String namaDepan = scan.nextLine();

            System.out.print("Masukkan umur Anda: ");
            int umur = scan.nextInt();

            System.out.println("Nama Anda adalah " + namaDepan);
            System.out.println("Umur Anda adalah " + umur); 
        }
    }