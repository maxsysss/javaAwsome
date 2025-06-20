import java.util.Scanner;
public class Main
{  
    public static boolean isANumber(String str){
        if(str.isEmpty() || str == null) return false;
        try{
            Integer.parseInt(str);
            return true;
        }catch(Exception e){
            return false;
        }
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String warning = "Type a number or char to QUIT: ";
        int num = 0;
        int min = Integer.MIN_VALUE, max = Integer.MIN_VALUE, temp;
        System.out.print(warning);
        String str = sc.nextLine();
        do{
            try{
                System.out.print(warning);
                num = Integer.parseInt(str);
                if(min == Integer.MIN_VALUE && max == Integer.MIN_VALUE){
                    min = num;
                    max = num;
                }else if(num < min){
                    min = num;
                }
                if(num > max){
                    max = num;
                }
                str = sc.nextLine();
            }catch(Exception e){
                System.out.println("Is not a number...");
            }
        }while(isANumber(str));
        
        System.out.println("Max number is: " + max + " Min number is: " + min);
        
	}
}
	

