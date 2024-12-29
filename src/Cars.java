import java.util.Scanner;

public class Cars extends ShowRoom implements Utility
{
    String carName;
    String carColor;
    String carFuelType;
    int carPrice;
    String carType;

    @Override
    public void get_details()
    {
        System.out.println("Car name : " + carName);
        System.out.println("Car color : " + carColor);
        System.out.println("Car Fuel Type: " + carFuelType);
        System.out.println("Car Price: " + carPrice);
        System.out.println("Car Type : " + carType);
    }

    @Override
    public void set_details()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("==========================  **** Enter Car Details **** ==========================");
        System.out.println();
        System.out.println("Car Name: ");
        carName = sc.nextLine();
        System.out.println();
        System.out.println("Car color: ");
        carColor = sc.nextLine();
        System.out.println();
        System.out.println("Car Fuel Type: ");
        carFuelType = sc.nextLine();
        System.out.println();
        System.out.println("Car Price: ");
        carPrice = sc.nextInt();
        System.out.println();
        System.out.println("Car Type: ");
        carType = sc.nextLine();
        carStocks++;
    }
}
