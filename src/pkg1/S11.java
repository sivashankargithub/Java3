//Use of static block 2
package pkg1;

class Bank2{
	
	public static int getInterest() {
		return 1;
	}
}
class SBI2 extends Bank2{
	public static int getInterest() {
		return 2;
	}
}

class ICICI2 extends Bank2{
	public static int getInterest() {
		return 4;
	}
}

class HDFC2 extends Bank2{
	public static int getInterest() {
		return 5;
	}
}
public class S11 {
	public static void main(String[] args) {
		SBI2 sbi2= new SBI2();
		System.out.println(sbi2.getInterest());
		ICICI2 icici2 = new ICICI2();
		System.out.println(icici2.getInterest());
	}

}
