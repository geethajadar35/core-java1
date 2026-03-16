class OrderSystem
{
    public static void takeOrder()
    {
        System.out.println("Order received from customer");
        InventoryCheck.validate();
    }
}