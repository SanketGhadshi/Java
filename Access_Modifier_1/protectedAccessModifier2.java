package Access_Modifier_1;

import Access_Modifier.protectedAccessModifier;

public class protectedAccessModifier2 extends protectedAccessModifier 
	{
	    public void show() 
	    {
	        System.out.println(name);   //  Accessible: inherited in subclass
	        display();                  //  Accessible: inherited in subclass
	    }
	    
	    public static void main(String[] args) {
	    	
	    	protectedAccessModifier2 p2=new protectedAccessModifier2();
	    	p2.show();
	    }
	}

