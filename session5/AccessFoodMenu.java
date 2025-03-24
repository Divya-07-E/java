package code;

public class AccessFoodMenu implements VegItems,NonVegItems{

	@Override
	public void fry() {
		System.out.println("fish fry");
		
	}

	@Override
	public void gravy() {
		System.out.println("Chicken gravy");
		
	}

	@Override
	public void breakFast() {
		System.out.println("Dosa, vada, sambar,poori");
		
	}

	@Override
	public void lunch() {
		System.out.println("Biriyani,meals,and nonvegitems...");
		
	}

	public static void main(String[] args) {
		AccessFoodMenu afm = new AccessFoodMenu();
		afm.breakFast();
		afm.lunch();
		afm.fry();
		afm.gravy();
	}
}
