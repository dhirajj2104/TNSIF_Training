package com.java.day_four.package_1;

public class executor {
	public static void main(String[] args) {
		
		base bs = new base();
		bs.defaultMethod();
		bs.protectedMethod();
		bs.publicMethod();
		//bs.privateMethod();
		
		bs.protectedvar = 10;
		bs.protectedMethod();
		
		bs.defaultvar = 20;
		bs.defaultMethod();
		
		bs.publicvar = 30;
		bs.publicMethod();
		
		bs.setPrivatevar1(123);
		System.out.println(bs.getPrivatevar1());
	}
}
