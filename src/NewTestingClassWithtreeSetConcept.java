import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class NewTestingClassWithtreeSetConcept

{
}
 class NewTestingClass {
//output will be :[key12, key39, key45]


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        HashMap props= new HashMap();
        props.put("key45", "Some value");
        props.put("key12", "Some value1");
        props.put("key39", "Some value12");
        Set s= props.keySet();
        s= new TreeSet(s);
        System.out.println(s);
    }}
