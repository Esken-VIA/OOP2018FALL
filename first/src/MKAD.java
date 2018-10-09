import java.io.IOException;
import java.util.Scanner;

public class MKAD {
    public static void main(String args[]) throws IOException {
        int v, t;
        int s;
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt();
        t = sc.nextInt();
        s = (v *t)%109;
        System.out.println((s+109)%109);
    }
}
