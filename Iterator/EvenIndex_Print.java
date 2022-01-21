package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EvenIndex_Print {

	public static void main(String[] args) {
		List list=new ArrayList();
		for(int i=0; i<=10; i++)
		{
			list.add(i);
		}
System.out.println("List :-"+list);

Iterator itr=list.iterator();
while(itr.hasNext())
{
	Integer i=(Integer)itr.next();
	if(i%2==0) {
		System.out.print(i+" ");
	}else
	{
		itr.remove();
	}
}
	}

}
