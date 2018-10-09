import java.util.Scanner;

public class Sqrs {
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        int v=S.nextInt();
        int t=S.nextInt();
        for(int i=v;i<=t;i++){
            double x=Math.sqrt(i*1.0);
            if(((int)(x)*(int)(x))==i){
                System.out.println(i);
            }
        }
    }
}
