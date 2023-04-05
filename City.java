/**
*
* City database record definition
*
*/
public class City {
   private String name;
   private String state;
   private double latitude;
   private double longitude;
   private int population;

   public City(String n, String s, double lat, double lon, int pop) {
      name = n;
      state = s;
      latitude = lat;
      longitude = lon;
      population = pop;
   }

   public String getName() { return name; }
   public String getState() { return state; }
   public double getLat() { return latitude; }
   public double getLon() { return longitude; }
   public int getPop() { return population; }
   
   public String toString() {
      return name + " " + state + " " + latitude + " " + longitude + " " + population;
   }
}
