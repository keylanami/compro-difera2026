import java.util.Scanner;

public class SC03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // jalan dulu sekali dari kiri ke kanan sambil menghitung
        // berapa langkah "naik" dan berapa langkah "turun" pada pola saat ini
        int naik = 0;
        int turun = 0;
        int terpanjang = 0;

        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                // naik. kalau sebelumnya lagi turun, berarti pola lama selesai dan pola baru dimulai dari lembah ini
                if (turun > 0) {
                    naik = 0;
                    turun = 0;
                }
                naik++;
            } else if (a[i] < a[i - 1]) {
                // turun hanya dihitung kalau sebelumnya sudah pernah naik
                if (naik > 0) {
                    turun++;
                }
            } else {
                // datar: pola rusak, mulai dari nol lagi
                naik = 0;
                turun = 0;
            }

            // pola puncak sah jika ada naik DAN turun.
            if (naik > 0 && turun > 0) {
                int panjang = naik + turun + 1;
                if (panjang > terpanjang) {
                    terpanjang = panjang;
                }
            }
        }

        System.out.println(terpanjang);
    }
}
