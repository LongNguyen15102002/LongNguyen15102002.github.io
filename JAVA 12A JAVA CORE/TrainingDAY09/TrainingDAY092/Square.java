package TrainingDAY09.TrainingDAY092;

public class Square implements Polygon {
    private double size;

    public Square(){}
    public Square(double size) {
    }

    @Override
    public void display() {
        System.out.println("Kich co cua hinh vuong la: " + size);
    }

    @Override
    public void calArea() {
        double area = size*size;
        System.out.println("Dien tich hinh vuong la: " + area);
    }
    /**
     * @return double return the size
     */
    public double getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(double size) {
        this.size = size;
    }

}
