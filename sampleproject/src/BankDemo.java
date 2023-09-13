
public class BankDemo {

	public static void main(String[] args) {
		
		Bank b;
		
		b=new AXIS();
		b.checkBalance();
		b.moneyTrancefer();
		
		b=new HDFC();
		b.checkBalance();
		b.moneyTrancefer();
		
	}

}
