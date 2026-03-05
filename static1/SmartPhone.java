class SmartPhone 
{
    static String brand;
	static String simSlots;
	static String color;																																							
	static int storageCapacity;
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
	
	System.out.println("Brand: "+SmartPhone.brand);
	System.out.println("SimSlots is: "+SmartPhone.simSlots);
	System.out.println("Color: "+SmartPhone.color);
	System.out.println("Mobile StorageCapacity: "+SmartPhone.storageCapacity);
	System.out.println("Screen Size: "+SmartPhone.screenSize);
	System.out.println("Ram: "+ram);
	System.out.println("Front Camera Resolution: "+SmartPhone.frontCameraResolution);
	
  }
}