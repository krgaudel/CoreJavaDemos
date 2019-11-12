package assignments;

public class OperatorChallenge {
	public static void main(String[] args) {
		double num1=20.00;
		double num2=80.00;
		double num3=(num1+num2)*100.00;
		System.out.println(num3);
		int remainder=(int)num3 %40;
		System.out.println(remainder);
		boolean isRemainderZero=remainder==0?true:false;
		System.out.println(isRemainderZero);
		if(!isRemainderZero) {
			System.out.println("Got Some Remainder");
		}
		
		
		
	}

}
