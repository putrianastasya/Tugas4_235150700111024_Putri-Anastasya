package Perpustakaan;

public class Novel extends Book implements BookOperations{

    private String genre;

    Novel (String title,  String author, int year, String genre){
        super(title, author, year);
        this.genre = genre;
    }


    @Override

    public void borrowBook() {
        if(this.isBorrowed()==false){
            System.out.println("Novel  :  " + this.getTitle() + " borrowed successfully");
            this.setBorrowed(true);
        } else {
            System.out.println("Novel  :  " + this.getTitle() + " is borrowed");
        }
    }

    public void returnBook(){
        if (this.isBorrowed() == false) {
            System.out.println("Novel  :  " + this.getTitle() + " is not borrowed");
        } else {
            System.out.println("Novel  :  " + this.getTitle() + " returned successfully");
            this.setBorrowed(false);
        }
    }
    
}
