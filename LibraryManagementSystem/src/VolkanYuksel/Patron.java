package VolkanYuksel;

public class Patron extends Person{

    private int libraryCardNumber;
    private String emailAddress;
    private static int lastLibraryCardNumber = -1;

    public Patron(String firstName, String lastName, Date dateOfBirth, int libraryCardNumber, String emailAddress){
        super(firstName, lastName, dateOfBirth);
        this.libraryCardNumber = libraryCardNumber;
        this.emailAddress = emailAddress;
    }

    public Patron(String firstName, String lastName, int day, int month, int year, int libraryCardNumber, String emailAddress){
        super(firstName, lastName, day, month, year);
        this.libraryCardNumber = libraryCardNumber;
        this.emailAddress = emailAddress;
    }

    public int getLibraryCardNumber(){
        return libraryCardNumber;
    }

    public String getEmailAddress(){
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }

    public static int getLastLibraryCardNumber(){
        return lastLibraryCardNumber;
    }

    @Override
    public String toString(){
        return super.toString() + " Library Card Number : " + this.getLibraryCardNumber() + " Email Address : " + this.getEmailAddress();
    }
}
