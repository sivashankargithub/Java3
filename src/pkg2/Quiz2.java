package pkg2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) throws FileNotFoundException{
		List<TestShuffle> list1 = new ArrayList<>();
		List<TestShuffle> list2 = new ArrayList<>();
		int score = 0;
		String question = "";
		String answer = "";
		String input1 = "";
		File f1 = new File("capitals.txt");
		Scanner sc1 = new Scanner(f1);
		Scanner sc2 = new Scanner(System.in);
		while(sc1.hasNext()) {
			String line1=sc1.nextLine();
			String[] arr1=line1.split(",");
			list1.add(new TestShuffle(arr1[0], arr1[1]));
		}
		sc1.close();
		Collections.shuffle(list1);
		
		for(int i=0;i<10;i++) {
			question=list1.get(i).getQuestion();
			System.out.print(question+" : ");
			answer = list1.get(i).getAnswer(); 
			input1 = sc2.nextLine();
			if(input1.equalsIgnoreCase(answer)) {
				score=score+10;
			}
			else {
				question=list1.get(i).getQuestion();
				answer = list1.get(i).getAnswer();
				list2.add(new TestShuffle(question, answer));
			}
		}
		sc2.close();
		System.out.println("your score is "+score+" out of "+list1.size()*10);
		
		System.out.println("----Wrong Answers you Entered----");
		for(int i=0;i<list2.size();i++) {
			question=list2.get(i).getQuestion();
			answer = list2.get(i).getAnswer();
			System.out.println(question+" : "+answer);
		}
	}
}
