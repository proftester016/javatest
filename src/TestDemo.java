class TestDemo {

    //Answer : java:programming:course
    //false , false
    public static void main(String[] args) {
        String joinString = String.join(":", "java", "programming", "course");
        String s1 = "JAVA", s2 = "java", s3 = "Java";
        s1.toLowerCase();
        s3 = s3.replace("J", "j");
        System.out.println(joinString);
        System.out.println(s1.equals(s2) + " , " + (s2==s3));
    }
}