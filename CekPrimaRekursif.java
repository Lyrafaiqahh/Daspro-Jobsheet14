import java.util.Scanner;

public class CekPrimaRekursif {

    static boolean cekPrima(int n, int i) {
        if (i == 1) {
            return true;  
        } else {
            if (n % i == 0) {
                return false;
            }
            return cekPrima(n, i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input bilangan n: ");
        int n = sc.nextInt();

        if (cekPrima(n, n / 2)) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }
    }
}
