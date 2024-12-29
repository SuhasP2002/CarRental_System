import java.util.Scanner;

public class ShowRoom implements Utility
{
    String showroomName;
    String showroomAddress;
    int totalEmployees;
    int carStocks=0;
    String managerName;

    @Override
    public void get_details()
    {
        System.out.println("Showroom name : " + showroomName);
        System.out.println("Showroom address : " + showroomAddress);
        System.out.println("Total number Employees: " + totalEmployees);
        System.out.println("Car Stocks count: " + carStocks);
        System.out.println("Manger name : " + managerName);
    }

    @Override
    public void set_details()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("==========================  **** Enter Showroom Details **** ==========================");
        System.out.println();
        System.out.println("Showroom Name: ");
        showroomName = sc.nextLine();
        System.out.println();
        System.out.println("Showroom Address: ");
        showroomAddress = sc.nextLine();
        System.out.println();
        System.out.println("Total Employees Count: ");
        totalEmployees = sc.nextInt();
        System.out.println();
        System.out.println("Total Cars Count: ");
        carStocks = sc.nextInt();
        System.out.println();
        System.out.println("Manger name: ");
        managerName = sc.nextLine();
    }
}
