import java.util.Scanner;

public class SC01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        int banyakSuku = n + m;
        int suku = a;               

        for (int i = 1; i <= banyakSuku; i++) {
            if (i > 1) {
                System.out.print(" ");
                suku = suku + b;    
            }
            System.out.print(suku);
        }
        System.out.println();
        System.out.println(suku);   
    }
}
