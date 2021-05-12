package simple;

public class Operators {

	public static void main(String[] args) {
		//Arithmetic Operators
		int a = 10 , b = 5 ;
		//Assignment operator values
		int c=8;
		//Logical operator values 
		int x=2 , y=3, z=7; 
		System.out.println("a is "+a+ " ,b is " +b);
		System.out.println("a + b = "+(a + b));
		System.out.println("a - b = "+(a - b));
		System.out.println("a * b = "+(a * b));
		System.out.println("a / b = "+(a / b));
		System.out.println("a % b = "+(a % b));
		System.out.println("a++ : "+(a++));
		System.out.println("a-- : "+(a--));
		System.out.println("c+= : "+(c));
		System.out.println("c-= : "+(c));
		System.out.println("c*= : "+(c));
		System.out.println("c/= : "+(c));
		System.out.println("c%= : "+(c));
		System.out.println("a < b : "+(a < b));
		System.out.println("a > b : "+(a > b));
		System.out.println("a == b : "+(a == b));
		System.out.println("a <= b : "+(a <= b));
		System.out.println("a >= b : "+(a >= b));
		System.out.println((z > x) && (z > y));
		System.out.println((z > x) && (x < y));
	    System.out.println((z < x) || (z < y));
	    System.out.println((z > x) && (z > y));
		System.out.println("a & b = "+(a & b));
		System.out.println("a ^ b = "+(a ^ b));
		System.out.println("a | b = "+(a | b));
		System.out.println("a << b = "+(a << b));
		System.out.println("a >> b = "+(a >> b));
		

	}

}
