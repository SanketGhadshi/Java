package If_IfElse_IfElseif;

public class If_ElseIf {

	public static void main(String[] args) {
      
		int marks=50;
		
		if(marks < 50 )
		{
			System.out.println("fail");
		}
		else if(marks>=50 && marks<60  )
		{
			System.out.println("D Grade");
		}
		else if(marks>=60 && marks<70  )
		{
			System.out.println("C Grade");
		}
		else if(marks>=70 && marks<80  )
		{
			System.out.println("B Grade");
		}
		else if(marks>=80 && marks<100  )
		{
			System.out.println("A Grade");
		}
		else
		{
			System.out.println("Invalid number is enter");
		}
	}

}
