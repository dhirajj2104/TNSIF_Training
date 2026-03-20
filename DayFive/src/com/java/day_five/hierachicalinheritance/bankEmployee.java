package com.java.day_five.hierachicalinheritance;

public class bankEmployee extends people{
	
	private String jobTitle;
	private int empId;
	private int salary;
	
	public bankEmployee() {
		jobTitle = "manager";
		empId = 121;
		salary = 45000;
	}

	public bankEmployee(String name, int age, String jobTitle, int empId, int salary) {
		super(name, age);
		this.jobTitle = jobTitle;
		this.empId = empId;
		this.salary = salary;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getsalary() {
		return salary;
	}

	public void setsalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "bankEmployee [jobTitle=" + jobTitle + ", empId=" + empId + ", salary=" + salary + ", getName()="
				+ getName() + ", getAge()=" + getAge() + "]";
	}

}
