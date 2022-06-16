package constracter;

public class NoargConstructor {
	
	int num;
	String name;
	
	NoargConstructor(){
		
		System.out.println("demo class constroter called :");
		System.out.println("num =" + num +" name =" +name );
	}

	public static void main(String[] args) {
		NoargConstructor obj1=new NoargConstructor();
		System.out.println(obj1.name="rakesh");
		

	}

}
