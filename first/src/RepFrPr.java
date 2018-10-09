class StudentRep{
    private String name;
    private String ID;
    private int Year;

    StudentRep(String name, String ID, int Year){
        this.name = name;
        this.ID = ID;
        this.Year = Year;
    }

    public int getYear(){
        return Year;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setID(String newID){
        ID = newID;
    }

    public void setYear(int newYear){
        Year = newYear;
    }

    public void yearIncr(){
        Year ++;
    }
}

public class RepFrPr {
    public static void main(String args[]) {
        StudentRep sr = new StudentRep("Iskander", "17BD110381", 1);
        sr.yearIncr();
        System.out.println(sr.getName() + "\n" + sr.getID() + "\n" + sr.getYear() + "\n");

    }
}
