package main;

import java.util.ArrayList;
import java.util.Scanner;

import models.*;

public class Main {
	private static ArrayList<Human> people = new ArrayList<>();
	public Main() {
				
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		do {
			displayMenu();
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				addPerson();
				break;
			case 2:
				viewPerson();
				break;
			case 3:
				removePerson();
				break;
			case 4:
				System.out.println("Exiting Program....");
				break;
				
			default:
				System.out.println("Invalid");
			}
		} while (menu != 4);
		
		
		
		
	}

	private static void displayMenu() {
		System.out.println("DeU's Class Management System");
		System.out.println("------------------------------");
		System.out.println("1. Add Person");
		System.out.println("2. View Person");
		System.out.println("3. Remove Person");
		System.out.println("4. Exit");
		System.out.print("Please Insert a Number >>");
		
	}
	private static void addPerson() {
		
		Scanner scan = new Scanner(System.in);
		String name;
		int age;
		String role;
		double gpa;
		int salary;
		System.out.print("Enter the person's name >>");
		name = scan.nextLine();
		System.out.print("Enter the person's age >>");
		age = scan.nextInt();
			scan.nextLine();
			System.out.print("Enter the person's role (Student/Lecturer) >>");
			role = scan.nextLine();
			if (role.equalsIgnoreCase("Student")) {
				do {
					System.out.print("Enter the student's GPA >>");
					gpa = scan.nextDouble();
					scan.nextLine();
				} while (gpa < 0 || gpa > 4);
				Human student = new Student (name, age, gpa);
				people.add(student);
				
			} else if(role.equalsIgnoreCase("Lecturer")) {
				do {
					System.out.print("Enter the lecturer's Salary >>");
					salary = scan.nextInt();
					scan.nextLine();
				} while (salary < 4000000);
				
				Human lecturer = new Lecturer (name, age, salary);
				people.add(lecturer);
				}
			else {
				System.out.println("Invalid Role");
			}
	}
	private static void viewPerson() {
	
		if (people.isEmpty()) {
			System.out.println("There are no people in the classroom.");
		}else {
			for (Human human : people) {
				human.displayInfo();
			}
		}
	}
	private static void removePerson() {
		Scanner scan = new Scanner(System.in);
		int peopleIndex;
		if (people.isEmpty()) {
			System.out.println("There are no people in the classroom.");
			return;
		}
		System.out.print("enter the index of the person you want to remove >>");
		peopleIndex = scan.nextInt();
		scan.nextLine();
		if (peopleIndex < 1 || peopleIndex > people.size()) {
			
		}
		
	}
	
	public static ArrayList<Human> getPeople() {
		return people;
	}

	public static void setPeople(ArrayList<Human> people) {
		Main.people = people;
	} 
		

}
