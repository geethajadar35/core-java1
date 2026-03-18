class Letterboxda
{
    static void reviewMovie(String user)
    {
        System.out.println("Reviewing movie:");
        System.out.println(user);
    }

    static void reviewMovie(String user,String movie,int rating)
    {
        System.out.println("User: " + user);
        System.out.println("Movie: " + movie);
        System.out.println("Rating: " + rating);
    }
}

