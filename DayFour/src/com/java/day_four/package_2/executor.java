package com.java.day_four.package_2;

import com.java.day_four.package_1.base;

public class executor {
	public static void main(String[] args) {
		
		base bs = new base();
		bs.publicMethod();
		
		bs.publicvar = 1234;
		bs.publicMethod();
	}
}
