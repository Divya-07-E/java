package hello;

public class variables {
	
	int a = 25;//instance variable
	static int b = 50;//static variable
	
	public static int print() {
			int mark = 94;
			return mark;
	}
	
	void display() {
		int d= 75;//local
		System.out.println("methos inside variable:"+d);
	}
	
	public static void main(String[] args) {
		int c = 75;
		
		variables obj1 = new variables();
		System.out.println(obj1.a);
		obj1.display();
		System.out.println(b);
		System.out.println(c);
		System.out.println(print());
	}
	
	 
}
