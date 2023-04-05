/**
*  Search key definition for the city records
*/
public class CityKey implements Comparable<CityKey> {
   private String name; // name of the city
   private String state; // abbreviation for state

   public CityKey(String n, String s) {
      name = n;
      state = s;
   }

   public String getName() { return name; }
   public String getState() { return state; }

   /**
    * @return 0 if this key is equal to the other key
    *         < if this key is less than the other key
    *         > 0 if this key is greater than the other key
   */
   public int compareTo(CityKey other) {
     if(other.getName().compareTo(name)==0){
       if(other.getState().compareTo(state)<0){
         return 1;
       }
       else if(other.getState().compareTo(state)>0){
         return -1;
       }
     }
     else if(other.getName().compareTo(name)>0){
       return -1;
     }
     else if(other.getName().compareTo(name)<0){
       return 1;
     }
      // Complete this method
      return 0;
   }
}
