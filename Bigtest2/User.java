import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String email;
    private String password;
    private List<User> users = new ArrayList<>();

    public User() {
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void Register() {
        for (int i = 0; i < users.size(); i++) {
            System.out.println("Nhap vao Username moi: ");
            if (users.get(i).getUsername() == null || users.get(i).getUsername() != username) {
                System.out.println("Khoi tao Username moi thanh cong");
            } else {
                System.out.println("Username nay da ton tai! Moi nhap lai: ");
                
            }
        }
    }
}
