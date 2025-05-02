package VolkanYuksel;

public class Librarian extends Person{

    private int employeeID;
    private static int lastEmployeeID;
    public Librarian(String firstName, String lastName, Date dateOfBirth, int employeeID){
        super(firstName, lastName, dateOfBirth);
        this.employeeID = employeeID;
    }

    public Librarian(String firstName, String lastName, int day, int month, int year, int employeeID){
        super(firstName, lastName, day, month, year);
        this.employeeID = employeeID;
    }

    public int getEmployeeID(){
        return employeeID;
    }

    public static int getLastEmployeeID(){
        return lastEmployeeID;
    }

    @Override
    public String toString(){
        return super.toString() + " Employee ID : " + this.getEmployeeID();
    }
}
