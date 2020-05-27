public class NTCwithFuncMetho {
}


//output : compile time error
 class NewTestingClass433  {
    static void count(int...x) {
        System.out.println("Number of arguments: "+x.length);

        for (int i:x)
            System.out.println(i+ "");
        System.out.println();
    }
    void func(int a ) //line1
    {
        System.out.println("one");
    }


    public static void main(String[] args) throws Exception {
//        new NewTestingClass().func(150);  give compile time error
//        func(11,12,13,14);
//        func();
    }}

