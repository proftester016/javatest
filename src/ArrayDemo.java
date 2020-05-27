import java.util.Arrays;

class ArraysDemo{

    //Answer is :  Original Array: [11, 22, 33, 44, 55, 66, 77, 88, 99, 109]
    //New Array: [11, 22, 33, 7, 44, 55, 66, 77, 88, 99]


    public static void main(String[] args) {
        int[] arrVar = {11,22,33,44,55,66,77,88,99,109};
        int position = 3;
        int value = 7;
        System.out.println("Original Array: " + Arrays.toString(arrVar));
        for (int i=arrVar.length-1; i>position; i--) {
            arrVar[i] = arrVar[i-1];
        }
        arrVar[position] = value;
        System.out.println("New Array: " +Arrays.toString(arrVar));
    }
}