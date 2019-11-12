package day19_enum;

public class CarEnumTest {

	public static void main(String[] args) {
		System.out.println(CarEnum.HONDA);
		
		for(CarEnum c:CarEnum.values()) {
			System.out.println(c.name());
			System.out.println(c.getName()+" "+c.getPrice());
		}

	}

}
