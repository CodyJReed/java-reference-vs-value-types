import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner  = new Scanner(System.in);
    public static void main(String[] args) {
        int[] testArray = {1,5,3,7,11,15};
        System.out.println(Arrays.toString(testArray));
        reverse(testArray);
        System.out.println(Arrays.toString(testArray));
//        System.out.println("Enter count:");
//        int count = scanner.nextInt();
//        scanner.nextLine();
//
//        int[] returnedArray = readIntegers(count);
//        int returnedMin = findMin(returnedArray);
//
//        System.out.println("min = " + returnedMin);

//        int myIntValue = 10;
//        int anotherIntValue = myIntValue;
//
//        System.out.println("myIntValue = " + myIntValue);
//        System.out.println("anotherIntValue = " + anotherIntValue);
//
//        anotherIntValue++;
//
//        System.out.println("myIntValue = " + myIntValue);
//        System.out.println("anotherIntValue = " + anotherIntValue);
//
//        int[] myIntArray = new int[5];
//        int[] anotherArray = myIntArray;
//
//        anotherArray[0] = 1;
//
//        System.out.println("myIntArray after change = " + Arrays.toString(myIntArray));
//        System.out.println("anotherArray after change = " + Arrays.toString(anotherArray));
//
//        anotherArray = new int[] {4,5,6,7,8};
//        modifyArray(myIntArray);
//
//        System.out.println("myIntArray after modify = " + Arrays.toString(myIntArray));
//        System.out.println("anotherArray after modify = " + Arrays.toString(anotherArray));
    }

    private static void reverse(int[] array) {
        int maxIndex = array.length -1;
        int halfLength = array.length / 2;
        for(int i=0;i<halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex -i];
            array[maxIndex -i] = temp;
        }
    }

//    private static int[] readIntegers(int count) {
//        int[] array = new int[count];
//        for(int i=0;i<array.length;i++) {
//            System.out.println("Enter a number:");
//            int number = scanner.nextInt();
//            scanner.nextLine();
//            array[i] = number;
//        }
//        return array;
//    }
//
//    private static int findMin(int[] array) {
//        int min = Integer.MAX_VALUE;
//        for(int i=0;i<array.length;i++) {
//            int value = array[i];
//            if (value < min) {
//                min = value;
//            }
//        }
//        return min;
//    }
//
//    private static void modifyArray(int[] array) {
//
//        array[0] = 2;
//        array = new int[] {1, 2, 3, 4, 5};
//    }
}
