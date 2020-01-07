
public class StringManipulator {
    public String trimAndConcat(String str1, String str2){
        String output = str1.trim() + str2.trim();
        return output;
    }



    public Integer getIndexOrNull(String str, char char1){
        Integer output = str.indexOf(char1);
        return output;
    }

    public Integer getIndexOrNull(String str1, String str2) {
        Integer output = str1.indexOf(str2);
        return output;
    }


    public String concatSubstring(String str, int num1, int num2, String str2){

        String output = str.substring(num1, num2) + str2;

        return output;
    }


}