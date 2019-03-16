package programmingExam;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Did you study anything for the Exam: Y/N");
		String answer = sc.next();
		if(answer.equals("y")||answer.equals("Y")) {
			System.out.println("Congrats you're ready for the Exam");
		}else{
			System.out.println("Get in this web page: https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=1");
			System.out.println("Start solving some problems, once you're done then you'll be ready for the Exam");
		}

	}

}
