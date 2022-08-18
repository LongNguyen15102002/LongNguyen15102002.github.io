package JAVACOREDAY10.ex3;

public class Champion {
    private String name;
    private String position;
    
    public Champion(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Champion: name=" + name + ", position=" + position + "\n" + "";
    } 
}
