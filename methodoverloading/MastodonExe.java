class MastodonExe
{
    public static void main(String[] args)
    {
        Mastodon.postToot("Ravi");
        Mastodon.postToot("Ravi,Sita",300,60);
    }
}