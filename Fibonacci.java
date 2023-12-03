public class Fibonacci {
    
    static int hitungPasanganMarmut(int bulan) {
        if (bulan <= 2) {
            return 1;  // Base case
        } else {
            return hitungPasanganMarmut(bulan - 2) + hitungPasanganMarmut(bulan - 1);
        } // recursion call
    }

    public static void main(String[] args) {
        int bulan = 12;
        int jmlhPasangan = hitungPasanganMarmut(bulan);

        System.out.println("Jumlah pasangan marmut pada akhir bulan ke-" + bulan + ": " + jmlhPasangan);
    }
}
