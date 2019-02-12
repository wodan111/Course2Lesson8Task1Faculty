package ua.testov.test;

import java.io.Serializable;

public class Human implements Serializable{
	private String firstName;
	private String secondName;
	private boolean gender;
	private double age;
	private String activity;
	private double income;

	public Human() {
		super();
	}

	public Human(String firstName, String secondName, boolean gender, double age) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.gender = gender;
		this.age = age;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public boolean isGender() {
		return gender;
	}



	public double getAge() {
		return age;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public void setAge(double age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Human [firstName=" + firstName + ", secondName=" + secondName + ", gender=" + gender + ", age=" + age
				+ ", activity=" + activity + ", income=" + income + "]";
	}

}
