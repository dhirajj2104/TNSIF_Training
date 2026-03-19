package com.java.day_three.scanner;

public class student {
		
		private String name;
		private String gender;
		private String stream;
		private int age;
		private int roll_no;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getStream() {
			return stream;
		}
		public void setStream(String stream) {
			this.stream = stream;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getRoll_no() {
			return roll_no;
		}
		public void setRoll_no(int roll_no) {
			this.roll_no = roll_no;
		}
		
		@Override
		public String toString() {
			return "student [name=" + name + ", gender=" + gender + ", stream=" + stream + ", age=" + age + ", roll_no="
					+ roll_no + "]";
		}
		
		
		
}
