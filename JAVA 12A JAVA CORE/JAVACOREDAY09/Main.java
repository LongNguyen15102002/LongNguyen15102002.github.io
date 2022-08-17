package JAVACOREDAY09;

public class Main {
    public static void main(String[] args) {
        News news = new News();
        news.setTitle("LoL");
        news.setAuthor("Riot");
        news.setPublicDate("2010");
        news.setRate(5);
        news.display();
    }
}
