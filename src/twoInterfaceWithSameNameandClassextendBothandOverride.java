public class twoInterfaceWithSameNameandClassextendBothandOverride {
}

//Answer: not possible to implement two different methods in a class, having the same default method signature.
interface Interface1{
    default void method1() {
        System.out.println("Inside Default Method");
    }
}

interface DefaultExtend {
    default void method1() {
        System.out.println("Default Method redefined");
    }
}


//class NewTestingClass66 implements Interface1, DefaultExtend{


  //  public static void main(String[] args) {
        // TODO Auto-generated method stub

    //    NewTestingClass66 nc= new NewTestingClass66();
      // nc.method1();   //this line will compile time error

    //}

