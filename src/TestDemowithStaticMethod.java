public class TestDemowithStaticMethod {
}

//output will be :232
//232
//232
//Demo



 class TestDemo122  {
    static int x=232;
    int y= 135;

    public void display() {
        System.out.println("Demo");
    }
    public static void staticMetod() {
        System.out.println(x);
    }
    public static void main(String[] args) {
        TestDemo122.staticMetod();
        TestDemo122 td= new TestDemo122();
        td.staticMetod();
        staticMetod();
        td.display();
    }
}
