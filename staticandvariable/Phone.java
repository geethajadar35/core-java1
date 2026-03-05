class Phone 
{
    static String brand="Realme";
	static String simSlots;
	static String color="blue";
	static int storageCapacity=128;
	static double screenSize;
	static int ram;
	static String frontCameraResolution;
  public static void main(String[] args)
  {
	String brand="Realme";
	String simSlots="Dual Sim";
	String color="Green";
	int storageCapacity=128;
	double screenSize=6.7 ;
	int ram=4;
	String frontCameraResolution="Eight MP Front Camera";
	
	System.out.println("Brand: "+brand);
	System.out.println("Brand: "+Phone.brand);
	
	System.out.println("SimSlots is: "+simSlots);
	System.out.println("SimSlots is: "+Phone.simSlots);
	
	System.out.println("Color: "+color);
	System.out.println("Color: "+color);
	
	System.out.println("Mobile Storage Capacity: "+storageCapacity);
	System.out.println("Mobile Storage Capacity: "+Phone.storageCapacity);
	
	System.out.println("Screen Size: "+screenSize);
	System.out.println("Screen Size: "+Phone.screenSize);
	
	System.out.println("Ram: "+ram);
	System.out.println("Ram: "+Phone.ram);
	
	System.out.println("Front Camera Resolution: "+frontCameraResolution);
	System.out.println("Front Camera Resolution: "+Phone.frontCameraResolution);
	
  }
}