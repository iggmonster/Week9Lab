/**
 * Immutable 2-tuple type.
 */
public class GenericTwople {

   private final Object first;
   private final Object second;

   /**
    * Create an KeyValuePair with the provided objects.
    *
    * @param first The first object.
    * @param second The second object.
    */
   public GenericTwople(Object first, Object second ) {
      this.first = first;
      this.second = second;
   }

   /**
    * @return the first
    */
   public Object getFirst() {
      return first;
   }

   /**
    * @return the second
    */
   public Object getSecond() {
      return second;
   }

   /**
    * @return Stringified representation of the KeyValuePair instance
    */
   @Override
   public String toString() {
      return "<" + first.toString() +
           ", " + second.toString() + ">";
   }

}