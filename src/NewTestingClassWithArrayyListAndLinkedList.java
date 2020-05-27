import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NewTestingClassWithArrayyListAndLinkedList {
}
//Output run time exception : Exception in thread "main" java.lang.IndexOutOfBoundsException: toIndex = 5
 class NewTestingClass121 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List list= new ArrayList();
        list.add("1");
        list.add("2");
        list.add(1,"3");
        List list2= new LinkedList();
        list.add(list2);
        list2= list.subList(2, 5);
        list2.clear();
        System.out.println(list+" ");
    }}