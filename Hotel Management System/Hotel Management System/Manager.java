public class Manager extends Employee {


    private double bonus;

    protected void AddManager(){ 
        GetDetails();
        System.out.print("\nEnter Bonus       : ");
        bonus = scan.nextDouble();
        totalSal= Salary(basic,allowance,bonus);
        addEmployee();
        
    }

    private double Salary(Double basic,Double allowance,Double bonus){
        totalSal= basic + allowance + bonus;
        return totalSal;
    }  
}
