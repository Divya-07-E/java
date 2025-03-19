package code;
import java.util.Scanner;

public class nestedforloop {
	public static void main(String[] args) {
		//for(int i = 0; i<=5; i++) {
			//for(int j = 1; j<=4; j++) {
				//System.out.print(" "+i);
				//System.out.print(j);
				//System.out.print(j+" "+i);
			//}
			//System.out.println();
//		}
	//}

//}
/*for (int i = 1; i<=5; i++) {
	for(int j = 1; j<i+1; j++) {
		System.out.print(j);
	}
}}
	*/
	/*int num = 6;
	 for( int i = 0; i<=num; i++) {
		 
	 for(int j = 1; j<=num-i;  j++){
		 System.out.print("* ");
	 }
	 System.out.println();
	}
}}*/
		
		//Diamond pattern
		 
		Scanner sc = new Scanner(System.in);
		
		//no.of rows by user to give for pattern pattern printing
		System.out.println("Enter the no of rows:");
		
		int rows = sc.nextInt();
		
	/*	//Top half diamond
		for(int i = 1; i<=rows; i++) {
			//leading spaces
			for(int j = 1; j<=rows; j++) {
				System.out.print(" ");
			}
		
			
			//print*
			for(int k = 1; k<=(2*i-1); k++){
				System.out.print("*");
			}
			System.out.println();
		}}}
		*/
		
		//Bottom half diamond
			for(int i = rows-1;i<=1; i--) {
				//leading spaces
				for(int j = rows; j>i; j--) {
					System.out.print("");
				}
			
				
				//print*
				for(int k = 1; k<=(2*i-1); k++){
					System.out.print("*");
				}
				System.out.println();
			}}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		