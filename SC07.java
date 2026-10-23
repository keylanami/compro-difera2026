import java.util.Scanner;

public class SC07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // mental idea: bayangkan satu hari sebagai 1440 kotak menit.
        // setiap kegiatan menandai kotak dari menit mulai sampai SEBELUM menit selesai
        // kalau ada kotak yang ditandai dua kali, berarti bertabrakan.
        int[] terpakai = new int[1440];
        boolean tabrakan = false;

        for (int k = 0; k < n; k++) {
            int mulai = sc.nextInt();
            int selesai = sc.nextInt();
            for (int menit = mulai; menit < selesai; menit++) {
                terpakai[menit]++;
                if (terpakai[menit] > 1) {
                    tabrakan = true;
                }
            }
        }

        if (tabrakan) {
            System.out.println("BERTABRAKAN");
        } else {
            System.out.println("AMAN");
        }
    }
}
