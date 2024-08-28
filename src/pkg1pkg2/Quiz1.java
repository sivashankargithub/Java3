package pkg1pkg2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) throws FileNotFoundException{
		List<String>list1 = new ArrayList<>();
		List<String>list2 = new ArrayList<>();
		List<Integer> marks = new ArrayList<>();
		int score=0;
		String question="";
		String answer="";
		String input1="";
		File f1 = new File("capitals.txt");
		Scanner sc1 = new Scanner(f1);
		Scanner sc2 = new Scanner(System.in);
		while(sc1.hasNext()) {
			String line1=sc1.nextLine();
			String[] arr1=line1.split(",");
			list1.add(arr1[0]);
			list2.add(arr1[1]);
		}
		sc1.close();
		for(int i=0;i<list1.size();i++) {
			question=list1.get(i);
			System.out.print(question+" : ");
			answer=list2.get(i);
			input1 = sc2.nextLine();
			if(input1.equalsIgnoreCase(answer)) {
				marks.add(10);
				score=score+10;
			}
			else {
				marks.add(0);
			}
		}
		sc2.close();
		
		System.out.println(score);

	}

}
