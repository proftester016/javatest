public class NewtestingClasswithcreateStaticMethod {
}
//No error in code
 class NewTestingClass5{

    private static Object staticObject;

    public static Object createStaticObject() {
        if (staticObject==null) {
            staticObject= new Object();
        }
        return staticObject;
    }}

