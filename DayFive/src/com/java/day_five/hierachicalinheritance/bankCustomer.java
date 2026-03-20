package com.java.day_five.hierachicalinheritance;

public class bankCustomer extends people{
	
	private String accountType;
	private float balance;
	
	
	public bankCustomer() {
		accountType = "saving";
		balance = 90000;
	}

	public bankCustomer(String name, int age, String accountType, float balance) {
		super(name, age);
		this.accountType = accountType;
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "bankCustomer [accountType=" + accountType + ", balance=" + balance + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + "]";
	}
	

	
}
