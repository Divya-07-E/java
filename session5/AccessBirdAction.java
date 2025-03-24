package code;

public class AccessBirdAction extends Bird implements Flyable{

	@Override
	public void fly() {
		System.out.println("the Bird is flying to long");
	}

	
	public static void main(String[] args) {
		
		AccessBirdAction aba = new AccessBirdAction();
		aba.eat();
		aba.fly();                                                                                                                                                                                                                                                                                                                                                                                                
		
	}
}
