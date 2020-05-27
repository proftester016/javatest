public class ConstructorDemo1 {

    //Answer output is :  1101 Jacklin 22
    //1102 John 22

        private int id;
        private final String name;
        static final int age = 22;
        ConstructorDemo1(int i, String n) {
            id = i;
            name = n;
        }
        ConstructorDemo1(int i, String n, int a) {
            id = i;
            name = n;
        }
        void display() {
            System.out.println(id + " " + name + " " +age);
        }
        public static void main(String[] args) {
            ConstructorDemo1 constructorDemo1 = new ConstructorDemo1(1101, "Jacklin");//Line1
            ConstructorDemo1 constructorDemo2 = new ConstructorDemo1(1102, "John", 25);    //Line2
            constructorDemo1.display();
            constructorDemo2.display();
        }
    }


