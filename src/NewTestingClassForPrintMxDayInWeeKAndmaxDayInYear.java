import java.util.Calendar;

public class NewTestingClassForPrintMxDayInWeeKAndmaxDayInYear {
}
//output : Maximum number of weeks in a month: 6
//Maxmum number of days in a year: 366
  class NewTestingClass122 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Calendar cal= Calendar.getInstance();
        int max= cal.getActualMaximum(Calendar.WEEK_OF_MONTH);
        System.out.println("Maximum number of weeks in a month: " +max);
        max= cal.getMaximum(Calendar.DAY_OF_YEAR);
        System.out.println("Maxmum number of days in a year: " +max);
    }}

