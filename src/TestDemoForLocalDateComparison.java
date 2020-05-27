import java.time.LocalDateTime;
import java.time.Month;

public class TestDemoForLocalDateComparison {
}

//Answer : will print -1

class TestDemo8{
    public static void main(String[] args) {
        LocalDateTime date1 = LocalDateTime.of(2017, Month.FEBRUARY, 11,15,30); //Line1
        LocalDateTime date2 = LocalDateTime.of(2017, 2, 12,10,20); //Line2
        System.out.println(date1.compareTo(date2));
    }
}
