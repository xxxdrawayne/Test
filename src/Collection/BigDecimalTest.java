package Collection;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/9/10 10:23
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal s1 = BigDecimal.valueOf(0.01);
        BigDecimal s2 = new BigDecimal("0.05");
        System.out.println(s1.add(s2));
        System.out.println(s1.intValue());
        //=======================================
        Date d1 = new Date();
        Date d2 = new Date(System.currentTimeMillis()+1000000000);
        System.out.println(d2);
        System.out.println(d1.compareTo(d2 ));
    }
}
