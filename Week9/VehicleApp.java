package Week9;
public class VehicleApp
{
    public static void main(String[] args)
    {
        Car c1=new Car(1500, "Toyota", 4500000.00, 4, "Petrol");
        c1.displayCar();
        System.out.println("Tax Amount for Toyota:" + c1.calculateTax());
        System.out.println("Final Price for Toyota:" + c1.calculateFinalPrice());
        System.out.println();
        
        Bike b1=new Bike(2626, "BMW", 550000.00, 120);
        b1.displayBike();
        System.out.println("Tax Amount for BMW:" + b1.calculateTax());
        System.out.println("Final Price for BMW:" + b1.calculateFinalPrice());
    }
}