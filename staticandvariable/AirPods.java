class AirPods{
	static	String brand = "JBL";
    static  String model = "AirPods";
    static  String color = "Black";
    static  int batteryLife = 42;     
    static  int warranty = 12;       
    static  double price = 1499.0;  
    static  long productId = 12345678901L;
    static  boolean isAvailable = true;

    public static void main(String[] args) 
	{

        String brand = "Bolt";
        String model = "AirPods";
        String color = "White";
        int batteryLife = 62;     
		int warranty = 32;       
        double price = 7899.0;  
        long productId = 76545678901L;
        boolean isAvailable = false;

        System.out.println("Brand: " + brand);
		System.out.println("Brand: " + AirPods.brand);
        System.out.println("Model: " + model);
		System.out.println("Model: " + AirPods.model);
        System.out.println("Color: " + color);
		System.out.println("Color: " + AirPods.color);
        System.out.println("Battery Life: " + batteryLife);
		System.out.println("Battery Life: " + AirPods.batteryLife);
        System.out.println("Warranty: " + warranty);
		System.out.println("Warranty: " + AirPods.warranty);
        System.out.println("Price: " + price);
		System.out.println("Price: " + AirPods.price);
        System.out.println("Product ID: " + productId);
		System.out.println("Product ID: " + AirPods.productId);
        System.out.println("Available: " + isAvailable);
		System.out.println("Available: " + AirPods.isAvailable);
    }
}