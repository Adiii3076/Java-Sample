package simple;

public class BMWCar extends Parentcar {
	boolean greabox  = true;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMWCar bmw  =new BMWCar() ;
		bmw.color = "Red";
		bmw.Accs();
		bmw.breakspeed();
		System.out.println("The car is auto "+bmw.greabox);
		System.out.println(" "+bmw.color);
		

	}
	void Accs(){
		speed = speed + 2;
		System.out.println(" Acc speed is : "+speed );
		
	}

}
