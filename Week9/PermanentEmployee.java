package Week9;
public class PermanentEmployee extends Employees
{
    double HRA;
    double DA;
    public PermanentEmployee(int empId, String name, double salary, double HRA, double DA)
    {
        super(empId, name, salary);
        this.HRA=HRA;
        this.DA=DA;
    }
    double calculateTotalSalary()
    {
        double Total= super.salary + this.HRA + this.DA + calculateBonus();
        return Total;
    }
    void displayPE()
    {
        super.displayEmployee();
        System.out.println("House Rent Allowance:" + this.HRA);
        System.out.println("Dearness Allowance:" + this.DA);
    }
}