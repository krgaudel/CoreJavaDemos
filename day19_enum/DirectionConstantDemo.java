package day19_enum;

public class DirectionConstantDemo {
	static final String EAST="east";
	static final String WEST="west";
	static final String NORTH="north";
	 static final String SOUTH="south";
	public static void main(String[] args) {
		
		System.out.println(DirectionConstantDemo.EAST);
		
		switch (DirectionConstantDemo.EAST) {
		case "east":
			System.out.println("East Direction");
			break;
		case "west":
			System.out.println("West Direction");
			break;
		case "north":
			System.out.println("North Direction");
			break;
		case "south":
			System.out.println("South Direction");
			break;


		default:
			break;
		}

	}

}
