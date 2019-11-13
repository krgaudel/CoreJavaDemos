package day21_Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo5 {
public static void parseDate() {
	SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
	String ss="2019-11-12";
	java.util.Date date;
	try {
		date = sf.parse(ss);
		System.out.println(date);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	public static void main(String[] args) {
		

	}

}
