public class Book {
     //compile time error
        int bookId=2356;
    }
    class Book1 extends Book{
        int bookId=1167;
    }
    class Book2 extends Book1{
        int bookId= 2378;
        void display() {
           // System.out.println(super.super.bookId);//compile time error
            System.out.println(super.bookId);
            System.out.println(bookId);
        }
    }class NewTestingClass56  {

        public static void main(String[] args) throws Exception {
            Book2 b2= new Book2();
            b2.display();
        }}

