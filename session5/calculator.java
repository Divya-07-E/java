package code;

public class calculator {
	
	//By changing the number of arguments
	public int add(int a, int b) {
		
	return a+b;
	}
 public int add(int a, int b, int c) {
	 return a+b+c;
 }
  public static void main(String[] args) {
	calculator calc  = new calculator();
	 
	System.out.println(calc.add(5,10));
	System.out.println(calc.add(8,10));
}
 
 
}
