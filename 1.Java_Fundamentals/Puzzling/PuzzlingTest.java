import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class PuzzlingTest{
    public static void main(String[] args){

        Puzzling puzzle = new Puzzling();


        System.out.println("\nCreate an array with the following values: 3,5,1,2,7,9,8,13,25,32.\nPrint the sum of all numbers in the array.\nAlso have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)\n");
        int num                 = 10;
        int[] arr               = { 3, 5, 1, 2 , 7, 9, 8, 13, 25, 32 };

        ArrayList<Integer> myArr = puzzle.printSumAndFilter(arr,num);
        System.out.println("myArr: " + myArr);


        System.out.println("\n\nCreate an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Shuffle the array and print the name of each person.\nHave the method also return an array with names that are longer than 5 characters.\n");
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"));
        System.out.println("\nShuffled array of > 5 characters: " + puzzle.printAndShuffleNames(names, 5));


        System.out.println("\nGenerate and return an array with 10 random numbers between 55-100.\n");
        puzzle.getRandomIntArray(10, 55, 100, true);


        System.out.println("\n Create a random string that is 5 characters long.\n");
        System.out.println("Random string: " + puzzle.getRandomString(5));

        System.out.println("\n Generate an array with 10 random strings that are each 5 characters long\n");
        puzzle.getArrayOfRandomStrings(10, 5);


    }


}
