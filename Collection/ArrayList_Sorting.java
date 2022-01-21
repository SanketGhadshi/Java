package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayList_Sorting {

	private static final Comparator List = null;

	public static void main(String[] args) {
		List<Integer> num=new ArrayList<Integer>();
		
		num.add(1);  num.add(31); num.add(2); num.add(20); num.add(40);
		System.out.println("List before sorting: "+num);
		System.out.println("List after sorting:... ");
		
		Collections.sort(num);
		for(Integer N:num) {
			System.out.print(N+" ");
		}
		
		
   
	}

}
