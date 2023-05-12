import java.util.*;
import java.text.SimpleDateFormat;
/* 
 * Classes Used from util package
 * Date
 * GregorianCalendar
 * Calendar
 * 
 * Classes used from test class
 * text.SimpleDateFormat
*/

public class DateDemo2 {
    
    public static void main(String args[])
    {
        Date d = new Date();
        SimpleDateFormat sdf = null;
        String s =null;


        sdf=new SimpleDateFormat("dd/MM/yyyy");
        s=sdf.format(d);

        System.out.println("Current date is :"+s);

        sdf = new SimpleDateFormat("MM-dd-yyyy");
        s=sdf.format(d);

        System.out.println("Current Date is :"+s);

        sdf = new SimpleDateFormat("E,MMM dd yyyy");
        s=sdf.format(d);

        System.out.println("Current Date is :"+s);

        sdf = new SimpleDateFormat("E MMM MM HH:mm:ss z yyyy"); 
        s=sdf.format(d);

        System.out.println("Current date is :"+s);

        Calendar cal = new GregorianCalendar();

        int weekOfYear = cal.get(Calendar.WEEK_OF_YEAR);
        int weekOfMonth = cal.get(Calendar.WEEK_OF_MONTH);
        int dayofMonth = cal.get(Calendar.DAY_OF_MONTH);
        int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);

        System.out.println("WEEK OF YEAR"+weekOfYear);
        System.out.println("WEEK OF MONTH"+weekOfMonth);
        System.out.println("DAY OF YEAR"+dayOfYear);
        System.out.println("DAY OF YEAR"+dayofMonth);

    }

}
