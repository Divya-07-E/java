package code;

public class WrapperclassEX {
	public static void main(String[] args) {
		
		//Converting primitive to wrapper class-------------------------->Autoboxing
		
		 
	int a = Integer.valueOf(50);
	//same
		
		Integer intObj = 50; //Equivalent to integer.valueOf(50);
		
		
	Character charObj = 'D';
	
	Double doObj = 25.12345;
	
	System.out.println(intObj);
System.out.println(intObj);

System.out.println(charObj);
System.out.println(doObj);





System.out.println("-------------------------------");

//converting wrapper class to primitive

int value1  = intObj;
char value2 = charObj;
double value3 = doObj;

System.out.println(value1);
System.out.println(value2);
System.out.println(value3);


System.out.println("---------------------------------------");
//Using utility method from wrapper class

int parseInt = Integer.parseInt("123");
double parseDouble = Double.parseDouble("25.234567");
boolean parseBoolean = Boolean.parseBoolean("true");


System.out.println(parseInt);
System.out.println(parseDouble);
System.out.println(parseBoolean);


	}
	


}
