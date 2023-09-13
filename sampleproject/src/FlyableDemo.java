
public class FlyableDemo {

	public static void main(String[] args) {
		 
		Airplane a= new Airplane();
		a.flyObj();
		a.small();
		
		Spacecraft s= new Spacecraft();
		s.flyObj();
		s.small();
		
		Helicopter h= new Helicopter();
		h.flyObj();
		h.small();
		

}
}
