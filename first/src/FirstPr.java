import java.util.*;

class Animal{
    private String name;
    private int Year;

    public Animal(){
        name = "";
        Year = 0;
    }

    public Animal(String initName, int initYear){
        this.name = initName;
        this.Year = initYear;
    }

    public String getName(){
        return name;
    }

    public int getYear() {
        return Year;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setYear(int newYear){
        Year = newYear;
    }

    public void setYear (Animal al){          //overload
        Year = al.getYear();
    }

}

class Dog extends Animal{
    private String kind;
    private int totalLife;

    public Dog(){
        super();
        kind = "";
        totalLife = 0;
    }

    @Override
    public int getYear(){
        Dog dog = new Dog();
        int m = super.getYear() + 4;
        return  m;
    }

    public Dog(String initName, int initDogYear, String initKind){
        super(initName, initDogYear);
        kind = initKind;
        totalLife += initDogYear + 4;
    }

    public String getKind(){
        return kind;
    }
/*
    public void setKind (String newKind) {
        kind  = newKind;
    }
*/
    public int getTotalLife() {
        return totalLife;
    }
}

public class FirstPr {
    public static void main(String args[]){
    Animal al = new Dog("Tobi", 5, "Mops");
    Animal anl = new Animal("Tobi", 5);
        /*
        Animal al = new Dog();
        al.setName("Lary");
        al.setDogYear(5);
        al.setDogYear(5);
        ((Dog) al).setKind("Bosch");
        */
    System.out.println(al.getName() + "\n" + al.getYear() + "\n" + (((Dog) al).getKind()) + "\n" + ((Dog) al).getTotalLife() + "\n");
    System.out.println(al.getName() + "\n" + anl.getYear() + "\n" + (((Dog) al).getKind()) + "\n" + ((Dog) al).getTotalLife() + "\n");
    }
}
