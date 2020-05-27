class DemoWithExceptionAsFirstCatch{

    //Answer : Answer: Compilation error. Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception

    public static void main(String[] args) {
        int x=20, y=2;
        try {
            for (int z=4; z>=0; z--) {
                int ans = x/z;
                System.out.println(ans + " ");
            }
        } catch (Exception e1) {
            System.out.println("E1");
        }
      //compilation error because of this  catch (ArithmeticException e2) {
            System.out.println("E2");
        }
    }
