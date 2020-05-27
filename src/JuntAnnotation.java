
import org.junit.Before;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;

public class JuntAnnotation {
}
//output will be : compile time error else 35
//[15]
//45
//[15, 15]

class TestDemo123  {
    static int a=0;
    static ArrayList b;
    @BeforeClass
    public static void beforeClass() {
        a=10;
        b= new ArrayList();
    }
    @Before
    public void init() {
        a=15;
        b.add(a);
    }
    //@Test
    public void test() {
        a=a+20;
        System.out.println(a);
        System.out.println(b);
    }
   // @Test
    public void test1() {
        a=a+30;
        System.out.println(a);
        System.out.println(b);
    }
}

