package simple;

public class AbstrctCar {
 float fuel =(float) 20.5;
 float maxfuel =(float) 26;
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstrctCar car = new AbstrctCar();
		

	}
 void  fuelcar() {
	 if (maxfuel > fuel ) {
		 fuel+=1;
		 
		 
		 System.out.println(" fuel is : ");
	 }else {
		 System.out.println(" Fuel capacity reched");
	 }

 }void runcar(){
	 for (fuel = 0;fuel<=maxfuel;fuel--) {
		
	 }
 }
}
