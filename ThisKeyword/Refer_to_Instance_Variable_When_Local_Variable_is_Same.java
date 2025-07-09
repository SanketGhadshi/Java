package ThisKeyword;

public class Refer_to_Instance_Variable_When_Local_Variable_is_Same {
    
	String name;

    public Refer_to_Instance_Variable_When_Local_Variable_is_Same(String name) 
    {
    	this.name = name;  // 'this.name' refers to the instance variable, 'name' refers to constructor parameter
    }

    public void showName() 
    {
    	String name="LocalVar";
    	
    	System.out.println(name);
        System.out.println("Employee name is: " + this.name);
    }

    public static void main(String[] args) 
    {
    	Refer_to_Instance_Variable_When_Local_Variable_is_Same emp = 
    			new Refer_to_Instance_Variable_When_Local_Variable_is_Same("Sanket");
        
    	emp.showName();
    }
}