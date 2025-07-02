
class Worker{
    private String name, birthDate;
    protected String endDate; //Flexibility to another class to operate in it
    
    public Worker(){}
    
    public Worker(String n, String b, String e){
        name = n;
        birthDate = b;
    }
    
    public int getAge(){
        int currentYear = 2025;
        birthYear = Integer.parseInt(birthDate.substring(6))
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
    private long employeeld;
    private String hireDate;
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

