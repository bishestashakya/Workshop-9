package Week9;
public class Person
{
    int id;
    String name;
    double basicSalary;
    static String collegeName="Islington College";
    public Person(int id, String name, double basicSalary)
    {
        this.id=id;
        this.name=name;
        this.basicSalary=basicSalary;
    }
    double calculateAnnualSalary()
    {
         return this.basicSalary*12;
    }
}