package code;
 import java.util.Scanner;
public class Nestedifelse {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter ur age:");
		 int age = sc.nextInt();
		 
		 System.out.println("Enter ur weight:");
		 int weight = sc.nextInt();
		 
		 if(age>20) {
			 if(weight>50) {
				 System.out.println("age and weigth are satisfied can donate blood");
				 
			 }else {
				 System.out.println("Under weight cannot donate blood");
			 }
		 }else {
			 System.out.println("age is not satisfied to donate blood");
			 
		 } else  {
			 System.out.println("Both age and weight are not satisfied to donate blood");
			 
		 }
	}

}
