public class NewTestingCLassWithCalculatorFunction {

//output will be 14
        int data= 10;

        void calculate() throws Exception{
            try {
                data++;
                try {
                    data++;
                    throw new Exception();
                }
                catch(Exception ex) {
                    data++;
                    throw new Exception();

                }
            }
            catch(Exception ex) {
                data++;
            }
        }
        void display() {
            System.out.println(data);
        }

        public static void main(String[] args) throws Exception {

            NewTestingCLassWithCalculatorFunction nc= new NewTestingCLassWithCalculatorFunction();
            nc.calculate();
            nc.display();
        }}
//    Answer:
//            try {
//        data++;
//        throw new Exception();
//    }
//			catch(Exception ex) {
//        data++;
//        throw new Exception();
//
//    }
