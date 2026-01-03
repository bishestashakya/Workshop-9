package Week9;
public class BankApp
{
    public static void main(String[] args)
    {
        SavingAccount s1= new SavingAccount(1055, "Bishesta Shakya", 40000.00, 2);
        s1.deposit(5000.00);
        System.out.println("Total Balance for Saving Account=" + s1.getBalance());
        System.out.println("Interest for Saving Account=" + s1.calculateInterest());
        System.out.println();
        
        CurrentAccount c1= new CurrentAccount(1054, "Prasamsha Sharma", 50000.00, 40000);
        c1.withdraw(40000.00);
        System.out.println("Total Balance for Current Account=" + c1.getBalance());
    }
}