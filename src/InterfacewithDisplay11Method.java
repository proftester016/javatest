public class InterfacewithDisplay11Method {}

//output : compile time error because of voiddisplay1(int x)

interface NewInterface {
        void display(int x);
      //  void display1(int x) { ///this will not compile

       // }
        public static void display11(int x) {

        }
        default void display111(int x) {

        }
        public interface Demo{

        }

    }
