import java.util.Scanner;
        import static java.lang.Math.pow;
        import static java.lang.StrictMath.sqrt;

public class A {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        int a,b;
        double c;
        a=input.nextInt();
        b=input.nextInt();
        c= sqrt(pow(a, 2)+pow(b, 2));
        System.out.print(c);
    }
}
