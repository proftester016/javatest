import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TestDemoWithDateFormatter
{
}


//answer is : 13/Nov/2016
class TestDemo01{
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2016, 11, 13);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy", Locale.UK);
        System.out.println(date.format(formatter));
    }
}