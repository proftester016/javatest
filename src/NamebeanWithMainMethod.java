import java.util.HashSet;

public class NamebeanWithMainMethod {
}
//Output will be : [Thomas, Diana, Arnold, Jack]

class NameBean1 {
    private String str1;
    NameBean1(String str1) {
        this.str1 = str1;
    }
    @Override
    public String toString() {
        return str1;
    }
}



 class Main11 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HashSet hashSet = new HashSet();
        String str1 = new String("Jack");
        String str2 = new String("Thomas");
        NameBean nameBean1 = new NameBean("Arnold");
        NameBean nameBean2 = new NameBean("Diana");
        hashSet.add(str1);
        hashSet.add(str2);
        hashSet.add(nameBean1);
        hashSet.add(nameBean2);
        System.out.println(hashSet);
    }
}
