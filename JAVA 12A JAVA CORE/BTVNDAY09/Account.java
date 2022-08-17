package BTVNDAY09;

public class Account implements IAccount {
    private String name;
    private String accountNumber;
    private String email;
    private double AccountBalance;

    public Account() {
    }

    @Override
    public void recharge(double amount){
        this.AccountBalance += amount;
        System.out.println("So du moi sau khi nap la: " + AccountBalance);
    }

    @Override
    public void changeEmail(String email) {
        this.email = email.replaceAll(email, this.email);
        System.out.println("Email duoc tao moi la: " + this.email);
    }

    @Override
    public void displayInfo() {
        System.out.println("Ten chu TK la: " + name + "\n" + "So TK la: " + accountNumber + "\n"
                + "Email dang ki TK la: " + email + "\n" + "So du trong TK la: " + AccountBalance);
    }

    public void displayChangedInfo() {
        System.out.println("Ten chu TK la: " + name + "\n" + "So TK la: " + accountNumber + "\n"
                + "Email moi cua TK la: " + email + "\n" + "So du moi trong TK la: " + AccountBalance);
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return double return the AccountBalance
     */
    public double getAccountBalance() {
        return AccountBalance;
    }

    /**
     * @param AccountBalance the AccountBalance to set
     */
    public void setAccountBalance(double AccountBalance) {
        this.AccountBalance = AccountBalance;
    }

}
