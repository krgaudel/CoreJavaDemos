package day19_enum;

public enum CarEnum {
BMW("bmw", 20000), TOYOTA("toyota", 10000), HONDA("honda", 8000);      //() calls constructor
	
	private String name;
	private double price;
	
	
	public String getName() {
		return name;
	}


	public double getPrice() {
		return price;
	}


	private CarEnum(String name, double price) {
		this.name=name;
		this.price=price;
		
	}
	
	
}
