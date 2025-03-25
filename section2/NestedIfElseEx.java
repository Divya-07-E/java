import java.util.Scanner;
public class NestedIfElseEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter ur weight: ");
		int weight = sc.nextInt();
		
		if(age>20) {
			if(weight>50) {
				System.out.println("age and weights safisfyed u can donate blood");
			}else {
				System.out.println("under weight cannot donate blood");
			}
		}else {
			System.out.println("age is not satisfy to donate blood");
		}
		}
	}


