package models;

public class Student extends Human {
	private double gpa;

	public Student(String name, int age, double gpa) {
		super(name, age);
		this.gpa = gpa;
	}

	@Override
	public void displayInfo() {
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Role: Student");
		System.out.println("GPA: " + gpa);
	

	}

}
