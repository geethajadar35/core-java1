public class BeRealUserExecutor
{
    public static void main(String[] args)
    {
        BeRealUser.logIn("user@gmail.com", "pass123");
        BeRealUser.logIn(9876543210L, "pass456");
    }
}