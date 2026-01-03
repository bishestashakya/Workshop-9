package Week9;
public class Employees
{
    int empId;
    String name;
    double salary;
    public Employees(int empId, String name, double salary)
    {
        this.empId=empId;
        this.name=name;
        this.salary=salary;
    }
    double calculateBonus()
    {
        return 0.10*this.salary;
    }
    void displayEmployee()
    {
        System.out.println("Employee Details:");
        System.out.println("Employee ID:" + this.empId);
        System.out.println("Employee Name:" + this.name);
        System.out.println("Employee Salary:" + this.salary);
    }
}