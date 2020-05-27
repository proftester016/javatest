class Dog {
    //Answer ; c. Runtime Error: java.lang.ClassCastException

    void show() {
        System.out.println("Dog");
    }
}
class BullDog extends Dog {
    void show() {
        System.out.println("Bull Dog");
    }
}
class Test1 {
    public static void main(String[] args) {
        System.out.println("Implementing Type Casting");
        Dog d = new Dog();
        BullDog bd = (BullDog) d;
        bd.show();
    }
}
