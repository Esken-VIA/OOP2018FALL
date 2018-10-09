import java.util.Scanner;
import static java.lang.Math.pow;

public class SpisokSqrs {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        //double pow2 = pow(2, k);
        int pow2 = 1;
        int k = 0;

        while (pow2 < a){
            pow2 <<=1;
            k++;
        }
        System.out.println(k);
    }
}
