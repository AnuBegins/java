import java.util.* ;

public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addNode(3);
        sll.addNode(4);
        sll.addNode(10);
        sll.addNode(5);
        sll.addNode(15);
        sll.addNode(2);
        sll.removeNode();
        sll.removeNode();
        sll.printValues();
    }
}