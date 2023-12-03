    import java.util.Scanner;
public class DeretDescending {

    // Fungsi rekursif
    static void deretDescendingRekursif(int jumlah) {
        if (jumlah >= 0) {
            System.out.print(jumlah + " ");
            deretDescendingRekursif(jumlah - 1);
        }
    }

    // Fungsi iteratif
    static void deretDescendingIteratif(int jumlah) {
        for (int i = jumlah; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input nilai n dari pengguna
        System.out.print("Input nilai n: ");
        int jumlah = sc.nextInt();

        System.out.println("\nDeret Descending (Rekursif):");
        deretDescendingRekursif(jumlah);

        System.out.println("\n\nDeret Descending (Iteratif):");
        deretDescendingIteratif(jumlah);
    }
}


