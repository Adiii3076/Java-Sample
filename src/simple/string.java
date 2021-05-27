package simple;

public class string {
	public static void main(String[] args) {
		String str="Welcome";
		String sc=" to MIT Polytecnic";
		System.out.println(str.length());
		System.out.println(str.concat(sc));
		System.out.println(str.charAt(3));
		System.out.println(str.equals(sc));
		System.out.println(str.compareTo(sc));
		System.out.println(str.indexOf('p'));
		System.out.println(str.lastIndexOf('p'));
		System.out.println(str.substring(3));
	}
}
