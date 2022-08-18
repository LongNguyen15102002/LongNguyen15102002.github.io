package JAVACOREDAY10.ex1;

import java.util.ArrayList;

public class Household {
    private ArrayList<Person> people;
    private int numberOfMembers;
    private String HouseNumber;

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

    public void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }

    public void setHouseNumber(String houseNumber) {
        HouseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Household [HouseNumber=" + HouseNumber + ", numberOfMembers=" + numberOfMembers + ", people=" + people
                + "]";
    }

}
