package JAVACOREDAY10.ex2;

public class Follower {
    private String id;
    private String name;
    private String email;
    private int numberOfLike;

    public Follower(String id, String name, String email, int numberOfLike) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.numberOfLike = numberOfLike;
    }

    @Override
    public String toString() {
        return "Follower [email=" + email + ", id=" + id + ", name=" + name + ", numberOfLike=" + numberOfLike + "]";
    }
}
