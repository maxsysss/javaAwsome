public class Main
{  

	public static void main(String[] args) {
        Employee e1 = new Employee("AAAAA", "01/01/1983", "31/12/2000");
        System.out.println("Age: "+e1.getAge());
        System.out.println("Pay: "+e1.collectPay());
        System.out.println(e1);
        
        Employee e2 = new Employee("BBBBB", "01/01/1921", "01/01/2001");
        System.out.println(e2);
        
	}
}

///////////////////////////////////////////////////////////////////////////////


class Worker{
    private String name, birthDate;
    protected String endDate; //Flexibility to another class to operate in it
    
    public Worker(){}
    
    public Worker(String n, String b){
        name = n;
        birthDate = b;
    }
    
    public int getAge(){
        int currentYear = 2025;
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return currentYear-birthYear;
    }
    //To overwriten
    public double collectPay(){
        return 0.0;
    }
    public void terminate(String endDate){
        this.endDate = endDate;
    }
    
    public String toString(){
        return "Name: "+name +"\nBirth date: "+birthDate+"\nEnd date: "+endDate;
    }
}
///////////////////////////////////////////////////////////////////////////////
class Employee extends Worker{
    private long employeeId;
    private String hireDate;
    private static int employeeNo = 1;
    
    public Employee(){}
    
    public Employee(String n, String b, String h){
        super(n,b);
        employeeId = Employee.employeeNo++;
        hireDate = h;
    }
    
    public String toString(){
        return "/Employee/\n"+"Employee Id:"+employeeId+"\nHire date: "+hireDate+"\nSuper tostring()\n" + super.toString();
    }
}
///////////////////////////////////////////////////////////////////////////////

class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;
    
    public void retire(){
        isRetired = true;
    }
}

///////////////////////////////////////////////////////////////////////////////

class HourlyEmployee extends Employee{
    private double hourlyPayRate;
    
    public double getDoublePay(){
        
    }
}

