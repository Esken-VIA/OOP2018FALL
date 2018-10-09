import java.util.Scanner;

class Data{
    private double max, sum, avg;
    private int cnt;

    Data(){
        max=0;
        sum=0;
        avg=0;
        cnt=0;
    }

    public void addValue(int value){
        if (value > max)
            max = value;
        cnt++;
        sum += value;
        avg = sum/cnt;
    }

    public double getAverage(){
        if (cnt == 0)
            return 0;
        else
            return avg;
    }

    public double getMaximum(){
        return max;
    }
}

class Analyzer{
    Scanner sc = new Scanner(System.in);
    Data myData = new Data();
    String s;

    public void show(){
        while (true){
            System.out.println("Enter number (Q to quit)");
            s = sc.nextLine();
            if (s.charAt(0) == 'Q' || s.charAt(0) == 'q')
                break;
            else
                myData.addValue(Integer.parseInt(s));
        }
        System.out.println("Average = " + myData.getAverage());
        System.out.println("Maximum = " + myData.getMaximum());
    }
}

public class ThPr {
    public static void main(String args[]){
        Analyzer an = new Analyzer();
        an.show();
    }
}
