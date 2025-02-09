package Questions.q78;

public class BankAccount {
    private String accountNum;
    private String accountHolderName;
    private double bal;
    public BankAccount() {
        this.accountNum = "0000";  // Default account number
        this.accountHolderName = "Unknown";  // Default account holder name
        this.bal = 0.0;  // Default balance is 0
    }

    public BankAccount(String accountNum, String accountHolderName) {
        this.accountNum = accountNum;
        this.accountHolderName = accountHolderName;
    }

    public void depositMoney(double money){
        if (money>=0){
        bal+=money;
        }
        else {
            System.out.println("Invalid deposit");
        }
    }
    public double withdrawMoney(double money){
        if(money<=0) {
            System.out.println("Invalid Withdraw");
        }
            else if (bal>=money){
                bal-=money;
            }

        else {
            money = bal;
            bal = 0;
        }
        return money;
    }
}
