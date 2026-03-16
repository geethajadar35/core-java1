class InventoryCheck
{
	public static void validate()
	{
		System.out.println("checking available products:");
		Warehouse.fetchFromAisle();
	}
}	