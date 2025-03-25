package session6;

public class ExceptionEx2 {
    
	public static void main(String[] args) {
		 try {
			 System.out.println("Trying to divide bt 0...");
			 int res = 10/0;
			 System.out.println("result:"+res);
			 
			 
			 }catch(Exception e) {
				 System.out.println(e.getMessage());
				 e.printStackTrace();
				 
			 }finally {
				 System.out.println("Finally block is executed...........");
				 
			 }
	}
	
	
	
}
