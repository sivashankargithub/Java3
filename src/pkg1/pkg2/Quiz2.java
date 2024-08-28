package pkg1.pkg2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) throws FileNotFoundException{
		List<String>list1 = new ArrayList<>();
		List<String>list2 = new ArrayList<>();
		List<Integer> marks = new ArrayList<>();
		int score=0;
		String question="";
		String answer="";
		File f1 = new File("capitals.txt");
		Scanner sc1 = new Scanner(f1);
		Scanner sc2 = new Scanner(System.in);
		while(sc1.hasNext()) {
			String line1=sc1.nextLine();
			String[] arr1=line1.split(",");
			list1.add(arr1[0]);
			list2.add(arr1[1]);
		}
		question=list1.get(0);
		
		for(int i=0;i<10;i++) {
			System.out.print(list1.get(i)+" : ");
			answer = sc2.nextLine();
			if(answer.equalsIgnoreCase(list2.get(i))) {
				marks.add(10);
				score=score+10;
			}
			else {
				marks.add(0);
			}
		}
		
		
		System.out.println(score);

	}

}
