package code;
 import java.util.Scanner;

public class Stringmethods {
	public static void main(String[] args) {
		String s1 = "Java Program";
		//1.length
		//System.out.println(s1.length());
		//2.equals() ---->it will accept only when the data is correct
		//3.equalsIgnoreCase ----->it will give the output success even it is in uppercase it will only see whether the data is correct)
		Scanner sc  = new Scanner(System.in);
		
	/*	System.out.println("Enter username: ");
		String username  = sc.nextLine();
		
		System.out.println("Enter password: ");
		String password  = sc.next();
		
		if(username.equals("admin") && password.equals("admin@123")) {
			System.out.println("Success");
		}else {
			System.out.println("Error 404 Found");
		}
*/
		//== equal method ----->whether it is true or false 
		
	//	String s4 = "Divu";
	//String s5 = "Divu";
		
	//	System.out.println(s4==s5);
		
		String name =  new String("Divya");
		String name1 = new String("Divya");
		System.out.println(name==name1);
		
		                                                                                                                                                                                                                             
		
		
		
		//compareTo
		//s1>s2--->positive number
		//s1<s2--->negative number
		//s1==s2---> 0
		
		String s6 = "hello";
		String s7 = "Hello";
		
		System.out.println(s6.compareTo(s7));
	
		//concat()
		
		String str1 = "Static";
		String str2 =  new String("Program");
		System.out.println(str1.concat(str2));
		
		
		//toCharArray()
		String str3 = "Welcome to java";
		System.out.println("Value of method: ");
	//	char[] ch = str3.toCharArray();
		
		System.out.println(str3.toCharArray());
		
		//subString()
		System.out.println(str3.substring(5));
		System.out.println(str3.substring(0,9));
		
		//intern
		String clg =  "kgisl";
		String clg1 = new String("Kgisl");
		String str4 = clg.intern();
		
		System.out.println(clg==str4);
		
		
		
	}

}
