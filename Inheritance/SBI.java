package Inheritance;

public class SBI extends BankingFeature {
	
	public void AtmMachine() {
		
		System.out.println("AtmMachine method in SBI class ");
	}
	public static void otherAtmMachine() {
		
		System.out.println("otherAtmMachine() method in SBI class");
	}

	public static void main(String[] args) {
		
	    otherAccount();
		otherAtmMachine();
		
		SBI ad=new SBI();
		ad.Account();
		ad.AtmMachine();
		
	
		
/*		BankingFeature obj=new SBI();
		obj.Account();
		obj.otherAccount();    */
		
	//	SBI obj2=new BankingFeature();
		
	}
}