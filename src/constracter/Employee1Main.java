package constracter;

public class Employee1Main {

	public static void main(String[] args) {
		
		
		Employee1 obj1=new Employee1("Rakesh");
		System.out.println(obj1.name +" "+obj1.age);
		
		Employee1 obj2= new Employee1("kapil", 40);
		System.out.println(obj2.name+ " "+40);
		
		Employee1 obj3= new Employee1("kavi",30,"12", true, 30.34);
		System.out.println(obj3.name +" "+obj3.age+" "+obj3.id+" " + obj3.isActive+" "+obj3.salary );
		
	}

}
