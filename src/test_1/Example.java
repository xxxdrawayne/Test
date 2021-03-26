package test_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example {
	public static void main(String[] args) {
		String s = "2018-11-29";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d = sdf.parse(s);
			System.out.println("try");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("catch");
			e.printStackTrace();
			return ;
		}finally {
			System.out.println("finally");
		}
		
	}
}
 