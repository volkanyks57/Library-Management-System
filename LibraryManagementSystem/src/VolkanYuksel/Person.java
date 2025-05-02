package VolkanYuksel;

public class Person{

    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    public Person(String firstName, String lastName, Date dateOfBirth){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String firstName, String lastName, int day, int month, int year){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = new Date(year, month , day);
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public Date getDateOfBirth(){
        return dateOfBirth;
    }

    public String toString(){
        return " First Name : " + this.getFirstName() + " Last Name : " + this.getLastName() + " Date Of Birth : " + this.getDateOfBirth();
    }
}
