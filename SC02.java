import java.util.Scanner;

public class SC02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        
        // siapin dulu matriks baru dengan ordo M x N
        int[][] awal = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                awal[i][j] = sc.nextInt();
            }
        }

        // pindahkan setiap elemen
        int[][] hasil = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                hasil[j][n - 1 - i] = awal[i][j]; // baris ke-i dari matriks awal menjadi kolom ke-(n-1-i) pada hasil
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j > 0) System.out.print(" ");
                System.out.print(hasil[i][j]);
            }
            System.out.println();
        }
    }
}
