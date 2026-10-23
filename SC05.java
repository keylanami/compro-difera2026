import java.util.Scanner;

public class SC05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // mental idea: catet SEMUA hasil yang mungkin dicapai setelah tiap bilangan
        // hasilnya bisa negatif, jadi indeks digeser sebesar GESER
        int GESER = 200000; // nilai terbesar yang mungkin: 20 x 10000 = 200000.
        int UKURAN = 2 * GESER + 1;

        boolean[] bisa = new boolean[UKURAN];
        bisa[a[0] + GESER] = true;       // bilangan pertama selalu jadi nilai awal

        for (int i = 1; i < n; i++) {
            boolean[] berikutnya = new boolean[UKURAN];
            for (int nilai = 0; nilai < UKURAN; nilai++) {
                if (bisa[nilai]) {
                    int tambah = nilai + a[i];
                    int kurang = nilai - a[i];
                    if (tambah < UKURAN) berikutnya[tambah] = true;
                    if (kurang >= 0) berikutnya[kurang] = true;
                }
            }
            bisa = berikutnya;
        }

        if (bisa[target + GESER]) {
            System.out.println("MUNGKIN");
        } else {
            System.out.println("TIDAK MUNGKIN");
        }
    }
}
