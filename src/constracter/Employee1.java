package constracter;

public class Employee1 {

	String name;
	int age;
	String id;
	boolean isActive;
	double salary;

	public Employee1() {
 System.out.println("Default Constructor :" );
	}

	public Employee1(String name) {
		this.name = name;
		
		System.out.println("Print the name of emp :" +name);
	}

	public Employee1(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("print the name and age :");
	}

	public Employee1(String name, int age, String id, boolean isActive, double salary) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.isActive = isActive;
		this.salary = salary;
	}

}
