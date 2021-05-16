package simple;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a=2;
         int b=3;
         int c = add ( a, b);
        System.out.println("c: "+c);
      
         a=5;
          b=4;
         int d= add(a,b);
        		 System.out.println("d: "+d);
	}
         static int add (int a , int b) {
        	 int d = a+ b;
        	 d =d-a;
        	 d=d+a;
        	 return d;
         }
        		 
	}


