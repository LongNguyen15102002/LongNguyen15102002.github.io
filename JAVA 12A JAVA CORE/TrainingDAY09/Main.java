package TrainingDAY09;

public class Main {
    public static void main(String[] args) {
        Yasuo yasuo = new Yasuo();
        yasuo.getHair();
        yasuo.getWeapon();
        Lucian lucian = new Lucian();
        lucian.getHair();
        lucian.getWeapon();
        System.out.println("Yasuo's hair is: " + yasuo.getHair() + " Yasuo's weapon is: " + yasuo.getWeapon());
        yasuo.surf();
        System.out.println("Lucian's hair is: " + lucian.getHair() + " Lucian's weapon is: " + lucian.getWeapon());
        lucian.surf();
        lucian.shoot();
    }
}
