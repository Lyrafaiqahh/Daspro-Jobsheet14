import java.util.Scanner;

public class TugasNo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah tahun (N)
        System.out.print("Input jumlah tahun investasi: ");
        int N = scanner.nextInt();

        // Input jumlah uang awal yang diinvestasikan
        System.out.print("Masukkan jumlah uang awal: ");
        double jumlahUang = scanner.nextDouble();

        // Panggil fungsi rekursif untuk menghitung jumlah uang setelah N tahun
        double hasilInvestasi = hitungInvestasiEmas(N, jumlahUang);

        // Cetak hasil investasi
        System.out.println("Jumlah uang setelah " + N + " tahun adalah: " + hasilInvestasi);
    }

    static double hitungInvestasiEmas(int N, double jumlahUang) {
        // Basis kasus: jika N menjadi 0, kembalikan jumlah uang
        double P;
        if (N == 0) {
            return jumlahUang;
        } else {
            // Keuntungan tahunan
            double keuntunganTahunan = 0.117;

            // Hitung keuntungan tahun ini
            double keuntunganTahunIni = keuntunganTahunan * jumlahUang;

            // Rekursif: hitung investasi untuk tahun selanjutnya
            P = hitungInvestasiEmas(N - 1, jumlahUang + keuntunganTahunIni);
            return P;
        }
    }
}
