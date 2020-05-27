class WrapperDemo {
//
//    a. 12345 13 14
//    b. 12345 11 14
//    c. 12345 3 14--------------->Answer
    public static void main(String[] args) {
        Integer intWrapper = Integer.valueOf("12345");
        Integer intWrapper2 = Integer.valueOf("11",2); //radix ranges from 2-36
        Integer intWrapper3 = Integer.valueOf("E",16);
        System.out.println(intWrapper + " " + intWrapper2 + " " + intWrapper3);
    }
}