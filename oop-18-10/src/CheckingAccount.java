public class CheckingAccount extends Account{
    private static final double OVERDLAFT_LIMIT =  1_000_000;

    public CheckingAccount (double balance, String owner){
    super (balance, owner);
    }

    @Override
    public void withdraw (double amount){
        if (amount <= 0 || amount > OVERDLAFT_LIMIT){
            throw new IllegalArgumentException("invalid amount");
        }
        setBalance(getBalance() -  amount);
        System.out.println("Withdrawal successful");
    }
}
