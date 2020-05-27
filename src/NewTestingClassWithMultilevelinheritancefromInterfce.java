public class NewTestingClassWithMultilevelinheritancefromInterfce {
}
//Output will be : default method redefined
interface Interface11{
    default void method1() {
        System.out.println("Inside Default Method");
    }
}

interface DefaultExtend1 extends Interface11{
    default void method1() {
        System.out.println("Default Method redefined");
    }
}


class NewTestingClass13 implements DefaultExtend1{



    public static void main(String[] args) {
        // TODO Auto-generated method stub

        NewTestingClass13 nc= new NewTestingClass13();
        nc.method1();

    }}
