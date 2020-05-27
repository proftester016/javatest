public class NewTestingClassWithMainAndMethod {
}

class NewTestingClass1 {

//Answer is Compilation error
    public void method() {
        for (int i=0;i<3;i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
      //  method();   will give compilation error as calling non static from static
    }

}

