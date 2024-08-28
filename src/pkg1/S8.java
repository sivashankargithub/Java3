//Usage of Super Keyword.
package pkg1;

class Bank1{
	int getInterest() {
		System.out.println("Parent");
		return 0;
	}
}
class ICICI1 extends Bank1 {
	
	int getInterest() {
		int n1 = super.getInterest();
		System.out.println(n1);
		return 4;
	}
}
class SBI1 extends Bank1{
	int getInterest() {
		return 5;
	}
}

public class S8 {

	public static void main(String[] args) {
		Bank1 bank1 =  new Bank1();
		ICICI1 icici1 = new ICICI1();
		int n2 = icici1.getInterest();
		System.out.println(n2);

	}

}
