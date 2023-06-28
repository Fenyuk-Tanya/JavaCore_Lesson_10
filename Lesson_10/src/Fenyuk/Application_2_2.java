package Fenyuk;

import java.util.Scanner;

public class Application_2_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input you line" + " :");
		
		String s = sc.nextLine();
		
		//String s = "Hello, my name is Tanya, I learn Java";
		
		System.out.println("" + s);
		
		//I create an object to call the function replace_s
		
		Application_2_2 object = new Application_2_2();
		
		object.replace_s(s);

	}
	
	//Here I created a function so as to replace the string
	
	public static void replace_s(String s1) {
		char[] vowels = {'a','e','i','o','u','y','A','E','I','O','U','Y'};
		//I added the list of vowels and caps
		//Now I will add a loop to check for vowels and change it to hash
		for (char vow:vowels) {
			s1 = s1.replace(vow, '-');
		}
		//Now I will output the given string 
		System.out.println("Converted String : " + s1);
	}

}
