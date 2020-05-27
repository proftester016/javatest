public class TestWithMainAndMethod {
}

//Answer is : Compilation fails (Cannot make a static reference to the non-static method method() from the type Test)
    class Test2{
public void method() {
        for (int i=0; i<3; i++) {
        System.out.print(i);
        }
        }

public static void main(String[] args) {
      //  method();  //gives compliation error
        }
        }