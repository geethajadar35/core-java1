class Cafe {

//static String cafeName="craze warm cafe";
static String  teaNames[]={"green Tea","ginger tea","black Tea","lemon tea","amruth cha","elachi cha","masala chah","white tea","shonti cha","cadmoan tea"};
static String coffeNames[]={"bold and rich","creamy","soft and milky","mocha","espresso","cappuccino","latte","americano"};
static String snackNames[]={"french fries","mini bugers","cheese toast","muffins","pastries","cupcake","croissants","garlic bread","nachos","cokkies"};
public static void main(String[] cafe)


{
	String cafeName ="craze warm cafe";
	System.out.println("the cafe names is:" +cafeName);
	
 getteaNames();
 getcoffeNames();
 getsnackNames();
 //String cafeName="craze warm cafe";

//String  teaNames[]={"green Tea","ginger tea","black Tea","lemon tea","amruth cha","elachi cha","masala chah","white tea","shonti cha","cadmoan tea"};
 //String coffes[]={"bold and rich","creamy","soft and milky","mocha","espresso","cappuccino","latte","americano"};
//String snacks[]={"french fries","mini bugers","cheese toast","muffins","pastries","cupcake","croissants","garlic bread","nachos","cokkies"};
// long noOfteaNames=teaNames.length;
// System.out.println("teaNames are:"+noOfteaNames);
// int noOfcoffes=coffes.length;
// int noOfsnacks=snacks.length;
// System.out.println("coffes are:"+noOfcoffes);
// System.out.println("snacks are:"+noOfsnacks);
// System.out.println("list of teaNames are:");
// System.out.println(teaNames[0]+"\n"+
                   // teaNames[1]+"\n"+
                   // teaNames[2]+"\n"+
				   // teaNames[3]+"\n"+
				   // teaNames[4]+"\n"+
				   // teaNames[5]+"\n"+
				   // teaNames[6]+"\n"+
				   // teaNames[7]+"\n "+
				   // teaNames[8]+"\n");
				  
				   
				   
// System.out.println("list of coffes names are:");
// System.out.println(coffes[0]+"\n"+
				   // coffes[1]+"\n"+
                   // coffes[2]+"\n"+
				   // coffes[3]+"\n"+
	               // coffes[4]+"\n"+
                   // coffes[5]+"\n"+
				   // coffes[6]+"\n"+
				   // coffes[7]+"\n");
				  
// System.out.println("list of snacks names are:");
// System.out.println(snacks[0]+"\n"+
				   // snacks[1]+"\n"+
				   // snacks[2]+"\n"+
				   // snacks[3]+"\n"+
				   // snacks[4]+"\n"+
				   // snacks[5]+"\n"+
				   // snacks[6]+"\n"+
				   // snacks[7]+"\n"+
				   // snacks[8]+"\n"+
				   // snacks[9]+"\n");	*


}

//method declration
static void getteaNames(){
	System.out.println("the available tea are:");
	for(String teaName:teaNames)
		System.out.println(teaName);
}
static void getcoffesNames(){
	System.out.println("the available coffes are:");
	for(String coffeName:coffeNames)
		System.out.println(coffeName);

}
static void snackNames(){
	System.out.println("the available coffes are:");
	for(String snackName:snackNames)
		System.out.println(snackName);

}


}

