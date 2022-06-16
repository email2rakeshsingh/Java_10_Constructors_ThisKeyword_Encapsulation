package constracter;

public class Employee {

	String name;
	int age;
	double salry;
	boolean isactive;
	String id;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
		
		System.out.println ("name and age shoud be displayed :");
	}

	public Employee(double salry, boolean isactive, String id) {
		this.salry = salry;
		this.isactive = isactive;
		this.id = id;
		
		System.out.println("companey is active are not : ");
	}

	public Employee(String name, int age, double salry, boolean isactive, String id) {
		this.name = name;
		this.age = age;
		this.salry = salry;
		this.isactive = isactive;
		this.id = id;
	}

	public static void main(String[] args) {
		
		Employee obj1= new Employee ("rakesh", 30);
		System.out.println(obj1.name + " " +obj1.age);
		
		Employee obj2 = new Employee(12.36, true, "101");
		System.out.println(obj2.salry + " "+obj2.isactive + " "+obj2.id );
		

	}

}
