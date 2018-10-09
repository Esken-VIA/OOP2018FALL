import java.util.Scanner;

public class B {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int a, b, c;
        a = input.nextInt();
        b = a+1;
        c = a-1;
        System.out.println("The next number for the number "+a+" is "+b+".");
        System.out.println("The previous number for the number "+a+" is "+c+".");
    }
}
