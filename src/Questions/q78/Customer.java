package Questions.q78;

public class Customer extends BankAccount {
    public static void main(String[] args) {
        BankAccount c1 = new BankAccount("0001","Himanshu Verma");
        c1.depositMoney(500);
        System.out.println(c1.withdrawMoney(1000));
        c1.depositMoney(-33);
        c1.withdrawMoney(0);
    }
}
