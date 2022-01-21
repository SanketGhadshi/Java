package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Methods {

	public static void main(String[] args) {
	  
		List <String> cars = new ArrayList<String>(); //ArrayList Syntax
	   List vehicle=new ArrayList();
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add(" ");
	    cars.add("Mazda");
	    System.out.println(cars);
	    cars.add("Maruti");
	    cars.add("Volvo");  //ArrayList allowed multiple duplicate data 
	    cars.add(" ");      //ArrayList allowed multiple duplicate NULL data
	    
	    System.out.println("1) Updated string:-\n"+cars);
	    
	    cars.contains("Maruti");  // Return True or False if data present in string or List
	    System.out.println("2) cars.contains(object)\n"+cars);
	    
	    cars.containsAll(vehicle);
	    System.out.println("3) cars.containsAll(vehicle):-\n"+cars.containsAll(vehicle));
	    
	    cars.add(0, "Mahindra");  //Add new data at any index
	    System.out.println("4) Add data to specified index:-\n"+cars);
	    
	    cars.addAll(vehicle);       //true if this list changed as a result of the call
	    System.out.println("5) cars.addAll(cars):-\n"+cars);
	    
	    cars.addAll(3, cars); //After mentioned index join string
	    System.out.println("6) cars.addAll(3, cars):-\n"+cars);
	    
	    cars.equals(vehicle);  //campare two string and if it same then return 'true' otherwise false
	    System.out.println("7) cars.equals(Volvo):-\n"+cars.equals("Volvo"));
	    
	  //accessing the element    
	   System.out.println("cars.get(1): "+cars.get(1));//it will return the 2nd element, because index starts from 0  
	  
	   //changing the element  
	   cars.set(1,"MAT");  //Change element at mentioned index
	   System.out.println("cars.set(1,Dates): "+cars);  
	    
	   
	  }
}
