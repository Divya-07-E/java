                                                                                                                                                                                                                                                                                                                                                                                                 package code;

public class Operators { 
	
	public static void main(String[] args) {
		 int a= 5, b = 8, c = 12; 
		 
		 //Arithmetic operators
		 System.out.println("Addition"+(a+b));
		 System.out.println("Substaction"+(a-b));
		 System.out.println("multiplication"+(a*b));
		 
		 
		 //Relational
		 System.out.println("Equal to"+(a==b));
		 System.out.println("not equal"+(a!=b));
		 System.out.println("Greater than"+(a>b));
		 System.out.println("less than equal to"+(a<=b));
		 
		 //Logical
		 boolean condition1 = true,  condition2 = false;
		 
		 System.out.println("Logical AND"+(condition1 && condition2));
		 System.out.println("Logical OR"+(condition1 || condition2));
		 System.out.println("Logical NOT"+(!condition1));
		 
		 //unary
		 System.out.println("Unary nagation:"+(~c));
         System.out.println("Unary nagation:"+(~c));
		 System.out.println("Post Increment:"+(a++)); 
         System.out.println("Pre Decrement:"+(--a));
         System.out.println("Pre Increment:"+(++a));
         
         
         //Assignment
         a+=5;
         System.out.println("+=:" +a);
     
         
         //Ternary
         String res = (a>b)? "a is greater": " b is greater";
         System.out.println("Result:"+ res);
   
         
         //Bitwise
         /***
          * AND--->&
          * OR--->|
          * NOT--->~
          * XOR-->^
          */
         
         
	}

}
