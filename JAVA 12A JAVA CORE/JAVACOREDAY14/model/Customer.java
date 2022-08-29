package JAVACOREDAY14.model;

public class Customer extends Person {
    
    private boolean isBlocked;
    private Wallet wallet;

    public Customer(int id, String name, String phone, String address, boolean isBlocked, Wallet wallet) {
        super(id, name, phone, address);
        this.isBlocked = isBlocked;
        this.wallet = wallet;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

}
