package com.java.day_four.package_1;

public class base {
	
	int defaultvar = 1;
	public int publicvar = 2;
	private int privatevar = 3;
	protected int protectedvar = 4;
	
	void defaultMethod() {
		System.out.println("default variable is "+ defaultvar);
	}
	
	public void publicMethod() {
		System.out.println("public variable is "+ publicvar);
	}
	
	private void privateMethod() {
		System.out.println("private variable is "+ privatevar);
	}
	
	protected void protectedMethod() {
		System.out.println("protected variable is "+ protectedvar);
	}
	
	
	private int privatevar1 = 12;

	public int getPrivatevar1() {
		return privatevar1;
	}

	public void setPrivatevar1(int privatevar1) {
		this.privatevar1 = privatevar1;
	}

	
	
	
}
