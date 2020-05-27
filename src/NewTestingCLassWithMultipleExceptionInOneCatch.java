public class NewTestingCLassWithMultipleExceptionInOneCatch {
}
//output : compile time error because of line 2
 class NewTestingClass2122 {

    public static void main(String[] args) {

        int sum, a = 10, b = 10;
        try {
            System.out.println(sum = a / b);
            return;//Line 1
        }
//        catch(ArithmeticException | Exception e){//Line 2     this line gives error as exception should be different not having parentchild relationship
//            System.out.println(e.getMessage);
//        }
        finally {
            System.out.println("In Finally");
        }
    }}
