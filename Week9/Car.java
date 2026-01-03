package Week9;
public class Car extends Vehicle
{
    int numberOfDoors;
    String fuelType;
    public Car(int vehicleId, String brand, double BasePrice, int numberOfDoors, String fuelType)
    {
        super(vehicleId, brand, BasePrice); //indicates to attributes of parent class
        this.numberOfDoors=numberOfDoors;
        this.fuelType=fuelType;
    }
    public double calculateFinalPrice() //for car
    {
        double Final= super.BasePrice + super.calculateTax() + (0.50 * super.BasePrice);
        return Final;
    }
    void displayCar()
    {
        super.displayVehicleInfo();
        System.out.println("No of Doors in Toyota:" + this.numberOfDoors);
        System.out.println("Fuel Type of Toyota:" + this.fuelType);
    }
}