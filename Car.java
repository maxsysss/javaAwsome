class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private in cylinders;
    
    @Override
    public void startEngine(this){
        super(this);
        //System.out.println("HybridCar start engine!")
    }
    @Override
    protected void drive(this){
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
    
    @Override
    public void startEngine(this){
        super(this);
        System.out.println("EletricCar start engine!")
    }
    @Override
    protected void drive(this){
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
    
    @Override
    public void startEngine(this){
        super(this);
        //System.out.println("GasPoweredCar start engine!")
    }
    @Override
    protected void drive(this){
        super(this);
        //System.out.println("GasPoweredCar engine is running");
    }
    public String toString(){
        return "GasPowered Car";
    }
}


public class Car{
    String description;
    
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
        
    }
}


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
