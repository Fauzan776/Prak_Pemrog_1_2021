import java.util.Scanner;

public class Tugas8 {
    public static void main(String[] args) {
        String[] namaMahasiswa = new String[1000];
        double[] ipk = new double[1000];
        String stop = "exit";
        double jumlah, rerata;
        int i;

        jumlah = 0;
        for (i = 0; i<1000; i++) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Data " + (i+1));
            System.out.print("Nama Mahasiswa = ");
            namaMahasiswa[i] = scan.nextLine();
            if (namaMahasiswa[i].equals(stop)) {
                break;
            }

            System.out.print("IPK Mahasiswa = ");
            ipk[i] = scan.nextDouble();
            
            jumlah += ipk[i];
        }

        rerata = jumlah / (i+1);

        System.out.println("no  nama \t" + "IPK");
        System.out.println("---------------------");
        for (i=0; i<namaMahasiswa.length; i++) {
            if (namaMahasiswa[i].equals(stop)) {
                break; 
            } else {
                System.out.println(i+1 + ". " + namaMahasiswa[i] + "\t" + ipk[i] );
            }
        }
        System.out.println("rerata= \t" + rerata);
    }
}
