package Week9;
public class ContractEmployee extends Employees
{
    int workingDays;
    public ContractEmployee(int empId, String name, double salary, int workingDays)
    {
        super(empId, name, salary);
        this.workingDays= workingDays;
    }
    double calculateTotalSalary()
    {
        return super.salary*this.workingDays;
    }
    void displayCE()
    {
        super.displayEmployee();
        System.out.println("Working Days:" + this.workingDays);
    }
}