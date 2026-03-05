class Bottle
{
	static String brand = "Tupperware";
	static String material="Fiber";
	static String color="Black";
	static String capacity="1.5 Pounds";
	public static void main(String[] args)
	{
		String brand = "Stanley";
		System.out.println("Brand:" +brand);
		System.out.println("Brand:" +Bottle.brand);
		
		String material="Stainless Steel";
		System.out.println("Material:" +material);
		System.out.println("Material:" +Bottle.material);
		
		String color="Hot Coral";
		System.out.println("Color:" +color);
		System.out.println("Color:" +Bottle.color);
		
		String capacity="2.5 Pounds";
		System.out.println("Capacity:" +capacity);
		System.out.println("Capacity:" +Bottle.capacity);
	}
}