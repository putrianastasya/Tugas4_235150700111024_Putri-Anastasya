package Perpustakaan;

public class Main {

    public static void main(String[] args) {

        Magazine magazine1 = new Magazine("Adventure Traveler", "Ryan Johnson ", 2017, "Wisata Petualangan");

        Novel novel1 = new Novel("Whispers in the Wind", "Harper Lee", 2015, "Mystery");

        TextBook textBook1 = new TextBook("Fundamentals of Physics", "David Brown", 2016, "Physics");

        System.out.println("---- Book Information ----");
        magazine1.displayInfo();
        enter();
        novel1.displayInfo();
        enter();
        textBook1.displayInfo();
        
        enter();

        System.out.println("----  Borrowing and Returning Books  ----");

        textBook1.borrowBook();
        magazine1.borrowBook();
        textBook1.returnBook();
        novel1.returnBook();


        // enter();
        // magazine1.displayInfo();
        // enter();
        // novel1.displayInfo();
        // enter();
        // textBook1.displayInfo();
        



        

        



    }




    static void enter(){
        System.out.println();
    }


}
