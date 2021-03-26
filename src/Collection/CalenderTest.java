package Collection;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/9/10 10:42
 */
public class CalenderTest {
 //   Date d1 = c1.getTim
    public static void main(String[] args) {
        Calendar c1 = new GregorianCalendar();
        Calendar c2 = Calendar.getInstance();
        c2.set(2013,3, 5,13,5,20);
        System.out.println(c2.getTime());
    }

}

