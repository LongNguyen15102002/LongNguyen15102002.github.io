package TrainingDAY09.TrainingDAY092;

public class Rectangle implements Polygon{
    private double length;
    private double width;
    
    public Rectangle() {
    }

    public Rectangle(double length, double width) {
    }

    @Override 
    public void display() {
        System.out.println("Chieu dai hcn la: " + length + " Chieu rong hcn la: " + width);
    }

    public void calArea() {
        double area = length*width;
        System.out.println("Dien tich hcn la: " + area);
    }
    /**
     * @return double return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * @return double return the witdh
     */
    public double getWitdh() {
        return width;
    }

    /**
     * @param width the witdh to set
     */
    public void setWitdh(double width) {
        this.width = width;
    }


    /**
     * @return double return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

}
