package Week9;
public class SavingAccount extends BankAccount
{
    double rate;
    public SavingAccount(int acc_number, String name, double balance, double rate)
    {
        super(acc_number, name, balance);
        this.rate=rate;
    }
    double calculateInterest()
    {
        return super.balance * rate/100;
    }
}