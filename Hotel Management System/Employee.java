import java.util.ArrayList;
import java.util.Scanner;
class Employee {
    protected String name;
    protected String id;
    protected String section;
    protected double basic,allow,totalSal,allowance;
    private int Option;
    protected ArrayList<Employee> employeeList = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void EmployeeMenu() {
        Main.clear();
        System.out.println("\t1.Add Employee     : ");
        System.out.println("\t2.Display Employee : ");
        System.out.println("\t3.Add Manager      : ");
        System.out.println("\t4.Back             : ");
        
        
        while (true) {
            System.out.print("\nEnter Selection: ");
            Option = scan.nextInt();  
            if (Option == 1 || Option == 2 || Option == 3 || Option == 4) {
                
                break;
            } else {
                System.out.println("Invalid Selection\n");
                
            } 
            Main.sleep(2);
            Main.clear();
        }

        Manager manager = new Manager();
        Main.sleep(2);
        Main.clear();
        switch (Option) {
            
            case 1:
                GetDetails();
                totalSal= Salary(basic,allowance);
                Main.clear();
                System.out.println("\n\nEmployee added successfully!\n");
                Main.sleep(3);
                Main.clear();
                addEmployee();
                break;
            case 2:
                displayEmployees();
                Main.sleep(2);
                Main.clear();
                break;
            case 3:
                manager.AddManager();
                Main.clear();
                System.out.println("\n\nManager added successfully!\n");
                Main.sleep(3);
                break;
            case 4:
                Main.clear();
                Hotel hotel=new Hotel();
                hotel.HotelMenu();
                break;
        }
        EmployeeMenu();
    }


    protected void addEmployee(){
        
        Employee employee = new Employee();
        employee.name = name;
        employee.id = id;
        employee.section = section;
        employee.totalSal=totalSal;

        employeeList.add(employee);
        
        /*
            System.out.println("\tName: " + employee.name);
            System.out.println("\tID: " + employee.id);
            System.out.println("\tSection: " + employee.section);
            System.out.println("\tSalary: " + employee.totalSal);
        */
    }


    private double Salary(double basic,double allowance)
    {
        totalSal= basic + allowance;
        return totalSal;
       
    }

    public void displayEmployees() {
        System.out.println("\n\n\nList of Employees:");
        
        for (Employee employee : employeeList) {
            System.out.println("-----------------------------------------\n\n");
            System.out.println("\tName     : " + employee.name);
            System.out.println("\tID       : " + employee.id);
            System.out.println("\tSection  : " + employee.section);
            System.out.println("\tSalary   : " + employee.totalSal);
            System.out.println("-----------------------------------------\n\n");
        }
        
    }
    protected void GetDetails(){
        Scanner scan = new Scanner(System.in);

        System.out.print("\tEnter Name        : ");
        name = scan.nextLine();

        System.out.print("\tEnter ID          : ");
        id = scan.nextLine();

        System.out.print("\tEnter Section     : ");
        section = scan.nextLine();

        System.out.print("\tEnter Basic Salary: ");
        basic = scan.nextDouble();

        System.out.print("\tEnter Allowance   : ");
        allowance = scan.nextDouble();
    }
    
}