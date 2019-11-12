package day19_enum;

public class DirectionEnumDemo1Test {

	public static void main(String[] args) {
	System.out.println(DirectionEnumDemo1.EAST);
	                                                  // enum has type safety e.g. lower case eAST will flag
	switch (DirectionEnumDemo1.EAST) {
	case EAST:
		System.out.println("East Direction");
		break;
	case WEST:
		System.out.println("West Direction");
		break;
	case NORTH:
		System.out.println("North Direction");
		break;
	case SOUTH:
		System.out.println("South Direction");
		break;

	}
	
	for(DirectionEnumDemo1 d: DirectionEnumDemo1.values()) {  // enum can be iterated to get all the enum values
		System.out.println(d.name());
		
	}

}
}
