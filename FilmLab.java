public class Filmst
{
  public static void main(String [] args)
  {
    
    Film[] watch = new Film[4];
    
    watch[0] = new Film("Shrek", 133, "PG");
    watch[1] = new Film("Road to Perdition", 117, "G");
    watch[2] = new Film("The Truth about Cats and Dogs", 03, "PG");
    watch[3] = new Film("Enigma", 114, "G");
    
    for(int i = 0; i < watch.length; i++)
    {
     	watch[i].setLength(10);
    }
    
    // Practice advanced loop
    
    for(Film mov: watch)
    {
      mov.display();
      System.out.println("\t\t");
    }
    
    // 100 Point
    Film shortestFilm = new Film("Cats", 5, "G");
    watch[2] = shortestFilm;
    System.out.print("Shortest Film is: \n");
    shortestFilm.display();
  }
}


class Film
{
  String title;
  int length;
  String rating;
  
  String runitbackrating = watch[0].rating;
  String runitbackname = watch[0].title;
  int runitback = watch[0].length;
  
  public Film (String sname, int min, String r)
  {
    title = sname;
    length = min;
    rating = r;
    runitback();
  }
  public void display()
  {
  	System.out.println("Title of Movie: " + title + "\nLength: " + length + "\nRating: " + rating);
  }
  public int getLength()
  {
    return length;
  }
  public void setLength(int len)
  {
    length = ((int)((double)length * (len/100.0))) + length;
  }
  public void runitback()
  {
    if(length < runitback)
    {
      runitback = length;
      runitbacknane = name;
      runitbackrating = rating;
    }
  }
  pubic void shortestFilm()
  {
    System.out.println("Shortest Film:\n Name: " + runitbackname + "\nLength: " + runitback + "\nRating: " + rating); 
  }

}
