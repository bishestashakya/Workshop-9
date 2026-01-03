package Week9;
public class Vehicle
{
    int vehicleId;
    String brand;
    double BasePrice;
    public Vehicle(int vehicleId, String brand, double BasePrice)
    {
        this.vehicleId=vehicleId;
        this.brand=brand;
        this.BasePrice=BasePrice;
    }
    void displayVehicleInfo()
    {
        System.out.println("Details of Vehicle:");
        System.out.println("Vehicle ID:" + this.vehicleId);
        System.out.println("Vehicle Brand:" + this.brand);
        System.out.println("Base Price of vehicle:" + this.BasePrice);
    }
    double calculateTax() //for all vehicle
    {
        double tax=0.10*this.BasePrice;
        return tax;
    }
}