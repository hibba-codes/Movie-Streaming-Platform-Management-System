abstract class Content
{
    private String title;
    private int id;
    private int duration;
    private double rating;
    public Content(String title, int id, int duration, double rating)
    {
        this.title = title;
        this.id = id;
        this.duration = duration;
        this.rating = rating;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public String getTitle()
    {
        return title;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }
    public void setDuration(int duration)
    {
        this.duration = duration;
    }
    public int getDuration()
    {
        return duration;
    }
    public void setRating(double rating)
    {
        this.rating = rating;
    }
    public double getRating()
    {
        return rating;
    }
    public void showInfo()
    {
        System.out.println("Title : " + title);
        System.out.println("ID : " + id);
        System.out.println("Duration : " + duration + " Hours");
        System.out.println("Rating : " + rating);
    }
    public abstract void calculate_Revenue();
    public abstract double getRevenue();
}
