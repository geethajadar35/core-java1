class District 
{
    public static void run() 
	{
        System.out.println("District administration running");
        taxing();
    }
	public static void taxing() 
	{
        System.out.println("Taxing process started");
        measure();
    }
	public static void measure() 
	{
        System.out.println("Measuring resources");
        collect();
    }

    public static void collect() 
	{
        System.out.println("Collecting revenue");
        revenue();
    }

    public static void revenue() 
	{
        System.out.println("Revenue calculated");
        budget();
    }

    public static void budget() 
	{
        System.out.println("Budget prepared");
    }
}

