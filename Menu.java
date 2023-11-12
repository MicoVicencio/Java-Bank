package Bank;
import java.util.Scanner;

public class Menu {
	static Scanner scan = new Scanner(System.in);
	static String firstname_acc[] = new String[10];
	static String lastname_acc[] = new String[10];
	static int currentmoney_acc[] = new int[10];
	static String email_acc[] = new String[10];
	static int counter_acc = 0;
	static int depo;
	static int accnum;
	static int withraw;
	static int acc_num[] = {0,1,2,3,4,5,6,7,8,9};
	
	void clearscreen() {
		for(int a = 0; a < 30; a++) {
			System.out.println("\t\t\t");
		}
	}
	void menu() {
		clearscreen();
		Choices choice = new Choices();
		int choicez;
		System.out.println("\t\t\tWelcome to Bank Management System");
		System.out.println("\t\t\tChoose what do you want!");
		System.out.println("\t\t\t[1] Create Account");
		System.out.println("\t\t\t[2] View Accounts");
		System.out.println("\t\t\t[3] Deposit Money");
		System.out.println("\t\t\t[4] Withraw Money");
		System.out.println("\t\t\t[5] Exit");
        System.out.print("\t\t\tEnter Choice:");
        choicez = scan.nextInt();
        scan.nextLine();
        switch(choicez) {
        case 1:
        	boolean valid;
        	do {
            System.out.println("\n\n\n\t\t\tAccount Creation:");
        	System.out.print("\t\t\tEnter Firstname:");
    		firstname_acc[counter_acc] = scan.nextLine();
    		System.out.print("\t\t\tEnter Lastname:");
    		lastname_acc[counter_acc] = scan.nextLine();
    		System.out.print("\t\t\tEnter Email Address:");
    		email_acc[counter_acc] = scan.nextLine();
    		counter_acc++;
    		System.out.print("\t\t\tDo you want to create another account?");
    		String select = scan.nextLine();  
    		if(select.equalsIgnoreCase("yes")) {
    			valid = true;
    		}
    		else {
    		     valid = false;
    		}
}
        	while(valid);
    		menu();
        	break;
        case 2:
        	
        	System.out.println("\n\n\t\t\tList of Accounts:");
        	for(int display = 0; display < counter_acc; display++) {
        		
        		choice.view(acc_num[display], firstname_acc[display], lastname_acc[display], email_acc[display], currentmoney_acc[display]);
        		
        	}
        	menu();
        	break;
        case 3:
        	int d_selection;
        	System.out.println("\n\n\t\t\tSelect What Account Do you want:");
            System.out.print("\t\t\t========================================");
        	System.out.println("\n\n\t\t\tList of Accounts:");
        	for(int display = 0; display < counter_acc; display++) {
        		
        		choice.view(acc_num[display], firstname_acc[display], lastname_acc[display], email_acc[display], currentmoney_acc[display]);
        		
        	}
            System.out.print("\t\t\tChoose Acount:");
            d_selection = scan.nextInt();
            scan.nextLine();
            System.out.print("\t\t\tEnter how much money do you want to deposit:");
            depo = scan.nextInt();
            scan.nextLine();
            currentmoney_acc[d_selection] = currentmoney_acc[d_selection] + depo;
            System.out.println("\t\t\tMoney Added!");
            menu();
        	break;
        case 4:
        	int w_selection;
        	System.out.println("\n\n\t\t\tSelect What Account Do you want:");
            System.out.print("\t\t\t========================================");
        	System.out.println("\n\n\t\t\tList of Accounts:");
        	for(int display = 0; display < counter_acc; display++) {
        		
        		choice.view(acc_num[display], firstname_acc[display], lastname_acc[display], email_acc[display], currentmoney_acc[display]);
        		
        	}
            System.out.print("\t\t\tChoose Acount:");
        	w_selection = scan.nextInt();
        	scan.nextLine();
        	System.out.print("\t\t\tEnter how much money do you want to withraw:");
        	withraw = scan.nextInt();
        	scan.nextLine();
        	if(withraw > currentmoney_acc[w_selection]) {
        		System.out.print("\t\t\tInsuffient Balace!");
        		menu();
        	}
        	currentmoney_acc[w_selection] = currentmoney_acc[w_selection] - withraw;
        	menu();
        	break;
        case 5: 
        	System.out.println("\t\t\tThe System will now Exit!");
        	return;
		default:
			System.out.println("\t\t\tInvalid Selection! The System will now exit!");
        		return;
        }
		
		
		
		
	}

}

