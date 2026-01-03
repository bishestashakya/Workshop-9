package Week9;
public class SchoolApp
{
    public static void main(String[] args)
    {
        System.out.println("College Name:" + Person.collegeName);
        System.out.println();
        
        Teacher t1= new Teacher(1, "Ram", 35000.00, "Mathematics", 2500.00);
        System.out.println("Annual Salary of a Teacher:" + t1.calculateAnnualSalary());
        System.out.println();
        
        Staff s1= new Staff(2, "Sita", 8, 500);
        System.out.println("Salary of a Staff:" + s1.calculateSalary());
    }
}