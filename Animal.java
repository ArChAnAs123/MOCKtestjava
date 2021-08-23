package mocktest;

public class Animal {
	
	
public Animal(int age, String gender) {
		super();
		this.age = age;
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	   private int age;
	   private String gender;
	   
	   public boolean isMammal() {
		return false;}
	   public String mate() {
		   
		   return gender;
	   }

}


