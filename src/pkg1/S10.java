//Use of static block 2
package pkg1;

import java.util.ArrayList;
import java.util.List;

public class S10 {
	static List<Integer> list1;
	static void printList1() {
		list1.add(2);
		list1.add(4);
		list1.add(6);
		System.out.println(list1);
	}
	static{
		list1=new ArrayList<>();
		list1.add(1);
		list1.add(3);
		list1.add(5);
	}
	static{
		list1.add(10);
		list1.add(20);
		list1.add(30);
	}

	public static void main(String[] args) {
		printList1();
		
	}

}
