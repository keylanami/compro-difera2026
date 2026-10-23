import java.util.Scanner;

public class SC04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int panjang = s.length();

        // bandingkan huruf ke-i dari depan dengan huruf ke-i dari belakang
        boolean palindrom = true;
        for (int i = 0; i < panjang / 2; i++) {  // i < panjang/2 means cukup sampai setengah string aja
            if (s.charAt(i) != s.charAt(panjang - 1 - i)) {
                palindrom = false;
            }
        }

        if (palindrom) {
            System.out.println("PALINDROM");
        } else {
            System.out.println("BUKAN PALINDROM");
        }
    }
}
