package Interface;

public class Interface_Two implements InterfaceAICTE, Interface_One{

	public static void main(String[] args) {
		Interface_Two c=new Interface_Two();
      c.exam();
      c.audit();
     
      c.method2();
	}

	@Override
	public void exam() {
	
		System.out.println("InterfaceAICTE method exam");
	}

	@Override
	public void audit() {

		System.out.println("InterfaceAICTE method audit");
	}

	@Override
	/*public void method1() {

		System.out.println("Interface2 method1");
	}*/

		public void method2() {
		
		System.out.println("Interface2 method2");
	}

}

