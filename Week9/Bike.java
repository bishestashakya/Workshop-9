package Week9;
public class Bike extends Vehicle
{
    int engineCap;
    public Bike(int vehicleId, String brand, double BasePrice, int engineCap)
    {
        super(vehicleId, brand, BasePrice);
        this.engineCap=engineCap;
    }
    double calculateFinalPrice() //for bike
    {
        double Final= super.BasePrice + super.calculateTax();
        return Final;
    }
    void displayBike()
    {
        super.displayVehicleInfo();
        System.out.println("Engine Capacity of BMW:" + this.engineCap);
    }

}