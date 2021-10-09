import java.util.Scanner;

public class TugasPertemuan6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Masukkan nilai n maksimal untuk deret= ");
        int n = scan.nextInt();

        int u = 0;
        int i = 1;
        while (i != n) {
            if (i == Math.pow(5,u)) {
                System.out.println(i);
                u++;
            }
            i++;
        }
    }
}
