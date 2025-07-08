import java.util.Scanner;

class CoffeeMaker{
    private boolean hasWorkToDo;
    
    public void setHasWorkToDo(boolean b){
        hasWorkToDo = b;
    }
    
    public void brewCoffee(){
        if(hasWorkToDo){
            System.out.println("Brewing Coffee");
            hasWorkToDo=false;
        }
    }
}

class Refrigerator{
    private boolean hasWorkToDo;
    
    public void setHasWorkToDo(boolean b){
        hasWorkToDo = b;
    }
    
    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("Ordering Food");
            hasWorkToDo=false;
        }
    }    
}

class DishWasher{
    private boolean hasWorkToDo;
    
    public void setHasWorkToDo(boolean b){
        hasWorkToDo = b;
    }
    
    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Washing Dishes");
            hasWorkToDo=false;
        }
    }    
}

class SmartKitchen{
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;
    
    //public SmartKitchen(){}
    
    public SmartKitchen(){
        this.brewMaster = new CoffeeMaker();
        this.iceBox = new Refrigerator();
        this.dishWasher = new DishWasher();
    }
    
    public CoffeeMaker getBrewMaster(){
        return brewMaster;
    }
    public Refrigerator getIceBox(){
        return iceBox;
    }
    
    public DishWasher getDishWasher(){
        return dishWasher;
    }
    /*
    public void addWater(){
        
    }
        
    public void pourMilk(){
        
    }
        
    public void loadDishWasher(){
        
    }
    */
    ///*        
    public void setKitchenState(boolean b1, boolean b2, boolean b3){
        brewMaster.setHasWorkToDo(b1);
        iceBox.setHasWorkToDo(b2);
        dishWasher.setHasWorkToDo(b3);
    }
    
    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
    //*/
}

public class Main
{
	public static void main(String[] args) {
        SmartKitchen smart = new SmartKitchen();
        /*
		smart.getDishWasher().setHasWorkToDo(true);
		smart.getIceBox().setHasWorkToDo(true);
		smart.getBrewMaster().setHasWorkToDo(true);
		
		smart.getDishWasher().doDishes();
		smart.getIceBox().orderFood();
		smart.getBrewMaster().brewCoffee();
		*/
		smart.setKitchenState(true, false, true);
		smart.doKitchenWork();
	}
}



/*


import java.util.Scanner;

class iotDevice(){
    boolean hasWorkToDo;
    public iotDevice(){}
    public iotDevice(boolean b){
        hasWorkToDo=b;
    }
    public setHasWorkToDo(boolean b){
        hasWorkToDo=b;
    }
}

class CoffeeMaker extends iotDevice{
    public CoffeeMaker(boolean b){
        super(b)
    }
    public void brewCoffee(){
        if coffeemaker.hasWorkToDo){
            System.out.println("Start to brew coffee!");
        }else{
            System.out.println("The coffe maker has not started!");
        }
    }
    public void addWater(){
        if(coffeemaker.hasWorkToDo){
            System.out.println("Adding water!");
        }else{
            System.out.println("The coffe maker has not started!");
        }
    }
}

class DishWasher extends iotDevice{
    public DishWasher(boolean b){
        super(b);
    }
    public void doDishes(){
        if (dishWasher.hasWorkToDo){
            System.out.println("Starting dishes wash!");
        }else{
            System.out.println("The dish washer has not started!");
        }
    }
}

class Refrigerator extends iotDevice{
    
    public Refrigerator(boolean b){
        super(b);
    }
    
    public void orderFood(){
        if (this.hasWorkToDo){
            System.out.println("Ordering foood!");
        }else{
            System.out.println("The refrigerator has not started!");
        }
    }
}

public class SmartKitchen{
    CoffeeMaker brewMaster;
    DishWasher dishWasher;
    Refrigerator iceBox;
    
    public SmartKitchen(CoffeeMaker coffeemaker, DishWasher dishWasher, Refrigerator refrigerator){
        brewMaster = coffeemaker;
        this.dishWasher = dishWasher;
        iceBox = refrigerator;
    }
    
    public void addWater(){
        coffeemaker.setHasWorkToDo(true);
    }
    public void pourMilk(){
        refrigerator.setHasWorkToDo(true);
    }
    poblic void loadDishWasher(){
        dishWasher.setHasWorkToDo(true);
        if(dishWasher.hasWorkToDo == true){
            dishWasher.doDishes();
        }
    }
    public void setKitchenState(boolean b1, boolean b2, boolean b3){
        coffeemaker.setHasWorkToDo(b1);
        dishWasher.setHasWorkToDo(b2);
        iceBox.setHasWorkToDo(b3);
    }
    public void doKitchenWork(){
        
    }
}

public class Main
{
	public static void main(String[] args) {

		
	}
}

*/
