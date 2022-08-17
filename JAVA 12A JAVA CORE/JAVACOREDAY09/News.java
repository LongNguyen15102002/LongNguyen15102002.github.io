package JAVACOREDAY09;

public class News implements INews {
    private String title;
    private String author;
    private String publicDate;
    private double rate;

   
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

   
    public String getPublicDate() {
        return publicDate;
    }

    
    public void setPublicDate(String publicDate) {
        this.publicDate = publicDate;
    }

 
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }


    @Override
    public void display() {
         System.out.println("Title: " + title + " Author: " + author + " Public Date: " + publicDate + " Rate: " + rate);
    }

}

