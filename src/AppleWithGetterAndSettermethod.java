public class AppleWithGetterAndSettermethod {
    //Output : inside apple

    private int quantity= 40;

        private int getQuantity() {
            return quantity;
        }
        public void setQuantity(int quantity) {
            this.quantity= quantity;
        }
        void display() {
            System.out.println("Inside Apple");
            getQuantity();
        }
    }

     class NewTestingClass43 {

        public static void main(String[] args) {

            AppleWithGetterAndSettermethod apple= new AppleWithGetterAndSettermethod();
            apple.display();

        }}

