import java.util.Scanner;

public class KakoeBolshe {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        if (a > b)
            System.out.println(1);
        else if (b > a)
            System.out.println(2);
        else
            System.out.println(0);
    }
}
