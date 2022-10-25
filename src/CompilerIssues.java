public class CompilerIssues { //Compiles

   public static void main(String[] args) { //Compiles

      GenericTwople<String, Integer> p1; //Does Not Compile because there are no variables or anything just the types
      GenericTwople<String, Number> p2; //Does Not Compile because there are no variables or anything just the types
      GenericTwople<Object, Object> p3; //Does Not Compile because there are no variables or anything just the types
      GenericTwople<?, ?> p4; //Does Not Compile for the same reason basically: There shouldnt be any variables or type parameters or anything
      GenericTwople<?, ? extends Number> p5; //Does Not Compile: same thing again

      p1 = new GenericTwople<String, Integer>("A", 7); //Does Not Compile: no type parameters again
      int a = p1.getSecond(); //Does Not Compile: needs to be casted to int because its an object right now

      p1 = new GenericTwople<Integer, Double>(23, 12.0); //Does Not Compile: Shouldn't have type parameters

      p2 = new GenericTwople<String, Integer>("B", 8); //Does Not Compile: Shouldn't have type parameters

      p3 = new GenericTwople<String, Integer>("C", 9); //Does Not Compile: Shouldn't have type parameters

      p4 = new GenericTwople<String, String>("House", "Car"); //Does Not Compile: Shouldn't have type parameters
      p4 = new GenericTwople<String, Integer>("D", 10); //Does Not Compile: Shouldn't have type parameters

      Integer b = p4.getSecond(); //Does Not Compile: needs to be cast to Integer
      Integer c = (Integer) p4.getSecond(); //Compiles

      p5 = new GenericTwople<String, String>("E", "G"); //Does Not Compile: Shouldn't have type parameters
      p5 = new GenericTwople<String, Double>("E", 11.0); //Does Not Compile: Shouldn't have type parameters
      p5 = new GenericTwople<String, Integer>("E", 11); //Does Not Compile: Shouldn't have type parameters

      Integer d = p4.getSecond(); //Does Not Compile: needs to be cast to Integer
      Integer e = (Integer) p4.getSecond(); //Compiles
   }

}