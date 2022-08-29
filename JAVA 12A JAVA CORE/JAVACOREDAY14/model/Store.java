package JAVACOREDAY14.model;

import java.util.List;

import JAVACOREDAY14.model.service.IGeneralService;

public class Store implements IGeneralService<Store, List<Store>> {
    private int id;
    private String name;
    private String address;
    private String phone;

    public Store(int id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void changeName(Store obj, List<Store> objs) {
        
    }

    @Override
    public void changPhone(Store obj, List<Store> objs) {
       
    }

    @Override
    public void changeAddress(Store obj, List<Store> objs) {
       
    }

}
