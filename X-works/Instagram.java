class Instagram 
{

	public static void createAccount(String firstname,String surname,String dob,String email,String phoneNo,String password)
	
	{
	System.out.println("createAccount:");
	System.out.println("firstname:" +firstname);
	System.out.println("surname:" +surname);
	System.out.println("dob:"+dob);
	System.out.println("email:"+email);
	System.out.println("phoneNo"+phoneNo);
	System.out.println("password:"+password);
	
	
	}
	public static void main(String[] args)
	{
	Instagram.createAccount("geetha","jadar","09-09-2003","geethajadar@gmail.com","123456789","gee0912");

	}
}