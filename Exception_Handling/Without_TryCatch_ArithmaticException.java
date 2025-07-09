package Exception_Handling;

public class Without_TryCatch_ArithmaticException {
	
	int a=7;
	int b=0;
	
	int c=a/b;
	
	public void getData()
	{
		System.out.println(c);
	}

	public static void main(String[] args) {
	
		Without_TryCatch_ArithmaticException exp = new Without_TryCatch_ArithmaticException();
		exp.getData();

	}

}
