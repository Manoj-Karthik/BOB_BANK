package com.sathya.Model;

public class BobTransfer {
	public long account_Number;
	public String name;
	public String password;
	public long target_Account_Number;
	public double amount;
	public BobTransfer() {
		super();
	}
	public BobTransfer(long account_Number, String name, String password, long target_Account_Number, double amount) {
		super();
		this.account_Number = account_Number;
		this.name = name;
		this.password = password;
		this.target_Account_Number = target_Account_Number;
		this.amount = amount;
	}
	public long getAccount_Number() {
		return account_Number;
	}
	public void setAccount_Number(long account_Number) {
		this.account_Number = account_Number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getTarget_Account_Number() {
		return target_Account_Number;
	}
	public void setTarget_Account_Number(long target_Account_Number) {
		this.target_Account_Number= target_Account_Number;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "BankTransfer [account_Number=" + account_Number + ", name=" + name + ", password=" + password
				+ ", target_Account_Number=" + target_Account_Number + ", amount=" + amount + "]";
	}
	
	
	
}
