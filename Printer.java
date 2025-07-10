class Printer{
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    
    public Printer(){
        tonerLevel=100;
        pagesPrinted=0;
        duplex=false;
    }
    public Printer(boolean duplex){
        tonerLevel=100;
        pagesPrinted=0;
        this.duplex=duplex;
    }
    
    public Printer(int t, boolean d){
        tonerLevel=(t>=0&&t<=100)?t:-1;
        pagesPrinted = 0;
        duplex = d;
    }
    
    public int getTonerLevel(){
        //System.out.println("Toner Level: " + tonerLevel + "%");
        return tonerLevel;
    }
    public int getPagesPrinted(){
        //System.out.println("Pages printed: "+pagesPrinted+" pages");
        return pagesPrinted;
    }
    
    public int addToner(int tonerAmount){
       int tempAmount = tonerLevel + tonerAmount;
        if(tempAmount>100 || tempAmount<0){
            return -1;
        }
        tonerLevel+=tonerAmount;

        return tonerLevel;
    }
    public int printPages(int pages){
        int jobPages=(duplex) ? (pages/2)+(pages%2):pages;
        pagesPrinted += jobPages;
        return jobPages;
    }
}

public class Main
{
	public static void main(String[] args) {
        Printer p = new Printer(50,true);
        System.out.println("initial page count = " + p.getPagesPrinted());
        
        int pagesPrinted = p.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", pagesPrinted, p.getPagesPrinted());
        
        pagesPrinted = p.printPages(10);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", pagesPrinted, p.getPagesPrinted());
	}
}
