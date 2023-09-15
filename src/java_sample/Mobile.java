package java_sample;

public class Mobile {
	String brand;
	int ram;
	double price;
	
	Port sim;
	
	public Mobile(String brand, int ram, double price,Port sim) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
		this.sim=sim;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", ram=" + ram + ", price=" + price + ", sim=" + sim + "]";
	}

	void description()
	{
		System.out.println("This is Nice Phone");
	}

}
