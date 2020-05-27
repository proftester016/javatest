public class TestDemoWithCatchHavingTypeAsInt {
}

//Compilation fails (No exception of type int can be thrown; an exception type must be a subclass of Throwable)

class TestDemo5{
    public static void main(String[] args) {
        try {
           // throw 110;
        }
//        catch (int ex) {
//            System.out.println("Caught Exception" +ex);
//        }

        finally {

        }
    }
}
