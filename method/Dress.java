class Dress
{
static String getBrandNames[]={"h&m","only","pepe","allen solly"};
public static void getBrandNames()
{
	System.out.println("getBrandNames invokes:");
	for(String getBrandName:getBrandNames)
	{
		System.out.println(getBrandName);
	}
	System.out.println("end getBrandName:");
}
	
}