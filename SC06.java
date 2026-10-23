import java.util.Scanner;

public class SC06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // setelah satu langkah, hasilnya yang paling besar adalah 9^2 x 10 digit = 810.
        // maka cukup array biasa untuk menandai bilangan yang sudah pernah muncul.
        boolean[] pernah = new boolean[1000];

        while (n != 1) {
            if (n < 1000) {
                if (pernah[n]) {
                    break;              // bilangan muncul lagi -> terjebak siklus
                }
                pernah[n] = true;
            }

            // hitung jumlah kuadrat digit
            int jumlah = 0;
            while (n > 0) {
                int digit = n % 10;
                jumlah = jumlah + digit * digit;
                n = n / 10;
            }
            n = jumlah;
        }

        if (n == 1) {
            System.out.println("SETIA");
        } else {
            System.out.println("BERKHIANAT");
        }
    }
}
