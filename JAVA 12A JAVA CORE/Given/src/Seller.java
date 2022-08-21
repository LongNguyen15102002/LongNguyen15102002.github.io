public class Seller extends Employee {
    private double revenue;

    public Seller() {
    }

    public Seller(String name, double revenue, double salary ) {
        super(name, salary);
        this.revenue = revenue;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getSalary() {
        if (revenue < 4000) {
            return super.getSalary() + revenue * 0.05;
        } else {
            return super.getSalary() + revenue * 0.1;
        }
    }
}
