import java.util.Scanner;

public class Employee extends ShowRoom implements Utility
{
    String employeeName;
    String employeeID;
    int employeeAge;
    String employeeDept;

    @Override
    public void get_details()
    {
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Employee Age: " + employeeAge);
        System.out.println("Employee Dept: " + employeeDept);
    }

    @Override
    public void set_details()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("==========================  **** Enter Employee Details **** ==========================");
        System.out.println();
        System.out.println("Employee Name: ");
        employeeName = sc.nextLine();
        System.out.println();
        System.out.println("Employee ID: ");
        employeeID = sc.nextLine();
        System.out.println();
        System.out.println("Employee Age: ");
        employeeAge = sc.nextInt();
        System.out.println();
        System.out.println("Employee Department: ");
        employeeDept = sc.nextLine();
    }
}
