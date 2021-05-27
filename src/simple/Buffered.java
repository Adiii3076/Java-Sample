package simple;
import java.util.*;
public class Buffered {

	
	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 String b;
 String c="1234567";
  System.out.println(" Enter Charcter");
  b = sc.nextLine();
  StringBuffer a= new StringBuffer(b);
  System.out.println(a);
  System.out.println(a.length());
  a.setLength(12);
  System.out.println(a.length());
  System.out.println(a.capacity());
  System.out.println(a.append(c));
  a.insert(3,c);
  System.out.println("Inserted: "+a);
  a.replace(2, 31, c);
  System.out.println("Replaced : "+a);
  System.out.println(a.reverse());
  System.out.println(a.delete(0, 7));
 }

}
