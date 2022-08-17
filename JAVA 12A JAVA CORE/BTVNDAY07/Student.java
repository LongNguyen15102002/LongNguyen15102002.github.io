package BTVNDAY07;

public class Student extends User {
    String Background;
    boolean isOnline;

    public Student(String Id, String Name, String Gender, int Age, String Email, String PhoneNumber){
        super();
    }

    public boolean getisOnline() {
        return this.isOnline;
    }

    public void setisOnline(boolean isOnline) {
        this.isOnline = isOnline;
    }

    public String getBackground() {
        return this.Background;
    }

    public void setBackground(String Background) {
        this.Background = Background;
    }

    @Override
    public void nhap() {
        super.nhap();
        
    }
}
