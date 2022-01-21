package Super_keyword;

public class Parent {
	int a=10;
	
    void ab() {       // only access in Super_Class
		System.out.println("ab(Super_Class) "+a);
	}
	public void ac() {  
		System.out.println("ac(Super_Class) "+a);
	}
	Parent(int m){
		
		System.out.println("Super_Class() constructor");
	}	
}
