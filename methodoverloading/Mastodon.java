class Mastodon
{
    static void postToot(String user)
    {
        System.out.println("Posting toot:");
        System.out.println(user);
    }

    static void postToot(String user,int likes,int boosts)
    {
        System.out.println("User: " + user);
        System.out.println("Likes: " + likes);
        System.out.println("Boosts: " + boosts);
    }
}

