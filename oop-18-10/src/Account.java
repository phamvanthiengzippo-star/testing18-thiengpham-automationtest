abstract class Account {
    private double balance;
    private String ower;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwer() {
        return ower;
    }

    public void setOwer(String ower) {
        this.ower = ower;
    }

    public Account(){}
    public  Account (double balance, String ower){
        this.balance = balance;
        this.ower = ower;
    }

     public void deposit (double amount){
        if (amount < 0){
            throw new IllegalArgumentException("Amount must be positive");
        }
        this.balance += amount;
    }
    abstract public void withdraw (double amount);
}
