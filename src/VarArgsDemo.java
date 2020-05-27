public class VarArgsDemo {

    //Answer is : Number of arguments = 4
    //11
    //12
    //13
    //14
    //Number of arguments = 0

        static void fun(int...x) {
            System.out.println("Number of arguments = "+x.length);
            for (int i : x) {
                System.out.print(i +" ");
                System.out.println();
            }
        }
        void fun(int a) {
            System.out.println("one");
        }
        public static void main(String[] args) {
            new VarArgsDemo().fun(150);
            fun(11,12,13,14);
            fun();
        }
    }

