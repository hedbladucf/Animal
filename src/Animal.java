
public abstract class Animal {
	
	private int age;
	private String size;
	private String location;
	
	public Animal(int age, String size, String location){
		this.age = age;
		this.size = size;
		this.location = location;
	
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void setSize(String size){
		this.size = size;
	}
	public String getSize(){
		return size;
	}
	public void setLocation(String location){
		this.location = location;
	}
	public String getLocation(){
		return location;
	}
	
	public String toString(){
		String str;
		str = "The animal is: " + age + "years old." + 
			  "\nIt is a very: " + size + "animal." +
				"\nYou can find it in/on: " + location;
		return str;
		
		
	}
	

}
