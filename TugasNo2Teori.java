import java.util.Scanner;
public class TugasNo2Teori {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input N, yaitu jumlah elemen deret Fibonacci yang ingin dihasilkan
        System.out.print("Masukkan jumlah elemen deret Fibonacci: ");
        int N = scanner.nextInt();

        // Menghitung dan mencetak deret Fibonacci
        System.out.println("Deret Fibonacci dengan " + N + " elemen:");
        for (int i = 0; i < N; i++) {
            System.out.print(fibonacciIterative(i) + " ");
        }
    }

    static int fibonacciIterative(int n) {
        if (n <= 1) {
            return 1;
        } else {
            int a = 1, b = 1, result = 0;
            for (int i = 2; i <= n; i++) {
                result = a + b;
                a = b;
                b = result;
            }
            return result;
        }
    }
}


