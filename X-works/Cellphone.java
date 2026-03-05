class Cellphone
{
static String getAppNames[]={"Instgaram","whatsapp","google","snapchat"};
public static void getAppNames()
{
	System.out.println("getAppNames invokes:");
	for(String getAppName:getAppNames)
	{
		System.out.println(getAppName);
	}
	System.out.println("end getAppNames:");
}
	
}