public class Main
{
    public static void main(String[] args)
    {
        double totalRevenue = 0;
        double highestRevenue = 0;
        String topContent = "";
        Content[] contents = new Content[5];
        contents[0] = new Movie("Iron Man", 101, 3, 7.5, 500, 3000);
        contents[1] = new Series("Diriliş: Ertuğrul", 375, 50, 9.9, 26, 10000);
        contents[2] = new Movie("KGF 2", 234, 3, 7.5, 300, 2000);
        contents[3] = new Series("Kuruluş: Osman", 104, 58, 8.5, 27, 7000);
        contents[4] = new Movie("3 Idiots", 294, 2, 6.5, 150, 2000);
        System.out.println("\n========Movie Streaming Platform Management System========\n");
        for(int i = 0; i < contents.length; i ++)
        {
            contents[i].showInfo();
            contents[i].calculate_Revenue();
            if(contents[i].getRevenue() > highestRevenue)
            {
                highestRevenue = contents[i].getRevenue();
                topContent = contents[i].getTitle();
            }
            totalRevenue += contents[i].getRevenue();
            System.out.println("------------------------------------------");
        }
        System.out.println("Total Platform Revenue = " + totalRevenue);
        System.out.println("Top Earning Content : " + topContent);
        System.out.println("Revenue : " + highestRevenue);
        System.out.println("------------------------------------------");
    }
}
