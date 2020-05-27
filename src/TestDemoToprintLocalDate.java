import java.time.LocalDate;

public class TestDemoToprintLocalDate {
}
//Answer Exception will be thrown as date is not in range YYYY,MM ,DD

class TestDemo9{
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(12, 11, 2017);
        System.out.println(date);
    }
}