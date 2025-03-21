package code;

public class ConstructorOverloadingEx {
	private String empname;
	private int empid;
	private String location;
	
	public ConstructorOverloadingEx(String empname, int empid, String location) {
		
		this.empname = empname;
		this.empid  = empid;
		this.location = location;
		
	}	
		public ConstructorOverloadingEx(String empname, String location) {
			this(empname,0,location); // call invoke using this keyword
			
		}
	
		public ConstructorOverloadingEx(String empname , int empid) {
			this(empname,empid,null);
		}
	
	public void displayinfo() {
		System.out.println("Empname:" +this.empname);
		System.out.println("Empid:" +this.empid);
		System.out.println("Emp location:" +this.location);
		
	}
	
	public static void main(String[] args) {
		
		ConstructorOverloadingEx cox = new ConstructorOverloadingEx("divya",232219,"Karur");

		ConstructorOverloadingEx cox1 = new ConstructorOverloadingEx("divya","Karur");
		

		ConstructorOverloadingEx cox2 = new ConstructorOverloadingEx("divya", 232219,"null");
		
		cox.displayinfo();
		cox1.displayinfo();
		
		cox2.displayinfo();
		
		
		
	}

}
