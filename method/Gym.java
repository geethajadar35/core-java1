class Gym
{
static String getEquipmentsNames[]={"Treadmill","Dumbbells","SquatRack","cable machine","legpress  machine"};
public static void getEquipmentsNames()
{
	System.out.println("getEquipmentsNames invokes:");
	for(String getEquipmentsName:getEquipmentsNames)
	{
		System.out.println(getEquipmentsName);
	}
	System.out.println("end getEquipmentsNames:");
}
	
}