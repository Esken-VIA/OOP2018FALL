import java.util.*;

abstract class Shapes{
    private double volume;
    private double surfaceArea;

    abstract String volume();
    abstract String surfaceArea();
}

class Cylinder extends Shapes {
    private double height;
    private double radius;
    Cylinder(){
    }

    Cylinder(double height, double radius){
        this.height = height;
        this.radius = radius;
    }

    public String volume() {
        return "Volume of cylinder " + (height * Math.PI * radius * radius);
    }

    public String surfaceArea() {
        return "Surface Area of cylinder " +
                (height * 2 * Math.PI * radius + 2 * Math.PI * radius * radius);
    }
}

class Sphere extends Shapes{
    private double radius;
    Sphere(){
    }

    Sphere(double radius){
        this.radius = radius;
    }

    public String volume() {
        return "Volume of sphere " + (4 / 3 * Math.PI * radius * radius * radius);
    }

    public String surfaceArea() {
        return "Surface Area of sphere " + (4 * Math.PI * radius * radius);
    }
}

class Cube extends Shapes{
    private double side;
    Cube(){
    }
    Cube(double side){
        this.side = side;
    }

    public String volume() {
        return "Volume of cube " + (side * side * side);
    }

    public String surfaceArea() {
        return "Surface Area of cube " + (6 * side * side);
    }
}

public class SecondSc {
    public static void main(String[] args){
        Cylinder cylinder = new Cylinder(10, 2);
        System.out.println(cylinder.volume());
        System.out.println(cylinder.surfaceArea());
        System.out.println(" ");

        Sphere sphere = new Sphere(2);
        System.out.println(sphere.volume());
        System.out.println(sphere.surfaceArea());
        System.out.println(" ");

        Cube cube = new Cube(10);
        System.out.println(cube.volume());
        System.out.println(cube.surfaceArea());
        System.out.println(" ");

        Vector<Shapes> s = new Vector<>();
        s.add(cylinder);
        s.add(sphere);
        s.add(cube);
        for (int i=0; i < s.size(); i++){
            System.out.println(s.elementAt(i));
            System.out.println(s.elementAt(i).volume());
        }
    }
}
