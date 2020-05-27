public class TestDemoWithMultipleCatch {
}
//Answer is Answer: Compilation fails (Unreachable catch block for ArithmeticException. It is already handled by the catch block for ArithmeticException)



class TestDemo4{
    public static void main(String[] args) {
        int a = 20/20;
        int b = 20/10;
        System.out.println("a= "+a+"b= "+b);
        try {
            if (a==1) {
                a = a/(a-a);
            }
            if (b==2) {
                int c[] = {1};
                c[22] = 99;
            }
        }
        catch (ArithmeticException ae) {
            System.out.println("EX1");
        }
        catch (ArrayIndexOutOfBoundsException ai) {
            System.out.println("EX2");
        }

        //below line give compile time error as already declared above
      //  catch (ArithmeticException ae) {
            System.out.println("EX3");
        }
    }

