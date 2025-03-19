package code;
 
import java.util.Scanner;

public class ElseifLadder {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	  System.out.println("Eter ticket price:");
	   int price = sc.nextInt();
	   
	   if(price>=60 && price <=100) {
		   System.out.println("Seat from 1 to 30");
	   }else if (price>100 && price<=250) {
		   System.out.println("Seat from 31 to 60");
	   }else if (price>250 && price<=500) {
		   System.out.println("Seat from 60 to 90");
	   }else {
		   System.out.println("Special cabin");
	   }
		   
}
}
