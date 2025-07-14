


/*
class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;
    
    public HybridCar(String d){
        super(d);
    }
    
    @Override
    public void startEngine(Object this){
        super(this);
        //System.out.println("HybridCar start engine!")
    }
    @Override
    protected void drive(Object this){
        super(this);
        //System.out.println("HybridCar engine is running");
    }
    public String toString(){
        return "Hybrid Car";
    }
}


class EletricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;
    
    public EletricCar(String d){
        super(d);
    }
    @Override
    public void startEngine( EletricCar this){
        super(this);
        System.out.println("EletricCar start engine!");
    }
    @Override
    protected void drive(EletricCar this){
        super(this);
        //System.out.println("EletricCar engine is running");
    }
    public String toString(){
        return "Eletric Car";
    }
}

class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders;
    
    public GasPoweredCar(String d){
        super(d);
    }
    @Override
    public void startEngine(GasPoweredCar this){
        super(this);
        //System.out.println("GasPoweredCar start engine!")
    }
    @Override
    protected void drive(GasPoweredCar this){
        super(this);
        //System.out.println("GasPoweredCar engine is running");
    }
    public String toString(){
        return "GasPowered Car";
    }
}


public class Car{
    String description;
    
    public Car(String d){
        description=d;
    }
    
    public void startEngine(Car c){
        System.out.println(c + ": start engine!");
    }
    public void drive(Car c){
        runEngine(c);
    }
    protected void runEngine(Car c){
        System.out.println(c + ": starts to move!");
    }
    
    public String toString(){
        return "Car";
    }
    
    
    public static void main(String[] args){
        Car c = new Car("AAAA");
        c.runEngine(this);
    }
}

*/


/*
class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private in cylinders;
}


class EletricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;
}

class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders;
}


public class Car{
    String description;
    
    public void startEngine(){
        
    }
    public void drive(){
        runEngine();
    }
    protected void runEngine(){
        
    }
}
*/
