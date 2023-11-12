package Bank;
import java.util.Scanner;
public class Main {
	final static String user = "user";
	final static String pass = "admin";
	public static void main(String[] args){
		int x = 0;
		Menu menu = new Menu();
		String username;
		String password;
		Scanner scan = new Scanner(System.in);
		System.out.println("\t\t\tWelcome Administrator");
		System.out.println("\t\t\t\n\n");
		for(; x < 5; x++) {
		System.out.print("\t\t\tEnter Username:");
	    username = scan.nextLine();
	    System.out.print("\t\t\tEnter Password:");
	    password = scan.nextLine();
	    if(username.equalsIgnoreCase(user)) {
	    	if(password.equalsIgnoreCase(pass)) {
	    		menu.menu();
	    		break;
	    	}
	    	else {
	    		System.out.println("\t\t\tWrong Password!");
	    	}
	    }
	    else {
	    	System.out.println("\t\t\tWrong Username!");
	    	
	    }
		}
		     if(x == 5) {
			 System.out.println("\t\t\tAttempetd 5 times!");
			 System.out.println("\t\t\tThe Prorgam will now Exit!");
		     }
	}

}
