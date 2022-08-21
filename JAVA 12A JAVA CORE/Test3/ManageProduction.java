package Test3;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageProduction {
    private int id;
    private String name;
    private String description;
    private byte amount;
    private float price;
    private String calculationUnit;
    private ArrayList<ManageProduction> manageProductions = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public ManageProduction() {}

    public ManageProduction(int id, String name, String description, byte amount, float price,
            String calculationUnit) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.price = price;
        this.calculationUnit = calculationUnit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte getAmount() {
        return amount;
    }

    public void setAmount(byte amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCalculationUnit() {
        return calculationUnit;
    }

    public void setCalculationUnit(String calculationUnit) {
        this.calculationUnit = calculationUnit;
    }

    // Hiển thị thông tin list sản phẩm
    public void showProductions() {
        for (ManageProduction manageProduction : manageProductions) {
            System.out.println("Ten san pham la: " + manageProduction.getName());
            System.out.println("ID san pham la: " + manageProduction.getId());
            System.out.println("Mo ta san pham: " + manageProduction.getDescription());
            System.out.println("So luong: " + manageProduction.getAmount());
            System.out.println("Gia san pham: " + manageProduction.getPrice());
            System.out.println("Don vi tinh: " + manageProduction.getCalculationUnit());
        }
    }

    int inputId() {
        System.out.println("Nhap ID san pham: ");
        return scanner.nextInt();
    }

    String inputName() {
        System.out.println("Nhap ten san pham: ");
        return scanner.nextLine();
    }

    private String inputDescription() {
        System.out.println("Nhap mo ta san pham: ");
        return scanner.nextLine();
    }

    private byte inputAmount() {
        System.out.println("Nhap so luong cua san pham: ");
        return scanner.nextByte();
    }

    private float inputPrice() {
        System.out.println("Nhap gia san pham: ");
        return scanner.nextFloat();
    }

    private String inputCalculationUnit() {
        System.out.println("Nhap don vi tinh: ");
        return scanner.next();
    }

    // Add thông tin sản phẩm vào ArrayList
    public void addProductions() {
        int id = (manageProductions.size() > 0) ? (manageProductions.size() + 1) : 1;
        System.out.println("Id san pham la: " + id);
        String name = inputName();
        String description = inputDescription();
        byte amount = inputAmount();
        float price = inputPrice();
        String calculationUnit = inputCalculationUnit();
        ManageProduction manageProduction = new ManageProduction(id, name, description, amount, price, calculationUnit);
        manageProductions.add(manageProduction);
    }

    // Tìm sản phẩm theo tên
    public void findByName(String name) {
        boolean isExisted = false;
        for (int i = 0; i < manageProductions.size(); i++) {
            if (manageProductions.get(i).getName() == name) {
                isExisted = true;
                manageProductions.get(i);
                break;
            }
        }
        if (!isExisted) {
            System.out.println("Ten san pham nay khong ton tai.");
        }
    }

    // Edit số lượng sản phẩm dựa vào ID
    public void editById(int id) {
        boolean isExisted = false;
        for (int i = 0; i < manageProductions.size(); i++) {
            if (manageProductions.get(i).getId() == id) {
                isExisted = true;
                manageProductions.get(i).setAmount(inputAmount());
                break;
            }
        }
        if (!isExisted) {
            System.out.println("This id not existed.");
        }
    }

    // Del sản phẩm dựa vào ID
    public void deleteById(int id) {
        boolean isExisted = false;
        for (int i = 0; i < manageProductions.size(); i++) {
            if (manageProductions.get(i).getId() == id) {
                isExisted = true;
                manageProductions.remove(i);
                break;
            }
        }
        if (!isExisted) {
            System.out.println("This id not existed.");
        }
    }

    // Tìm các sản phẩm có số lượng dưới 5
    public void findByAmountOf5andLower() {
        boolean isExisted = false;
        for (int i = 0; i < manageProductions.size(); i++) {
            if (manageProductions.get(i).getAmount() > 0 && manageProductions.get(i).getAmount() <= 5) {
                isExisted = true;
                System.out.println(manageProductions.get(i));
                break;
            }
        }
        if (!isExisted) {
            System.out.println("Khong co san pham nao co so luong duoi 5.");
        }
    }

    //Tìm sản phẩm theo mức giá
    public void findByPrice() {
        for (int i = 0; i < manageProductions.size(); i++) {
            if (manageProductions.get(i).getPrice() < 50000) {
                System.out.println("San pham co gia duoi 50k la: " + manageProductions.get(i));
            }
            else if (manageProductions.get(i).getPrice() > 100000) {
                System.out.println("San pham co gia tren 100k la: " + manageProductions.get(i));
            }
            else {
                System.out.println("San pham co gia từ 50k den 100k la: " + manageProductions.get(i));
            }
        }
    }
}
