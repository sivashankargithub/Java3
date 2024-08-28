package pkg1;

import java.util.ArrayList;
import java.util.List;

public class StaticBlock2 {
	
	private static List<String> list1;
	static int n1=1;
	
    StaticBlock2(){
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
    	StaticBlock2 sb2 = new StaticBlock2();
    	sb2.printList();
    	System.out.println(n1);
        
        // Calling of the static block
        // Nothing to do here as it is called
        // automatically as class is loaded in memory
        
    }
}
