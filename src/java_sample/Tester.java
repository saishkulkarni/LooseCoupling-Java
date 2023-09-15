package java_sample;

public class Tester {
	
	static Port sim=new Jio();
	
	public static void main(String[] args) {
		
		Mobile mobile1 = new Mobile("Iphone",8,79999,sim);
		
		Mobile mobile2 = new Mobile("Xiaomi",8,25000,sim);
		
		System.out.println(mobile1);  
		mobile1.description();
		
		System.out.println(mobile2);
		
		mobile2.description();
	}
}
