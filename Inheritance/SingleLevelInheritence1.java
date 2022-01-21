package Inheritance;

public class SingleLevelInheritence1 {
	
	//SBI extends BankingFeature

	public static void main(String[] args) {
		
		
		SBI.otherAtmMachine();
		
		SBI ad=new SBI();
		ad.Account();
		ad.AtmMachine();
		
		ad.otherAccount();
		
/*		BankingFeature obj=new SBI();
		obj.Account();
		obj.otherAccount();    */
		
	//	SBI obj2=new BankingFeature();
		
	}

}
