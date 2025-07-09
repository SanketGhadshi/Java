package ThisKeyword;

public class CurrentClass_InstanceVariable {
	
	int rollno=1;
	String name="sabv";
	float fee=1.4f;
	
	CurrentClass_InstanceVariable (int rollno,String name,float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
		System.out.println("Calling CurrentClass_InstanceVariable variable : "+rollno+" , "+name+" , "+fee);
	}

	void display() {
	int rollno=10;
	//System.out.println(this.rollno);
	System.out.println(rollno+" "+name+" "+fee);
	System.out.println(this.rollno+" "+this.name+" "+this.fee);
}
	public static void main(String[] args) {
	 
		CurrentClass_InstanceVariable obj=new CurrentClass_InstanceVariable(100,"san",500f);
        obj.display();
	}
}
