public class DemoClassForPrintingNumberOfDays {
}
//Answer is :  option A , B and C
//a.
//if((yearValue % 4 == 0) && !(yearValue % 100 == 0) || (yearValue % 400 == 0))
//b.
//if((yearValue % 4 == 0) || !(yearValue % 100 == 0) && (yearValue % 400 == 0))
//c.
//if((yearValue % 4 == 0) && (yearValue % 100 == 0) && (yearValue % 400 == 0))

class Demo1{


    public static void main(String[] args) {
        int monthValue = 2;
        int yearValue = 4000;
        int numberOfDays = 10;
        switch (monthValue) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numberOfDays = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numberOfDays = 28;
                break;
            case 2:
                //Line1
                numberOfDays = 25;
                if((yearValue % 4 == 0) && !(yearValue % 100 == 0) || (yearValue % 400 == 0))
                {}
			else
                numberOfDays = 28;
                break;
            default:
                System.out.println("Month Invalid");
                break;
        }
        System.out.println("Number of Days = "+numberOfDays);
    }
}