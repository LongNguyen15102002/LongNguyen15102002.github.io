package TrainingDAY09;

public class Yasuo implements CanSurf{
    private String hair = "brown";
    private String weapon = "katana";
    
    @Override
    public void surf() {
        System.out.println("Yasuo can surf");
    }

    /**
     * @return String return the hair
     */
    public String getHair() {
        return hair;
    }

    /**
     * @param hair the hair to set
     */
    public void setHair(String hair) {
        this.hair = hair;
    }

    /**
     * @return String return the weapon
     */
    public String getWeapon() {
        return weapon;
    }

    /**
     * @param weapon the weapon to set
     */
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

}
