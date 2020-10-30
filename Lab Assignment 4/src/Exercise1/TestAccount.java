package Exercise1;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person smith=new Person();
		//opening account for smith and depositing 2000$
		smith.setName("smith");
		Account SmithAcc=new Account(2000,smith);
		Person kathy=new Person();
		//opening account for kathy and depositing 3000$
		kathy.setName("Kathy");
		Account KathyAcc=new Account(3000,kathy);
		//depositing 2000 into smith account
		SmithAcc.deposit(2000);
		//withdrawing 2000 from Kathy account
		KathyAcc.withdraw(2000);
		//printing updated balance in both accounts.
		System.out.println("Updated balance in Smith's account:"+SmithAcc.getBalance());
		System.out.println("Updated balance in Kathy's account:"+KathyAcc.getBalance());
		

	}

}
