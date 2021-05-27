package simple;

public class Recursion {

	public static void main(String[] args) {
		recursivefun2(10);

	}
 static void recursivefun(int i) {
	 if(i<=0)
		 return;
	 else {
		 System.out.println(i);
		 i--;
		 recursivefun(i);//tail recursion
		 
	 }
 }
 static void recursivefun2(int i) {
	 if(i> 0) {
		 System.out.println(i);//Head recursion
	 i--;
	 recursivefun2(i);}
	 else 
		return;
	 
 }
}
