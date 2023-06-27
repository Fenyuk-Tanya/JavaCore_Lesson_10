package Fenyuk;

import java.util.Scanner;

public class Application_1 {

	public static void main(String[] args) throws Exception {
		
		 System.out.println("Введіть слово з 5 букв.");
		 
		 Scanner sc = new Scanner(System.in);
		 
		 String s = sc.nextLine();
		 
		 StringBuilder sb = new StringBuilder(s);
		 
	     /*(s.indexOf(0) == s.lastIndexOf(4)) && (s.indexOf(1) == s.lastIndexOf(3))*/
		 
		 if (s.length() == 5) {
				if(s.toUpperCase().equals(sb.reverse().toString().toUpperCase())){
					System.out.println("Слово " + s + " є паліндромом.");
				}else {
					System.out.println("Введене слово " + s + " не є паліндромом");
				}
		 }
		 else {
				Exception e = new Exception("Введене слово "+ s + " не є коректним. " + "Його довжина = " + s.length() + " !");
				System.err.println(e);
		 }
		

	}

}
