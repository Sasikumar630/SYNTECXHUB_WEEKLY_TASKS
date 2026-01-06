import java.util.*;

//package WeekThree;
abstract class Employee {
    protected int empId;
    protected String empName;

    // Constructor
    public Employee(int employeeId, String employeeName) {
        this.empId = employeeId;
        this.empName = employeeName;
    }

    // Abstract Method
    abstract void inputDetail();

    abstract double calculateSalary();

    public void displayinfo() {
        System.out.println("---------Employee Details---------");
        System.out.println("Employee ID :" + empId);
        System.out.println("Employee Name :" + empName);

    }
}

class parmanentEmployee extends Employee {
    private double basicSalary, allowance;

    // constructor
    public parmanentEmployee(int empId, String empName) {
        super(empId, empName);
    }

    @Override
    public void inputDetail() {
        Scanner ins = new Scanner(System.in);
        System.out.print("Enter Basic Salary :$");
        basicSalary = ins.nextDouble();
        System.out.print("Enter Allowance :$");
        allowance = ins.nextDouble();

    }

    @Override
    public double calculateSalary() {
        return basicSalary + allowance;
    }
}

class VisitingEmployee extends Employee {
    private int workedHour;
    private double hourlyRate;

    public VisitingEmployee(int empId, String empName) {
        super(empId, empName);
    }

    @Override
    public void inputDetail() {
        Scanner ins = new Scanner(System.in);
        System.out.print("Enter Hourly Rate :$");
        hourlyRate = ins.nextDouble();
        System.out.print("Enter Hour :$");
        workedHour = ins.nextInt();

    }

    @Override
    public double calculateSalary() {
        return workedHour * hourlyRate;
    }
}

public class EmpRecdMangmt {
    public static void main(String[] args) {
        Scanner ins = new Scanner(System.in);
        Employee pemployee = new parmanentEmployee(0, "");
        Employee vemployee = new VisitingEmployee(0,"");
        char op;
        do {
            System.out.println("Select Employee Type");
            System.out.println("1. Permanent Employee");
            System.out.println("2. Visiting Employee");
            System.out.print("Enter Your Choice :");
            int choice = ins.nextInt();
            switch (choice) {
                case 1:{
                    System.out.print("Enter Employee Id :");
                    int id = ins.nextInt();
                    System.out.print("Enter Employee Name :");
                    String name = ins.next();
                    pemployee.empId = id;
                    pemployee.empName = name;
                    pemployee.inputDetail();
                    double sal = pemployee.calculateSalary();
                    pemployee.displayinfo();
                    System.out.println("Calculated Salary:"+sal);
                    break;
                }
                case 2:{
                    System.out.print("Enter Employee Id :");
                    int id = ins.nextInt();
                    System.out.print("Enter Employee Name :");
                    String name = ins.next();
                    vemployee.empId = id;
                    vemployee.empName = name;
                    vemployee.inputDetail();
                    double sal = vemployee.calculateSalary();
                    vemployee.displayinfo();
                    System.out.println("Calculated Salary:"+sal);
                    break;
                }
                default:
                System.out.println("Invalid Number Try Again");
            }
                System.out.print("Do You Want To Continue(Y/N) :");
                 op = ins.next().charAt(0);

        }while(op =='y' || op=='Y');
        


    }

}
