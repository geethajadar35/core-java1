class CarrierService
{
    public static void pickUpPackage()
    {
        System.out.println("Package picked up");
        HubRouter.sortToZipCode();
    }
}