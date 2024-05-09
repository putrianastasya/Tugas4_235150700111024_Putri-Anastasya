package Perpustakaan;

public class TextBook extends Book implements BookOperations {

    private String subject;

    TextBook(String title, String author, int year, String subject) {
        super(title, author, year);
        this.subject = subject;
    }

    @Override
    public void borrowBook() {
        if(this.isBorrowed()==false){
            System.out.println("Textbook  :  " + this.getTitle() + " borrowed successfully");
            this.setBorrowed(true);
        } else {
            System.out.println("Textbook  :  " + this.getTitle() + " is borrowed");
        }
    }

    public void returnBook() {
        if (this.isBorrowed() == false) {
            System.out.println("Textbook  :  " + this.getTitle() + " is not borrowed");
        } else {
            System.out.println("Textbook  :  " + this.getTitle() + " returned successfully");
            this.setBorrowed(false);
        }
    }
}
