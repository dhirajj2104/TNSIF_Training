package com.java.day_five.singleinheritance;

public class employees extends people {

	private int employeeId;
	private String department;
	
	public employees() {
		System.out.println("employees default constructor");
	}

	public employees(String name, String gender, int age, String city, int employeeId, String department) {
		super(name, gender, age, city);
		this.employeeId = employeeId;
		this.department = department;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "employees [employeeId=" + employeeId + ", department=" + department + ", Name()=" + getName()
				+ ", Gender()=" + getGender() + ", Age()=" + getAge() + ", City()=" + getCity() + "]";
	}
	
	
}
