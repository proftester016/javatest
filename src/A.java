public class A {
//output : COmpile time error
        public int display(String str, Integer...data) throws ArrayIndexOutOfBoundsException{
            String signature ="(String,Integer[])";
            System.out.println(str+" "+signature);
            return 1;
        }
    }

    class NewTestingClass321 extends A {
        public int display(String str, Integer...data)// throws Exception
         {
            String signature ="(String,Integer[])";
            System.out.println("Overridden: "+str+" "+signature);
            return 0;
        }


        public static void main(String[] args) {
            NewTestingClass nc= new NewTestingClass();
            try {
         //       nc.display("hello", 3);
            }
            catch(Exception e) {

            }
        }}

