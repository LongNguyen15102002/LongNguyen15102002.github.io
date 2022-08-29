package JAVACOREDAY14.model;

import java.util.Date;
import java.util.Map;

public class OrderDetail {
    private int id;
    private Customer customer;
    private Store store;
    private Shipper shipper;
    private Map<Food, Integer> foods;
    private Date timeOrder;

    public OrderDetail(int id, Customer customer, Store store, Shipper shipper, Map<Food, Integer> foods,
            Date timeOrder) {
        this.id = id;
        this.customer = customer;
        this.store = store;
        this.shipper = shipper;
        this.foods = foods;
        this.timeOrder = timeOrder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Shipper getShipper() {
        return shipper;
    }

    public void setShipper(Shipper shipper) {
        this.shipper = shipper;
    }

    public Map<Food, Integer> getFoods() {
        return foods;
    }

    public void setFoods(Map<Food, Integer> foods) {
        this.foods = foods;
    }

    public Date getTimeOrder() {
        return timeOrder;
    }

    public void setTimeOrder(Date timeOrder) {
        this.timeOrder = timeOrder;
    }

}
