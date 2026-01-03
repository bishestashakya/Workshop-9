package Week9;
public class Staff extends Person
{
    double workingHours;
    double ratePerHour;
    public Staff(int id, String name, double workingHours, double ratePerHour)
    {
        super(id, name, 0);
        this.workingHours=workingHours;
        this.ratePerHour=ratePerHour;
    }
    double calculateSalary()
    {
        return this.workingHours*this.ratePerHour;
    }
}