package Week9;
public class Payroll
{
    public static void main(String[] args)
    {
        PermanentEmployee p1=new PermanentEmployee(1, "Ram", 45000.00, 2000, 1000);
        p1.displayPE();
        System.out.println("Total Salary of Permanent Employee:" +p1.calculateTotalSalary());
        System.out.println();
        
        ContractEmployee c1=new ContractEmployee(2, "Sita", 5000.00, 25);
        c1.displayCE();
        System.out.println("Total Salary of Contract Employee:" +c1.calculateTotalSalary());
    }
}