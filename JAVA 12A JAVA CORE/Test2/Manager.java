public class Manager {
    private String managerName;
    private int managerYearOfBirth;

    public Manager(String managerName, int managerYearOfBirth) {
        this.managerName = managerName;
        this.managerYearOfBirth = managerYearOfBirth;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public int getmanagerYearOfBirth() {
        return managerYearOfBirth;
    }

    public void setmanagerYearOfBirth(int managerYearOfBirth) {
        this.managerYearOfBirth = managerYearOfBirth;
    }

    @Override
    public String toString() {
        return "Quan li: " + managerName +  "\t" + "Sinh nam: " + managerYearOfBirth +  "";
    }
}
