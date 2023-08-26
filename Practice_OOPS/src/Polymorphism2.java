class Plane{
	public void takeOff() {
		System.out.println("Plane is ready to take off");
	}
	public void fly() {
		System.out.println("Plane is ready to fly");
	}
	public void landing() {
		System.out.println("Plane is ready to land");
	}
}

class CargoPlane extends Plane{
	public void fly() {
		System.out.println("CargoPlane flies at lower Height");
	}
}

class PassengerPlane extends Plane{
	public void fly() {
		System.out.println("PassengerPlane flies at Medium Height");
	}
}

class FighterPlane extends Plane{
	public void fly() {
		System.out.println("FighterPlane flies at high Height");
	}
}

class Airport{
	public void permit(Plane Plane) {
		Plane.takeOff();
		Plane.landing();
		Plane.fly();
	}
}
public class Polymorphism2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		
		Airport a = new Airport();
		a.permit(cp);
		System.out.println();
		a.permit(pp);
		System.out.println();
		a.permit(fp);
		
	}

}
