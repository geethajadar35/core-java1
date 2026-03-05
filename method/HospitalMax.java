class HospitalMax
{
static String getDoctorNames[]={"geetha","vinutha","nanditha","vaishu","chandu"};
public static void getDoctorNames()
{
	System.out.println("getDoctorNames invokes:");
	for(String getDoctorName:getDoctorNames)
	{
		System.out.println(getDoctorName);
	}
	System.out.println("end getDoctorNames:");
}
	
}