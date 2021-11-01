import java.util.Scanner;

public class BelajarForPola2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan nilai n = ");
        int n = scan.nextInt();
        if (n % 2 == 0) {
            for (int a = 1; a <= n; a++) {
                for (int b = 1; b <= a; b++) {
                    System.out.print("*");
                }
                System.out.println();
            }   
            // lengkapi sendiri
        } else {
            for (int i = 1; i<=n ; i++) {
                for (int j=n; j>=1; j--) {
                    if (j<=i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
    
}
