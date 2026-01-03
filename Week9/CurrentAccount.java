package Week9;
public class CurrentAccount extends BankAccount
{
    double overdraftLimit;
    public CurrentAccount(int acc_number, String name, double balance, double overdraftLimit)
    {
        super(acc_number, name, balance);
        this.overdraftLimit= overdraftLimit;
    }
    boolean withdraw(double amount)
    {
        if (amount <= balance + this.overdraftLimit)
        {
            balance= super.balance-amount;
            System.out.println("Amount withdrawed from Current Account= " + amount);
            return true;
        }
        else
        {
            System.out.println("Withdrawal exceeds overdraft limit");
            return false;
        }
    }
}