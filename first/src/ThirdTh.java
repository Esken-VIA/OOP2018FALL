import org.omg.CORBA.Object;

import java.util.*;

class Person{
    private String name;
    Person(){
    }
    Person(String name){
        this.name = name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    String getName(){
        return this.name;
    }

    boolean equals(Object obj){

        if(obj instanceof Person){
            Person p = (Person) obj;

            return this.name.equals(p.name);
        }
        return false;


    }
    public String toString(){
        return "Name: " + name + ".";
    }
}

class Employee extends Person{
    private double salary;
    private int year;
    private String insNum;

    Employee(){
        super();
    }
    Employee(String name, double salary, int year, String insNum){
        super(name);
        this.salary = salary;
        this.year = year;
        this.insNum = insNum;
    }

    public void setSalary(double newSalary){
        this.salary = newSalary;
    }
    public void setYear(int newYear){
        this.year = newYear;
    }
    public void setInsNum(String newInsNum){
        this.insNum = newInsNum;
    }
    public Double getSalary(){
        return this.salary;
    }
    public int getYear(){
        return this.year;
    }
    public String getInsNum(){
        return this.insNum;
    }

    public String toString() {
        return super.toString() + " Salary: " + salary + ". Year: " + year + ". Insurance number: " + insNum + ".";
    }
    boolean equals(Object obj){
        if (obj instanceof Employee){
            Employee e = (Employee) obj;
            return this.insNum.equals(e.insNum) && this.salary == e.salary && this.year == e.year && super.equals(e);
        }

        return false;
    }
}

class Manager extends Employee{
    private boolean bonus;
    
    Vector<Employee> team = new Vector<>();

    public void addEmpl(Employee e){
        team.add(e);
    }

    Manager(){
    }
    Manager(String name, double salary, int year, String insNum, boolean bonus){
        super(name, salary, year, insNum);
        this.bonus = bonus;
    }
    public void setBonus(boolean newBonus) {
        this.bonus = newBonus;
    }
    public Boolean getBonus(){
        return this.bonus;
    }

    public String toString() {
        return super.toString() + " Existence of bonus: " + bonus + ".";
    }
    public boolean equals(Object obj){
        if(obj instanceof Manager){
            Manager m = (Manager) obj;
            return this.bonus == m.bonus && super.equals(m);
        }
        return false;
    }
}

public class ThirdTh {
    public static void main(String[] args){
        Manager manager = new Manager("Abc", 150000, 2, "82", true);
        System.out.println(manager.toString());
    }
}
