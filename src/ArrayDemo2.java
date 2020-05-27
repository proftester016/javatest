class ArrayDemo2{
    public static void main(String[] args) {
        int x[] = display();
        for(int i = 0;i<x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }

    public static int[] display() {
        return new int[] {112,142,213}; //Line11     Answer mentioned for output as 112 142 213?


    }
}