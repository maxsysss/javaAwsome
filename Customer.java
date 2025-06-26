public class Customer{
    private String name;
    private double cLimit;
    private String email;
    
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public double getLimit(){
        return cLimit;
    }
    
    public Customer(String name, double cLimit, String email){
        this.name = name;
        this.cLimit = cLimit;
        this.email = email;
    }
    public Customer(){
        this("AAAAA","AAAAA@BBB.CC");
    }
    public Customer(String name, String email){
        this.cLimit = 2000.0d
        this(name, cLimit, email);
    }
}
