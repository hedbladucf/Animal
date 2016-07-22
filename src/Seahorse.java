
public class Seahorse extends Animal {
	
	private int depth;
	private double speed;
	private double mass;
	private String direction;
	private String gender;
	private String merritalStatus;
	
	public Seahorse(int age, String size, String location, int depth, 
			double speed, double mass, String direction, String gender, String merritalStatus){
		super(age, size, location);
		this.depth = depth;
		this.speed = speed;
		this.mass = mass;
		this.direction = direction;
		this.gender = gender;
		this.merritalStatus = merritalStatus;
	}
	public double getKE(){
		double KE;
		KE = (0.5)*mass*(speed*speed);
		return KE;
	}
	
	
	public String toString(){
		String str;
		str = super.toString() + 
				"\nThe Seahorse swims at depth: " + depth +
				"\nIt's speed is: " + speed + " Mph." +
				"\nIt's mass is: " + mass + " grams." +
				"\nIt's swimming in the direction: " + direction +
				"\nIt is a: " + gender + " Seahorse." +
				"\nThis Seahorse heppens to be: " + merritalStatus + 
				"\nThe Seahorse's Kinetic Energy is: " + this.getKE() + " dream units.";
		return str;
	}
	
	

}
