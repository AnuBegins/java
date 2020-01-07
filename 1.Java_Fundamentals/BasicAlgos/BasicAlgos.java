import java.util.ArrayList;
import java.util.Arrays;


public class BasicAlgos {

/* Print 1 to N */
    public void print1ToN(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(i + ",");
        }
    }

// Print odd integers between 1 and N
    public void printOdds1ToN(int number) {
        for (int i = 1; i <= number; i = i+2) {
            System.out.print(i + ",");
        }
    }

 // Print sum
    public void printSum0ToN(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
                sum += i;
            System.out.println("New int: " + i + ", Sum: " + sum) ;
        }
        // return sum;
    }

// Iterate thru an array and Print each value
    public void printArray(int[] arr) {
        // for (int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        for(int i : arr){
            System.out.println(i);
        }
    }

// Find max value in array of integers
    public void getMax (int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
       System.out.println("Max of array is: " +  max);
    }

// Find Average value of an array of integers
    public double getAverage (int[] arr) {
        double sum = arr[0];
        double avg;

        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        return avg;
    }

// Return array of odd integers from 1 to N
    public ArrayList<Integer> getOddArray(int number) {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for ( int i = 0; i <= number; i++) {
            if ( i % 2 != 0){
                myArray.add(i);
            }
        }
        return myArray;
    }


// Given int array and int Y, return the number of array values > Y
    public int countValuesGreaterThanY (int[] arr, int y) {
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > y) {
                count++;
            }
        }
        return count;
    }

// Square the values in an array of integers
    public int[] squareValues (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        return arr;
    }

// Given an array, replace any negative number in array with the value of 0
    public int[] replaceNegatives (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.max(arr[i], 0);
        }
        return arr;
    }

// Given an array, return a new array containing the MAX, MIN and AVG values of the array. New array should be three elements long and contain: [MAXIMUM, MINIMUM, AVG]
    public double[] maxMinAvg(double[] arr) {
        double[] newArr = new double[3];
        double max = arr[0];
        double min = arr[0];
        double sum = arr[0];
        double avg;

        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            if(max < arr[i]) {
                max = arr[i];
            }
            if( min > arr[i]) {
                min = arr[i];
            }
        }
        avg = sum / arr.length;
        newArr[0] = max;
        newArr[1] = min;
        newArr[2] = avg;

        return newArr;
    }

// Shift values in an int array by one to the left. First element gets removed and last element becomes 0.
    public int[] shiftValuesLeft(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
        return arr;
    }










}

