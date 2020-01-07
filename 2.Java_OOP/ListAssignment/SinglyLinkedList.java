import java.util.*;

public class SinglyLinkedList {
    public Node head;
    public Node runner;

    public SinglyLinkedList() {
        this.head = null;
    }

// Adds a node to the list.
    public void addNode(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

// Removes a node from the end of the list
    public void removeNode() {
        if (head != null) {
            if (head.next == null) { // base case: only 1 element in SLL
                head = null;
            }
            else {
                runner = head;
                while (runner.next != null) {
                    if (runner.next.next == null) {
                        runner.next = null;
                    } else {
                        runner = runner.next;
                    }
                }
            }
        }
    }

// Removes the node at specified index value. For example, if n is 0, remove the first node.
    public void removeNodeAt(int index) {
        runner              = head;
        Node previousNode   = null;
        int counter         = 0;

        while (runner != null) {
            if (counter == index) {
                if (runner.next == null) {
                    removeNode();
                }
                else {
                    previousNode.next = runner.next;
                    break;
                }
            }

            previousNode    = runner;
            runner          = runner.next;
            counter ++;
        }
    }

// Return the first node with the value in the parameter
public Node findNode(int value) {
    if (head == null) {
        System.out.println("List is empty");
    }
    else {
        runner = head;
        while (runner != null) {
            if (runner.value == value) {
                break;
            }
            runner = runner.next;
        }
    }
    return runner;
}

// Print value of each node in the list in order
    public void printValues() {
        if (head == null) {
            System.out.println("List is empty");
        }
        else {
            runner = head;
            while (runner != null) {
                System.out.println(runner.value);
                runner = runner.next;
            }
        }
    }

}