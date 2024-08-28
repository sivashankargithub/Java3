//Static Block and Static Initializers
package pkg1;

import java.util.ArrayList;
import java.util.List;

public class S2 {
	private static List<String> list1;
	static int n1=1;
    S2(){
    	list1.add("five");
        list1.add("six");
    }
    public void printList(){
        System.out.println(list1);
    }
    static {
    	list1 = new ArrayList<>();
    	list1.add("one");
    	list1.add("two");
    	list1.add("three");
    	list1.add("four");
    }
    public static void main(String[] args){
    	S2 sb2 = new S2();
    	sb2.printList();
    	System.out.println(n1);
    	
    }
}
