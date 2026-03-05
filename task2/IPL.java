class IPL
{

static String IPL[]={
"Chennai Super Kings","Royal Challengers Bangalore","Mumbai Indians","Delhi Capitals",
"Punjab Kings","Lucknow Super Giants","Kolkata Knight Riders","Sunrisers Hyderabad",
"Gujarat Titans","Rajasthan Royals"
};

public static void main(String args[])
{
getIPL();
}

static void getIPL()
{
System.out.println("The IPL teams are:");
for(String team : IPL)
{
System.out.println(team);
}
}

}