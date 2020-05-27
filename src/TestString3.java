class TestString3 {

    //Answer :       StringBuffer s = new StringBuffer("123456789"); s.delete(0, 3).replace(1, 3, "98").delete(3, 8);
    //for output as 498
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("123456789"); s.delete(0, 3).replace(1, 3, "98").delete(3, 8);
        System.out.println(s);
    }
}