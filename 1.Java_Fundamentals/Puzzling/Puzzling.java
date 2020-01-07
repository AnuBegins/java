import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Puzzling {

    public ArrayList<Integer> printSumAndFilter(int[] arr, int num){
        int sum = 0;
        ArrayList<Integer> newArray = new ArrayList<Integer>();

        for (int i =  0; i < arr.length; i++ ){
            sum += arr[i];
            if (arr[i] > num) {
                newArray.add(arr[i]);
            }
        }
        System.out.println("Sum is " + sum);
        return newArray;
    }

    public ArrayList<String> printAndShuffleNames(ArrayList<String> arr, int charLength ){
        ArrayList<String> myArray = new ArrayList<String>();

        Collections.shuffle(arr);

          for(String str : arr){
            System.out.println(str);
            if (str.length() > charLength) {
                myArray.add(str);
            }
        }
        return myArray;
    }

    public void getRandomIntArray(int num, int rangeStart, int rangeEnd, Boolean sort) {
        Random rand = new Random();

        ArrayList<Integer> newArray = new ArrayList<Integer>();

        for (int i = 0; i < num; i++) {
            int randomNum = rand.nextInt(rangeEnd - rangeStart) + rangeStart;
            newArray.add(randomNum);
        }

        if (sort) {
            Collections.sort(newArray);
        }
        System.out.println("The array: " + newArray);
        System.out.println("Max is: " + Collections.max(newArray));
        System.out.println("Min is: " + Collections.min(newArray));
    }

    public String getRandomString(int charLength) {
        String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder builder = new StringBuilder();
        while (charLength-- != 0) {
            int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();

    }


    public void getArrayOfRandomStrings(int len, int charLength){
        ArrayList<String> arr = new ArrayList<String>();

        for (int i = 0; i < len; i++) {
            arr.add(getRandomString(charLength));
        }
        System.out.println(arr);
    }

}