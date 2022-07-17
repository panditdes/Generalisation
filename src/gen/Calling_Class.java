package gen;

public class Calling_Class {

	public static void main(String[] args) {
		Bike k = new Bike ();
		k.Wheel = 2;
		k.Seat =2;
		k.Engine ="Two Cylinder Petrol Engine";
		System.out.println(k.Wheel);
		System.out.println(k.Seat);
		System.out.println(k.Engine);
		k.use();
		k.Helmet();
		System.out.println("====================================================================");
		Car l = new Car ();
		l.Wheel = 2;
		l.Seat = 4;
		l.Engine = "Four Cylinder Petrol Engine";
		System.out.println(l.Wheel);
		System.out.println(l.Seat);
		System.out.println(l.Seat);
		l.use();
		l.airbags();
		System.out.println("====================================================================");
		Truck j = new Truck();
		j.Wheel = 6;
		j.Seat = 2;
		j.Engine = "Six Cylinder Diesel Engine";
		System.out.println(j.Wheel);
		System.out.println(j.Seat);
		System.out.println(j.Engine);
		j.use();
		j.airbags();
	}
}
