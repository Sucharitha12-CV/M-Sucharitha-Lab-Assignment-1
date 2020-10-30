package Exercise1;

public class SavingsAcc extends Account{
	public SavingsAcc(double balance, Person accHolder) {
		super(balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	/**
	 * setting the minimum balance
	 */
    private final double MinBal=500;
	
	/**
	 * Overriding the method and checking for minimum balance
	 */
	public boolean withdraw(double amount) {
		double newBalance=super.getBalance()-amount;
		if(newBalance>=MinBal) {
			super.setBalance(newBalance);
			return true;
		}
		else
		{
			System.out.println("can't withdraw balance as your account does have enough amount.");
			return false;
		}
	}
	

}
