package Bank;
import java.util.Scanner;
public class Choices {
	static Scanner scan = new Scanner(System.in);
	String firstname;
	String lastname;
	String email;
	int money;
	int accnum;
	
	
	Choices(){
		
	}
	Choices(String firstname, String lastaname, String email, int money, int accnum){
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.money = money;
		this.accnum = accnum;
	}
	
	void view(int accnum, String firstname, String lastname, String email, int money) {
		System.out.println("\t\t\t======================");
		System.out.println("\t\t\tAccount Number " + accnum);
		System.out.println("\t\t\tName:" + firstname + " "+ lastname);
		System.out.println("\t\t\tEmail:" + email);
		System.out.println("\t\t\tCurrent Money: " + money);
		System.out.println("\t\t\t=======================");
	}
	
}
