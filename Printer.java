class Printer{
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    
    public Printer(int t, int p, boolean d){
        tonerLevel = t;
        pagesPrinted = p;
        duplex = d
    }
    
    public void getTonerLevel(){
        System.out.println("Toner Level: " + tonerLevel + "%");
    }
    public void getPagesPrinted(){
        System.out.println("Pages printed: "+pagesPrinted+" pages");
    }
    
    public int addToner(int tonerAmount){
        tonerLevel+= tonerAmount;
        if(tonerLevel>100){
            tonerLevel=100;
        }else if(tonerLevel<0){
            tonerLevel=0;
        }
        return tonerLevel;
    }
    public int printPages(int pages){
        if (duplex){
            pagesPrinted+=pages/2;
        }else{
            pagesPrinted+=pages;
        }
        return pagesPrinted
    }
}

public class Main
{
	public static void main(String[] args) {

	}
}

