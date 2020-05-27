public class AppleWithMainClass {
}
//Answer is Unresolved compilation problem. The constructor Apple() is not visible.
class Apple1{
    private Apple1(){ //Line1
        System.out.println("Apple Constructor");
    }
    void display() {
        System.out.println("Hello world");
    }
}
 class Main1 {
    public static void main(String[] args) {
       // Apple1 apple = new Apple1();   compilation error because of this
      //  apple.display();
    }
}