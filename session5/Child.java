package code;

public class Child extends Parents{
	
	//override parent method (run-time polymorphism)
	
	public void assets() {
		System.out.println("Parents assets and properties with child assets");
	}
	
	public void vehicle() {
		System.out.println("Car");
	}
public static void main(String[] args) {
	Child cd = new Child();
	cd.assets();
	cd.vehicle();
	
} 
	
	
}
