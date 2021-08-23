package mocktest;

import java.util.stream.Stream;

public  class Duck extends Animal{
     
	public Duck(int age, String gender, String  beakColor ) {
		super(age, gender);
		this.beakColor = beakColor;
		
	}
	String beakColor = "yellow";
	
	public String getBeakColor() {
		return beakColor;
	}
	public void setBeakColor(String beakColor) {
		this.beakColor = beakColor;
	}
	public void swim() {}
	public void quack() {}

	public static Stream<String> stream() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		return "Duck [beakColor=" + beakColor + ", age=" + getAge() + ", gender=" + getGender() + "]";
	}
	
	
	
}
