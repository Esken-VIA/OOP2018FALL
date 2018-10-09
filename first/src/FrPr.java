class Student{
    private String Name;
    private String ID;
    private int Year;

    Student(String Name, String ID){
        this.Name = Name;
        this.ID = ID;
    }

    String get_Name(){
        return Name;
    }
    String get_ID(){
        return ID;
    }
    int get_Year(){
        return Year;
    }
    void set_Name(String name){
        Name=name;
    }
    void set_ID(String id){
        ID=id;
    }
    void set_Year(int year){
        Year=year;
    }
    void year_Incr(){
        Year += 1;
    }
}

public class FrPr {
    public static void main(String args[]){
        Student std = new Student("Iskander", "17BD213131815");
        std.set_Year(2);
        std.year_Incr();
        System.out.println(std.get_Name() + "\n" + std.get_ID() + "\n" + std.get_Year());
    }
}


