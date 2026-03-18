public class BlueskyUserExecutor
{
    public static void main(String[] args)
    {
        BlueskyUser.logIn("user@gmail.com", "pass123");
        BlueskyUser.logIn(9876543210L, "pass456");
    }
}