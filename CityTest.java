/**
*
* Tests BST operations
*
* Run with:
*    $ java CityTest < input_file_name
*/
import java.util.Scanner;
public class CityTest {
   public static void main (String[] args) {
     BST<CityKey, City> cityBST = new BST<CityKey, City>();
     Scanner sc = new Scanner(System.in);
     long start = System.nanoTime();
      while (sc.hasNextLine()) {
          String line = sc.nextLine();
          String[] fields = line.split(",");
          String myName = fields[0].trim();
          String myState = fields[1].trim();
          double myLat = Double.parseDouble(fields[2].trim());
          double myLon = Double.parseDouble(fields[3].trim());
          int myPop = Integer.parseInt(fields[4].trim());
          CityKey myKey = new CityKey(myName, myState);
          City myCity = new City(myName, myState, myLat, myLon, myPop);
          cityBST.insert(myKey, myCity);
      }
      sc.close();
      long end = System.nanoTime();      
      System.out.println("Elapsed Time in nanoseconds: " + (end-start));
      
      
      
      
      
      
   }
}
/*GitHub repo https://github.com/ibsatassew/Binary-Search-Trees-BSTs- */
