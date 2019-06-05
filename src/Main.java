import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner  = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
//        int[] testArray = {1,5,3,7,11,15};
//        System.out.println(Arrays.toString(testArray));
//        reverse(testArray);
//        System.out.println(Arrays.toString(testArray));
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

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options. ");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Enter current item name: ");
        String itemNo = scanner.nextLine();
        System.out.println("Enter new item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter item to remove: ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem() {
        System.out.print("Enter an item to search for: ");
        String itemName = scanner.nextLine();
        if(groceryList.onFile(itemName)) {
            System.out.println("Found " + itemName + " in our grocery list");
        } else {
            System.out.println(itemName + " was not found in our grocery list");
        }

    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());
        System.out.println(newArray.toString());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());
        System.out.println(nextArray.toString());

    }

//    private static void reverse(int[] array) {
//        int maxIndex = array.length -1;
//        int halfLength = array.length / 2;
//        for(int i=0;i<halfLength; i++) {
//            int temp = array[i];
//            array[i] = array[maxIndex -i];
//            array[maxIndex -i] = temp;
//        }
//    }

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
