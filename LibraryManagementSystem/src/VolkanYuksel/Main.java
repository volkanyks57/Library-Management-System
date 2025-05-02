package VolkanYuksel;

public class Main{
    public static void main(String[] args){
        // id : 0 title : Serenad availability : true
        LibraryItem library1 = new LibraryItem("Serenad");
        System.out.println(library1);

        // id : 1 title : Serenad availability : false
        LibraryItem library2 = new LibraryItem("Serenad");
        library2.borrowItem();
        System.out.println(library2);

        // id : 2 title : Serenad availability : true Author :  First Name : Volkan Last Name : Yüksel Date Of Birth : 31/5/2002 ISBN : 575757
        Book book1 = new Book("Serenad",new Person("Volkan","Yüksel",new Date(31,5,2002)), "575757");
        System.out.println(book1);

        // 19/5/1905
        Date date_1 = new Date(19, 5, 1905);
        System.out.println(date_1);

        // id : 3 title : Serenad availability : true First Name : Emre  Last Name : Yıldız Date Of Birth : 19/6/2003 424242
        DVD dvd_1 = new DVD("Serenad", new Person("Emre ", "Yıldız",new Date(19, 6, 2003)),424242);
        System.out.println(dvd_1);

        // id : 4 title : Serenad availability : true Issue Number : 585858 Publication : 9/8/1998
        Magazine magazine_1 = new Magazine("Serenad", "585858", new Date(9, 8, 1998));
        System.out.println(magazine_1);

        // First Name : Mehmet Ali Last Name : Yıldız Date Of Birth : 15/1/2000
        Person person_1 = new Person("Mehmet Ali", "Yıldız", new Date(15, 1, 2000));
        System.out.println(person_1);

        // First Name : Ece Last Name : Baykar Date Of Birth : 15/3/2001 Library Card Number : 220101033 Email Address : ecebaykar@gmail.com
        Patron patron_1 = new Patron("Ece", "Baykar", new Date(15, 3, 2001), 220101033, "ecebaykar@gmail.com");
        System.out.println(patron_1);

        // First Name : Ahmed Yasin Last Name : Özkaya Date Of Birth : 15/3/2003 Employee ID : 15
        Librarian librarian_1 = new Librarian("Ahmed Yasin", "Özkaya", new Date(15, 3, 2003), 15);
        System.out.println(librarian_1);
    }
}
