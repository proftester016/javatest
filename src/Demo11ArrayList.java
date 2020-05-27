import java.util.ArrayList;
import java.util.Collections;

class Demo11ArrayList{

    //Answer output is : AAaa
    //AaA
    //aAa
    //aAaA
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("aAaA");
        strings.add("AaA");
        strings.add("aAa");
        strings.add("AAaa");
        Collections.sort(strings);
        for (String string:strings) {
            System.out.println(string);
        }
    }
}