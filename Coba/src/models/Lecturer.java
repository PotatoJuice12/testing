package models;

public class Lecturer extends Human {
	private int salary;

	public Lecturer(String name, int age, int salary) {
		super(name, age);
		this.salary = salary;
	}


	@Override
	public void displayInfo() {
		System.out.println("Name: " +getName());
		System.out.println("Age: " +getAge());
		System.out.println("Role: Lecturer");
		System.out.println("Salary: " +salary);
	}

}
