package code;

public class Person {
	
	private String name;
	private int age;
	
	
		//regular constructor
		public Person(String name, int age) {
			this.name  = name;
			this.age = age;
			
		}
		
		//copy constructor
		public Person(Person other) {
			this.name = other.name;
			this.age = other.age;
			
		}
		//demonstrate <-------getter and setter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	//Method to display person details
	public void displayinfo() {
		System.out.println("name:" + name+ ",Age:"+age);
	}
	
	
	

}
