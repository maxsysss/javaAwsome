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
*/
class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders = 6;
    
    public GasPoweredCar(String d){
        super(d);
    }
    public GasPoweredCar(String d,double kmPL, int cyl){
        super(d);
        avgKmPerLitre=kmPL;
        cylinders=cyl;
    }
    
    @Override
    public void startEngine(){
        super.startEngine();
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }
    @Override
    protected void runEngine(){
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLitre);
    }
    /*
    @Override
    protected void drive(GasPoweredCar this){
        super(this);
        //System.out.println("GasPoweredCar engine is running");
    }
    */
    /*
    public String toString(){
        return "GasPowered Car";
    }
    */
    
}


class Car{
    private String description;
    
    public Car(String d){
        description=d;
    }
    
    public void startEngine(){
        System.out.println("Car -> start engine!");
    }
    protected void runEngine(){
        System.out.println("Car -> starts to move!");
    }
    public void drive(){
        System.out.println("Car -> driving type is: " + getClass().getSimpleName());
        runEngine();
    }
    
    public String toString(){
        return "Car";
    }
}

public class NextMain2{
    
    public static void main(String[] args){
        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);
        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS", 15.4, 6);
        runRace(ferrari);
    }
    
    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
    
}
    






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
    private int cylinders = 6;
    
    public GasPoweredCar(String d){
        super(d);
    }
    public GasPoweredCar(String d,double kmPL, int cyl){
        super(d);
        avgKmPerLitre=kmPL;
        cylinders=cyl;
    }
    
    @Override
    public void startEngine(){
        super.startEngine();
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }
    @Override
    protected void runEngine(){
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLitre);
    }
    /*
    @Override
    protected void drive(GasPoweredCar this){
        super(this);
        //System.out.println("GasPoweredCar engine is running");
    }
    */
    /*
    public String toString(){
        return "GasPowered Car";
    }
    
    
}


class Car{
    private String description;
    
    public Car(String d){
        description=d;
    }
    
    public void startEngine(){
        System.out.println("Car -> start engine!");
    }
    protected void runEngine(){
        System.out.println("Car -> starts to move!");
    }
    public void drive(){
        System.out.println("Car -> driving type is: " + getClass().getSimpleName());
        runEngine();
    }
    
    public String toString(){
        return "Car";
    }
}

public class NextMain2{
    
    public static void main(String[] args){
        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);
        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS", 15.4, 6);
        runRace(ferrari);
    }
    
    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
    
}
    






*/


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
