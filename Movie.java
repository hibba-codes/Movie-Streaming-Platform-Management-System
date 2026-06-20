class Movie extends Content
{
    int ticketsSold;
    double ticketPrice;
    public Movie(String title, int id, int duration, double rating, int ticketsSold, double ticketPrice)
    {
        super(title, id, duration, rating);
        this.ticketsSold = ticketsSold;
        this.ticketPrice = ticketPrice;
    }
    public void calculate_Revenue()
    {
        double revenue = ticketsSold * ticketPrice;

        System.out.println("Tickets Sold : " + ticketsSold);
        System.out.println("Ticket Price : " + ticketPrice);
        System.out.println("Movie total Revenue : " + revenue);
        if(revenue > 100000)
        {
            System.out.println("Movie Popularity : Block Buster Movie");
        }
        else
        {
            System.out.println("Movie Popularity : Normal Movie");
        }

    }
    public double getRevenue()
    {
        return  ticketsSold * ticketPrice;
    }

}
