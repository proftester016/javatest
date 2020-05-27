public class InnerClassDemo {

    //Answer is B: InnerClassDemo innerClassDemo = new InnerClassDemo();
    //InnerClassDemo.Book book = innerClassDemo.new Book();
    //System.out.printf("%d",innerClassDemo.getBookid() );
    //book.main(args);

        private int bookid = 110;
        class Book {
            private int bookid = 231;
            private int getBookid() {
                return bookid;
            }
            public void main(String[] args) {
                Book book = new Book();
                System.out.println(book.getBookid());
            }
        }
        private int getBookid() {
            return bookid;
        }

        public static void main(String[] args) {
            //Line1

        }
    }
   // Which of the below code fragment can be inserted at Line1 to get the output as 110231? (Select all that apply)



