class StarTriangle {
    int width;

    StarTriangle(int w) {
        width = w;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i <= width; i++) {
            for (int j = i; j > 0; j--) {
                s += "[*]";
            }
            s += "\n";
        }
        return s;
    }
}

public class ScPr {
    public static void main(String args[]){
        StarTriangle small = new StarTriangle(5);
        System.out.println(small.toString());
    }
}
