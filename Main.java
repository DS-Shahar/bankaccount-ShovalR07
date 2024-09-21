package lesson1;

public class Main {

	public static void main(String[] args) {
		
	  /*
		BankAccount acct1 = new BankAccount(3000,-1000, "Lisa");
		System.out.println(acct1.getBalance());
		System.out.println(acct1.getMinBalance());
		boolean succes = acct1.withdraw(1500);
		System.out.println("succes=" + succes + ", balance=" + acct1.getBalance());
        acct1.deposit(1500);
        System.out.println("balance=" + acct1.getBalance());
        System.out.println(acct1);
*/
		
		
		BankAccount Lisa = new BankAccount (1000,-1000,"Lisa");
		BankAccount Bob = new BankAccount (1000,-1000,"Bob");
		System.out.println(Lisa.getBalance());
		System.out.println(Bob.getBalance());
		System.out.println(Lisa.transfer(Bob,500));
		System.out.println(Lisa.getBalance());
		System.out.println(Bob.getBalance());
		
		System.out.println(Lisa.transfer(Bob,1600));
		
	}

}
