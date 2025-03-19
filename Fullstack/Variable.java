package code;

public class Variable {
		
    	   int a = 25;//instance
    	   static int b = 50;//static
    	     
    	   public static int scan() {
    		   int mark = 98;
    		   return mark;
    		   
    	   }
    	   void display() {
    		   int d = 60; //local variable
    		   System.out.println("method inside variable:"+d);
    	   }
    	   
    	   public static void main(String[] args) {
    		   int c = 75; //local
    		   
    		   Variable obj1 = new Variable();
    		   System.out.println(obj1.a);
    		   obj1.display();
    		   System.out.println(b);
    		   System.out.println(c);
    		   System.out.println(scan());
    		   
    		   Variable2.show();
    		   
    		   Variable2 v2 = new Variable2();
    		   v2.students();
			
		}
    	   
    	   
	}

