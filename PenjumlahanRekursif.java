import java.util.Scanner;
// REKURSIF
public class PenjumlahanRekursif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat positif: ");
        int n = input.nextInt();

        // Validasi input bilbul
        if (n <= 0) {
            System.out.println("Harap masukkan bilangan bulat positif.");
        } else {
            int hasil = sumRecursive(n);
            System.out.println("Hasil penjumlahan rekursif dari 1 hingga " + n + " adalah: " + hasil);
        }
    }

    // func rekursif untuk menghitung penjumlahan
    private static int sumRecursive(int n) {
        //  logic rekursi
        if (n == 1) {
            return 1;
        } else {
            // step by step proses rekursif
            return n + sumRecursive(n - 1);
        }
    }
}