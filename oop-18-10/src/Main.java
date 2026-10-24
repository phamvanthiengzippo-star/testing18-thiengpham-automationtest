//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // tai khoan ngan hang
        // tai khoan tiet kiem - saving
            // + khong duoc rut tien qua so du trong tai khoan (the ghi no)
        // checking account
            // + rut toi da 1.000.000vnd
        // Account => class cha
        // saving account => class con
        // checking account => class con
        SavingAccount account1 = new SavingAccount(1_000_000, "Thieng");
     //   account1.withdraw(2_000_000);
        account1.withdraw(500_000);
        System.out.println(account1.getBalance());

        CheckingAccount account2 = new CheckingAccount(1_000_000, "Pham");
        account2.withdraw(1_200_000);
    }
}