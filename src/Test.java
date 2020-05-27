import java.util.ArrayList;

class Test {

    //Answer : Answer: Compilation fails because of an error in Line7
    public static void main(String[] args) {
        ArrayList arrList = new ArrayList();
        ArrayList arrListStr = arrList;
        ArrayList arrListBuf = arrList;
        arrListStr.add(1, "SimpleString"); //Line6
      //  StringBuffer strBuff = arrListBuf.get(0); //Line7
       // System.out.println(strBuff.toString()); //Line8
    }
}