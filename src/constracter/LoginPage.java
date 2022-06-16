package constracter;

public class LoginPage {
	
	String username;
	String password;
	

	public LoginPage(String username, String password) {
		this.username = username;
		this.password = password;
	}
	public void doLogin () {
		System.out.println("please netr the :" +username +" " +password);
		System.out.println("login succesfully ");
	}





	public static void main(String[] args) {
		
		LoginPage lp=new LoginPage("email@gmail.com", "rak123");
		lp.doLogin ();
		

	}

}
