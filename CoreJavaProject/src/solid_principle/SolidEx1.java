package solid_principle;
/*
 * SOLID Principles -
 * SOLID is an acronym for the first object-oriented design (ooD) 
 * principles by C.Mortin
 * 
 * S - Single Responsibility Principle - 
 * 			A class should have one and only one reason to change.
 * O -
 * L -
 * I -
 * D -
 */

class AccountService{
	AccountRepository accountRepository=new AccountRepository();
	NotificationService notificationService=new NotificationService();
	public void openAccount() {
		System.out.println("fill account details");
		
		accountRepository.create();
		
		notificationService.sendNotification();
	}
}
class AccountRepository{
	public void create() {
		System.out.println("store account object in databse");
	}
}
class NotificationService{
	public void sendNotification() {
		System.out.println("send welcome message");
	}
}
public class SolidEx1 {
	public static void main(String[] args) {
		AccountService accountService=new AccountService();
		accountService.openAccount();
	}
}
