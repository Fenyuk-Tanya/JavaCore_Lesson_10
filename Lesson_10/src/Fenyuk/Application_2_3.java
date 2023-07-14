package Fenyuk;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application_2_3 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Input you line" + " :");
		
		String string = sc.nextLine();
		
		//String string = "Hello, my name is Tanya, I learn Java";
		
		System.out.println("" + string);
		
		String regex = "[aeiouyAEIOUY]";
		String replacement = "-";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(string);
		while(matcher.find()) {
			System.out.println(matcher.replaceAll(replacement));
		}

	}

}
