package Fenyuk;

import java.util.Scanner;

public class Application_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input you line" + " :");
		
		String s = sc.nextLine();
		
		//String s = "Hello, my name is Tanya, I learn Java";
		
		System.out.println(s.replace("a", "-")
				            .replace("o", "-")
				            .replace("i", "-")
				            .replace("u", "-")
				            .replace("y", "-")
				            .replace("e", "-")
				            .replace("A", "-")
				            .replace("O", "-")
				            .replace("I", "-")
				            .replace("E", "-")
				            .replace("U", "-")
				            .replace("Y", "-"));	
	}

}
