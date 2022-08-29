package JAVACOREDAY14.model;

public class Food {
    private int id;
    private String name;
    private double price;
    private String type;
    private double vote;
    private String feedback;
    private int numberOf;

    public Food(int id, String name, double price, String type, double vote, String feedback, int numberOf) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.vote = vote;
        this.feedback = feedback;
        this.numberOf = numberOf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getVote() {
        return vote;
    }

    public void setVote(double vote) {
        this.vote = vote;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getNumberOf() {
        return numberOf;
    }

    public void setNumberOf(int numberOf) {
        this.numberOf = numberOf;
    }
}
