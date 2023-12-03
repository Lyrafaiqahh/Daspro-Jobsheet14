import java.util.Scanner;
// ITERATIF
public class TugasNo1Teori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input N dari pengguna
        System.out.print("Masukkan nilai N: ");
        int N = scanner.nextInt();

        // Memanggil fungsi iteratif
        int hasil = hitungTotal(N);

        // Mencetak hasil
        System.out.println("Total iteratif dari 1 sampai " + N + " adalah: " + hasil);
    }

    static int hitungTotal(int N) {
        int total = 0;
        for (int i = 1; i <= N; i++) {
            total += i;
        }
        return total;
    }
}
