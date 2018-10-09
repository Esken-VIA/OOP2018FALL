import java.util.Scanner;

public class Summa100 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a==0){
                b++;
            }
        }
        System.out.println(b);
    }
}
