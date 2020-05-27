public class NewTestingClassPrintsIntArray {

//output : run time error java.lang.ExceptionInInitializerError
    static int[] x;
    static {
        x[0]=102;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(x);

    }}
