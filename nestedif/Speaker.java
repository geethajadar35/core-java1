class Speaker
{
    static int maxValue = 9;
    static int minValue;
    static int currentVolume;

    static boolean SpeakerOn;

    static void SpeakerOn(boolean status)
    {
        SpeakerOn = status;

        if(SpeakerOn)
        {
            System.out.println("The power is On");
        }
        else
        {
            System.out.println("The power is Off");
        }
    }

    static void increaseVolume()
    {
        if(SpeakerOn)
        {
            if(currentVolume < maxValue)
            {
                currentVolume++;
                System.out.println("Increased volume: " + currentVolume);
            }
            else
            {
                System.out.println("Reached maximum volume");
            }
        }
        else
        {
            System.out.println("The phone is Off");
        }
	}	
	static void decreaseVolume()
    {
        if(SpeakerOn)
        {
            if(currentVolume < minValue)
            {
                currentVolume--;
                System.out.println("decreasevolume: " + currentVolume);
            }
            else
            {
                System.out.println("Reached maximum volume");
            }
        }
        else
        {
            System.out.println("The phone is Off");
        }
    }
}