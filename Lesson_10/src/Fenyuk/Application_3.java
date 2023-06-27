package Fenyuk;

import java.util.Scanner;

public class Application_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Будь ласка, введіть текст!");

		String s = sc.nextLine();
		
//      String s = "Hello, my name is Tanya, I learn Java.";

//		StringBuilder sb = new StringBuilder(s);
		
//		int number = 0;
//		
//		if(s.length() != 0 && s.length() > 0) {
//			number++;
		
//			for(int i = 0; i < s.length(); i++) {
//				if(/*(s.length() != 0 && s.length() > 0) & */
//						   (s.charAt(i) == ' ') 
//						|| (s.charAt(i) == ',') 
//						|| (s.charAt(i) == '.')) {
//					number++;
//				}
//			}
//		}
//		

		String[] word = s.split(" ");
		int number = 0;

		for (int i = 0; i < word.length; i++) {
			if (word[i].length() > 0) {
				number++;
			}
		}
		System.out.println("Ви ввели " + number + " слова");
		
	}

}
