package TrainingDAY09;

public class Lucian implements CanShoot, CanSurf {
    private String hair = "none";
    private String weapon = "pistols";

    @Override
    public void surf() {
        System.out.println("Lucian can shoot");
    }

    @Override
    public void shoot() {
        System.out.println("Lucian can surf");
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
