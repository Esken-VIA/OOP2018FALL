import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class KolDelCh {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int k = 0;
        for (int i = 1; i <= sqrt(a)-1; i++) {
            if (a % i == 0)
                k++;
        }
        if (a%sqrt(a) == 0)
            System.out.println(2*k+1);
        else
            System.out.println(2*k);
    }
}
