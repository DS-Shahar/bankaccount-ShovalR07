package lesson1;

public class BankAccount {

	private int balance = 0;
	private int minBalance = -5000;
	private String owner;
	
	public boolean withdraw(int amount)
	{
		if(balance - amount < minBalance)
			return false;
		balance = balance - amount;
		return true;
	}
	
	public String toString() 
	{
        return "balance of " + owner +": " + balance;
    }

	public boolean transfer(BankAccount target, int amount)
	{
		if(withdraw(amount)==false)
		{
			System.out.println("your Min amount can reach only to " + minBalance + ". try again with a fewer amount");
			return false;
		}
		target.deposit(amount);
		return true;
	}
	
	public BankAccount(int balance, int minBalance, String owner)
	{
		this.balance = balance;
		this.minBalance = minBalance;
		this.owner = owner;
	}
	
	public void deposit(int amount)
	{
		balance = balance + amount;
    }
	
	public String getOwner()
	{
		return owner;
	}
	
	public void setOwner(String owner)
	{
		this.owner = owner;
	}
	
	/**
	 * @param balance Amount of monry in the account, can be negative
	 * @param balance Must be >= minBalance
	 */
	
	public int getBalance()
	{
		return balance;
	}
	
	public void setBalance(int x)
	{
		if(x >= minBalance)
		{
			balance = x;
		}
	}
	
	public int getMinBalance()
	{
		return minBalance;
	}
	 
}
