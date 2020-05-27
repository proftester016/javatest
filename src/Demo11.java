import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Demo11SetNumber{

    //Answer is :   null789884577
    public static void main(String[] args) {
        Set numbers = new HashSet(); //Line1
        numbers.add(new Integer(45));
        numbers.add(88);
        numbers.add(new Integer(77));
        numbers.add(null);
        numbers.add(789L);
        Iterator iterator = numbers.iterator(); //Line7
        while(iterator.hasNext()) System.out.print(iterator.next());
    }
}