package mocktest;

public class Zebra extends Animal{
       public Zebra(int age, String gender, boolean is_wild) {
		super(age, gender);
		this.is_wild=is_wild;
	}
	
       public boolean is_wild=true;
       public String run() {return "zebra can run";}
       
}
