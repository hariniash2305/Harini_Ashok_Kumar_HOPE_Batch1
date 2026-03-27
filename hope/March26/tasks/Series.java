class Content {
    String title;
    int year;
    public Content(String title, int year){
        this.title = title;
        this.year = year;
    }
    void display(){
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
    }
}
class Series extends Content{
    int seasons;
    Series(String title, int year, int seasons){
        super(title, year);
        this.seasons = seasons;
    }
    void display(){
        super.display();
        System.out.println("Seasons: " + seasons);
    }
}
public class Series{
    public static void main(String[] args){
        Series s1=new Series("The Summer I Turned Pretty",2022,2);
        Series s2=new Series("Squid Game",2021,3);
        System.out.println("Series 1 ~");
        s1.display();
        System.out.println();
        System.out.println("Series 2 ~");
        s2.display();
    }
}