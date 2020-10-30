package Exercise1;
/**
 * Desc: to open an account and perform deposit and withdraw operations.
 * @author Sucharitha M
 *
 */

public class Account {
	private double balance;
	private Person accHolder;
	private long accNum=0;
	/**
	 * Constructor
	 * @param balance for opening account
	 * @param accHolder - details of person holding account
	 * @param accNum - account number of account holder
	 */
	public Account(double balance,Person accHolder)
	{
		this.balance=balance;
		this.accHolder=accHolder;
		this.accNum=accNum+1;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum=accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder)
	{
		this.accHolder=accHolder;
	}
	public void deposit(double amount) {
		/**
		 * to deposit amount in an account and return changed balance
		 */
		double newBalance=this.getBalance()+amount;
		this.setBalance(newBalance);
	}
	public boolean withdraw(double amount) {
		/**
		 * to withdraw amount from the account and return changed balance
		 */
		double newBalance=this.getBalance()-amount;
		this.setBalance(newBalance);
		return true;
	}
}
