class Series extends Content
{
    int episodes;
    int subscribers;

    public Series(String title, int id, int duration, double rating, int episodes, int subscribers)
    {
        super(title, id, duration, rating);
        this.episodes = episodes;
        this.subscribers = subscribers;
    }

    public void calculate_Revenue()
    {

        double revenue = subscribers * 50;
        System.out.println("Total Episodes : " + episodes);
        System.out.println("Subscribers : " + subscribers);
        System.out.println("Series Revenue : " + revenue);
        if(episodes > 20)
        {
            System.out.println("Series Types : Long series");
        }
        else
        {
            System.out.println("Series Types : Short Series");
        }
    }
    public double getRevenue()
    {
        return subscribers * 50;
    }

}
