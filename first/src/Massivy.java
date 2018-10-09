import java.util.Scanner;

public class Massivy {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = 0;

        int[] m = new int[a];
        for (int i = 0; i < a; i++) {
            m[i] = sc.nextInt();
        }

        for (int i = a-1; i>=0; i--) {
            System.out.print(m[i]+" ");
        }
    }
}
