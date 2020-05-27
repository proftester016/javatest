import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NewTestingClassWithIteratorForHashSet {
}
//Output will be : null
//789
//88
//45
//7
 class NewTestingClass123 {
    public static void main(String[] args) {
        Set numbers= new HashSet();
        numbers.add(new Integer(45));
        numbers.add(88);
        numbers.add(new Integer(77));
        numbers.add(null);
        numbers.add(789L);
        Iterator iterator= numbers.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }}
