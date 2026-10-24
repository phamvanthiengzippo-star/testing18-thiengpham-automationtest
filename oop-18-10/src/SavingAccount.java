//interface Account{
// ...
// }
// public class SavingAccount implement Account
// khi ke thua interface => bat buoc define day du câc function trong interface



public class SavingAccount extends Account{

    public SavingAccount (double balance, String owner){
        super(balance, owner);
    }

    @Override
    public void withdraw(double amount){
        if (amount <= 0 || amount > getBalance()){
            throw new IllegalArgumentException("Invalid amount");
        }
        setBalance(getBalance() - amount);
        System.out.println("rut tien thanh cong, withdrawal successful");
    }
}
