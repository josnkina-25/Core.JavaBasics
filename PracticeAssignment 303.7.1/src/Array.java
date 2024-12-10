import javax.lang.model.element.Element;
import java.util.Arrays;
public class Array {
    public void printArray() {
        int[] num = new int[3];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;

        for (int i = 0; i < 3; i++) {
            System.out.println("Element " + (i + 1) + " is: " + num[i]);
        }
    }
    public void returnArray(){
        int[] num = {13, 5, 7, 68, 2};
            System.out.println("The middle element is " + num[2]);
        System.out.println();
    }
    public void stringArray(){
        String[] str = {"red", "green", "blue", "yellow"};
        System.out.println("Array Length is: " + str.length);
        String[] str2 = str.clone();
        System.out.println("The colors are: " + Arrays.toString(str2));
        System.out.println();
    }
    //  Write a program that creates an integer array with 5 elements (i.e., numbers).
    //  The numbers can be any integers.  Print out the value at the first index and the last index using length - 1 as the index.
    //  Now try printing the value at index = length (e.g., myArray[myArray.length] ).  Notice the type of exception which is produced.
    //  Now try to assign a value to the array index 5. You should get the same type of exception.


    public void integerArray(){
        int[] num = {1, 2, 3, 4, 5};
        for (int i = 0; i < num.length; i++) {
            System.out.println("Value at index " + num[i]);
        }
        // value of first index
        System.out.println("Value for the first index: " + num[0]);
        // value for the last index
        System.out.println("Value for the last index: "+ num[num.length - 1]);
//        for(int i = 0; i < num.length; i++){
//            int length = num.length;
//            System.out.println("Value "length);
//        }
//        System.out.println("value at index = length: " + num[num.length]);
        System.out.println("value at index 0: " + num[0]);
        num[5] = 6;

        System.out.println("The value at index 5: " + num[5]);
    }
    public void ArrayLoop(){
       int[] array = new int[5];
       // Loop through array
        for (int i = 0; i < array.length; i++){
            array[i] = i; // assignt the value of i to the index.
        }
        System.out.println("The element at index : ");
        for (int value : array) {
            System.out.println(value);
        }

        System.out.println();
    }
    public void ArrayLp(){
        int[] array1 = new int[5];
        // loop through the array
        for (int i = 0; i < array1.length; i++){
            array1[i] = i * 2; // assign the value of i multiplied by 2.
        }
        System.out.println("The element at index : ");
        for (int value : array1) {
            System.out.println(value);
        }
    }
    //create an array of 5 elements.
    // Loop through the array and print the value of each element,
    // except for the middle (index 2) element.
    public void ArrayElement(){
        int [] num1 = {10,20,30,40,50};
        for(int i = 0; i < num1.length; i++){
            if(i != 2){
                System.out.println(num1[i]);
            }
        }
        System.out.println();
    }
    //creates a String array of 5 elements and
    // swaps the first element with the middle element without creating a new array.

    public void StringArray(){
    String[] str1 = {"R", "G", "B", "Y", "T"};
    System.out.println("Elements" + Arrays.toString(str1));

    // swap
    String temp = str1[0];
    str1[0] = str1[4];
    str1[4] = temp;
    System.out.println("Element after swapping: " + Arrays.toString(str1));

        System.out.println();
    }

    // the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
    // Print the array in ascending order, and print the smallest and the largest element of the array.
    // The output will look like the following:
    //Array in ascending order: 0, 1, 2, 4, 9, 13
    //The smallest number is 0
    //The biggest number is 13
    public void IntegerArray2(){
        int[] arrayNumbers = {4, 2, 9, 13, 1, 0};
        // array in ascending order by using Arrays.sort();
        Arrays.sort(arrayNumbers);
        System.out.println("Array numbers: " + Arrays.toString(arrayNumbers));
        System.out.println();

        // check the smallest and the largest number

        int smallest = arrayNumbers[0];
        int largest = arrayNumbers[0];
        for (int i = 1; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] < smallest) {
                smallest = arrayNumbers[i];
            }
            if (arrayNumbers[i] > largest) {
                largest = arrayNumbers[i];
            }
        }
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
        System.out.println();
    }

    //Create an array that includes an integer, 3 strings, and 1 double. Print the array.
    public void doubleStringArray(){
        Object[] mixedArray = {"Auto", 3.40, 50};

        System.out.println("Mixed Array elements: ");
        for (Object mixedObject : mixedArray) {
            System.out.println(mixedObject);
        }
    }
}




