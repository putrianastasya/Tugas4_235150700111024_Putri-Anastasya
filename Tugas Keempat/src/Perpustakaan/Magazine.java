package Perpustakaan;

public class Magazine extends Book implements BookOperations{

    private String category;

    Magazine (String title,  String author, int year,String category){
        super(title, author, year);
        this.category = category;
    }

    @Override
    public void borrowBook() {
        if(this.isBorrowed()==false){
            System.out.println("Magazine  :  " + this.getTitle() + " borrowed successfully");
            this.setBorrowed(true);
        } else {
            System.out.println("Magazine  :  " + this.getTitle() + " is borrowed");
        }
    }

    public void returnBook(){if (this.isBorrowed() == false) {
        System.out.println("Magazine  :  " + this.getTitle() + " is not borrowed");
    } else {
        System.out.println("Magazine  :  " + this.getTitle() + " returned successfully");
        this.setBorrowed(false);
    }
    }

    
    
}
