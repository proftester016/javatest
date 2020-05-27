class Demo{

    //Answer is Finally block

    public void division(int x, int y) {
        try {
            int z = x/y;
        }
        catch (Exception e) {
            System.out.println("Arithmetic Exception");
        }
        finally {
            System.out.println("Finally block");
        }
    }
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.division(0, 8);
    }
}