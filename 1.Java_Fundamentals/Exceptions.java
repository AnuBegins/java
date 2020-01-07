import java.util.* ;

public class Exceptions {

    public void castAsInteger(ArrayList<Object> myList) {
        for (int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
            }
            catch (Exception e) {
                System.out.println("Error at index " + i);
                System.out.println("Message: " + e);
                System.out.println("Triggered by: " + myList.get(i));
                System.out.println();
            }
        }
    }
}