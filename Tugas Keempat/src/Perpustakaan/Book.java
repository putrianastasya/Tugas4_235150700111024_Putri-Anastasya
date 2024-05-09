package Perpustakaan;

public class Book {
    
    private String title;
    private String author;
    private int year;
    private boolean borrowed;
   
    public Book (){
        this.borrowed = false;
    }
    public Book (String title,  String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public void displayInfo(){
        System.out.println("Title  :  " + this.getTitle());
        System.out.println("Author  :  " + this.getAuthor());
        System.out.println("Year  :  " + this.getYear());
        System.out.println("Borrowed  :  " + isBorrowed());
    }

    public static void main(String[] args) {
        System.out.println("test");
    }
    


}