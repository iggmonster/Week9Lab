/**
 * Test driver for the ObjectPair class.
 */
public class GenericDriver {

   /**
    * Create several stadium associations,
    * then print the name of the stadium
    * with the largest capacity.
    *
    * @param args Not used.
    */
   public static void main(String[] args) {

      GenericMap stadiums = new GenericMap();
      stadiums.put("Bridgeforth Stadium", 25000);
      stadiums.put("Michigan Stadium", 109901);
      stadiums.put("Lane Stadium", 66233);

      System.out.println("Bridgeforth Stadium: " +
           stadiums.get( "Bridgeforth Stadium" ));

      String largestStadium = largestStadium( stadiums );
      System.out.println(largestStadium + ": " +
           stadiums.get( largestStadium ));
   }

   /**
    * Returns the name of the stadium with the largest capacity.
    *
    * @param stadiumsMap A map of GenericTwoples where each Twople
    *                    contains a stadium name followed by an
    *                    integer capacity
    * @return The name of the stadium with the largest capacity
    */
   public static String largestStadium( GenericMap stadiumsMap ) {

      Object obj[] = stadiumsMap.keySet().toArray();
      //System.out.println(Arrays.toString(obj));
      String largest = (String) obj[0];

      //System.out.println(stadiumsMap.get(largest));

      for (int i = 1; i < obj.length; i++){
         if ((int) stadiumsMap.get(obj[i]) > (int) stadiumsMap.get(largest)){
            largest = (String) obj[i];
         }
      }

      return largest;
   }

}
