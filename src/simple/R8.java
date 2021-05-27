package simple;

public class R8 extends Supercar {
	public static void main (String args[]) {
		R8 Audi = new R8();
		
		Audi.maxpeed();
		Audi.minspeed();
		Audi.Engine();
		
	}
	void maxspeed() {
		maxspeed = 320;
		System.out.println("Audi R8' Max speed is : "+maxspeed);
	}
 void Engine() {
	  String Engine = "V10";
	  System.out.println("Audi R8's Engine is : "+Engine);
 }
	

}
