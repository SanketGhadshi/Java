package Method;

public class StaticMethodWithSameMethodName {

	public static void main(String[] args) {
		System.out.println(" Main Method");
		testArray(3.4f);
		testArray();	

	}
      public static void testArray(float f) {
    	  int r=100;
    	  System.out.println(r);
    	  System.out.println("Static method 1 with argument");
      }
      public static void testArray() {
    	  int r=200;
    	  System.out.println(r);
    	  System.out.println("Static method 2 with argument");
      }
}
