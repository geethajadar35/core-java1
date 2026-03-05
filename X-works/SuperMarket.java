class SuperMarket
{
	public static String[] SearchBrandByProduct(String[] args)
	{
		if(productName=="biscuits")
		{
			String biscuitBrands[]={"oreo","parlege","margigold","marilight","sunfeast","jim jam","mommagic","good day","rusk","burbon"};
			return biscuitBrands;
		}
		if (productName=="shampoo")
			{
			String shampooBrand[]={"chik","clink","treseme","dove","lorealparis","vedix","head and sholder","cool","karthika");
			return shampooBrand;
			}
		
	}
}
// String biscuitBrands[]=SearchBrandByProduct("biscuits")
// for(String biscuitBrand:biscuitBrands)
// {
	// System.out.println(biscuitBrand);
// }

// String shampooBrand[]=searchBrandByProduct("shampoo")
// for(String  shampooBrand:shampooBrands)
// {
	// System.out.println(shampooBrand);
// }
