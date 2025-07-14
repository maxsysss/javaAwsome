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
