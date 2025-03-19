package code;

public class Bitwise {
	public static void main(String[] args) {
		
	
	int a = 5, b = 3; //binary 5-->0101, 3--->0011
	System.out.println("Bitwise AND:" +(a & b));
	
	/** 
	 * 8421
	 * 0101
	 * 0011
	 * -----
	 * 0001 ---->1
	 * -----
	 */
	System.out.println("Bitwise OR:" +(a | b));
	
	/**
	 * 8421
	 * 0101
	 * 0011
	 * ------
	 * 0111 ---->7
	 * --------
	 */
	System.out.println("Bitwise XOR:" +(a ^ b));
	
	/**
	 * 8421
	 * 0101
	 * 0011
	 * ------
	 * 0110 ----->6
	 * ------
	 */
	System.out.println("Bitwise NOT:" +(~a));
	
	/
	
	


	}
	}
