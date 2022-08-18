package JAVACOREDAY10.ex2;

import java.util.ArrayList;

public class Idol {
    private String id;
    private String name;
    private String email;
    private String group;
    private ArrayList<Follower> followers = new ArrayList<>();
    
    public Idol(String id, String name, String email, String group) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.group = group;
    }

    public void setFollowers(ArrayList<Follower> followers) {
        this.followers = followers;
    }

    @Override
    public String toString() {
        return "Idol [email=" + email + ", followers=" + followers + ", group=" + group + ", id=" + id + ", name="
                + name + "]";
    }

    

}

