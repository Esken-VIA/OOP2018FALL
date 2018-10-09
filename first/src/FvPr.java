import java.util.Scanner;

class Reapetition{
    public String arr(int[] a) {
        String s = "";
        for (int i = 0; i < a.length; i++){
            s += a[i] + " " + a[i] + " ";
        }
        return s;
    }
}

public class FvPr {
    public static void main(String args[]){
        int[] a = {1 , 2 , 3};
        Reapetition rp = new Reapetition();
        System.out.println(rp.arr(a));
    }
}
