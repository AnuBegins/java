import java.util.ArrayList;
import java.util.Arrays;


public class BasicAlgosTest {
    public static void main(String[] args) {

        BasicAlgos algo = new BasicAlgos();

        int N          = 50;
        int num        = 19;
        int y          = 1;

        int[] x             = { 1, 3, 5, 7, 9, 13 };
        double[] arr1       = { 1, 2, 3, 4, 2 };
        int[] arr2          = {1, 5, 10, 7, -2}; // should become {5, 10, 7, 0}
        int[] arr3          = {3, -1, 5, 4, -9, 5};
        int[] arr4          = { 3, 2, 1, 5, 10, 4 };
        int[] myArray       = { 3, 5, 2, 1, 5} ;
        int[] intArr        = { 1, 3, 5, 7, 9, 11, 13, 15 };
        int[] arrayToSquare = {1, 5, 10, -2};


        System.out.println("Print all integers from 1 to " + N);
        algo.print1ToN(N);


        System.out.println("\n\nPrint all odd integers from 1 to " + N);
        algo.printOdds1ToN(N);


        System.out.println("\n\nPrint sum of all vals from 0 to " + N);
        algo.printSum0ToN(N);


        System.out.println("\n\nIterate through an array & print each value:");
        System.out.println(Arrays.toString(x));
        algo.printArray(x);


        System.out.println("\n\nFind max value in array of integers:");
        System.out.println(Arrays.toString(arr4));
        algo.getMax(arr4);
        // System.out.println("Max of array is: " + max);


        System.out.println("\n\nFind the average of an array of integers:");
        System.out.println(Arrays.toString(myArray));
        double average   = algo.getAverage(myArray);
        System.out.println("Average is: " + average);


        System.out.println("\n\n Return array of odd integers from 1 to " + num);
        ArrayList<Integer> oddArray = algo.getOddArray(num);
        System.out.println(oddArray);


        System.out.println("\n\nReturn values in an array that are greater than " + y);
        int count    = algo.countValuesGreaterThanY(intArr, y);
        System.out.println("Count is: " + count);


        System.out.println("\n\nSquare all values in an array of integers:");
        System.out.println(Arrays.toString(arrayToSquare));
        int[] squaredArray = algo.squareValues(arrayToSquare);
        System.out.println(Arrays.toString(squaredArray));


        System.out.println("\n\nReplace negative values in array with 0:");
        System.out.println(Arrays.toString(arr3));
        int[] removedNegatives = algo.replaceNegatives(arr3);
        System.out.println(Arrays.toString(removedNegatives));


        System.out.println("\n\nFor a given array, return [Max, Min, Avg]");
        System.out.println(Arrays.toString(arr1));
        double[] result = algo.maxMinAvg(arr1);
        System.out.println(Arrays.toString(result));  // {4, 1, 2.4}


        System.out.println("\n\nShift all values in the array to the left. Last value should equal 0:");
        System.out.println(Arrays.toString(arr2));
        int [] shiftedArray = algo.shiftValuesLeft(arr2);
        System.out.println(Arrays.toString(shiftedArray));


    }
}