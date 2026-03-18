class Whatsapp
{
	public static void logIn(String email,String password)
	{
		System.out.println("WhatsApp accepted email and password:");
		System.out.println(email);
		System.out.println(password);
	}

	public static void logIn(long phoneNumber,String password)
	{
		System.out.println("WhatsApp accepted phone number and password:");
		System.out.println(phoneNumber);
		System.out.println(password);
	}
}