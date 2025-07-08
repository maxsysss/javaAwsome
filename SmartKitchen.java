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
