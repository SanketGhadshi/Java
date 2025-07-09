package Access_Modifier;

public class protectedAccessModifier1 {

	public static void main(String[] args) 
	{
		protectedAccessModifier p = new protectedAccessModifier();
        System.out.println(p.name);     //  Accessible: same package
        p.display();                    //  Accessible: same package
    }
}
	
