package account;

public class Main
{  

	public static void main(String[] args) {
        BankAccount bc = new BankAccount();
        bc.setAccNumber("AAAAA");
        bc.setCustName("BBBBB");
        bc.setEmail("EEEEE");
        bc.setPhoneNo("PPPPPP");
        bc.deposit(1000000);
        bc.withdraw(1000001);
        System.out.println(bc);
        
	}
}
	


package account;
class BankAccount{
    private String accNumber;
    private double balance;
    private String custName;
    private String email;
    private String phoneNo;
    
    public void setAccNumber(String accNumber){
        this.accNumber = accNumber;
    }
    public void setCustName(String name){
        this.custName = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if(this.balance - amount <= 0){
            System.out.println("No suficient funds to withdraw");
        }else{
            System.out.println("You withdraw: $" + (balance - amount));
        }
    }
    public String toString(){
        return "Balance: " + balance + "\nAccount number: " + accNumber + "\nName: " + custName + "\nE-mail: " + email + "\nPhone: " +phoneNo;
    }
}
