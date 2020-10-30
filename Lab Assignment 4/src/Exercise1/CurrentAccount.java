package Exercise1;

public class CurrentAccount extends Account{
	
    private double overDraftLimit;
	public CurrentAccount(double balance, Person accHolder) {
		super(balance, accHolder);
		// TODO Auto-generated constructor stub
	}
	/**
	 * amount for withdrawing certain amount;
	 */
	public boolean withdraw(double amount) {
		double newBalance=this.getBalance()-amount;
		if(newBalance<=0) {
			if(Math.abs(newBalance)<overDraftLimit) {
				this.setBalance(newBalance);
				return true;
			}
			else {
				System.out.println("can't withdraw as your account overdraft limit is reached.");
				return false;
			}
		}
		else {
			this.setBalance(newBalance);
			return true;
		}
		    
	}
	

}
