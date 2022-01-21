package Casting;

	class ParentClass
	{
	String name;
	void method()
	{
	System.out.println("Method in Parent");
	}
	}
	class ChildClass extends ParentClass
	{
	int id;
	void method()
	{
	System.out.println("overrided Method");
	}
	void childmethod()
	{
	System.out.println("Child class method");
	}
	}
	public class UpCasting_DownCasting  {
		
	public static void main(String[] args) 
	{
	 ParentClass p=new ChildClass();  //Upcasting
	 p.name="hello";
	 System.out.println(p.name);
	 p.method();
	 //p.childmethod();
	 
	 ChildClass c=(ChildClass)p; //Downcasting
	 c.id=99;
	 System.out.println(c.id);
	 c.method();
	 c.name="java";
	}
	}
	
    




