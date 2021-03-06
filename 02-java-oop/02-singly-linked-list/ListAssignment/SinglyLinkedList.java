import java.util.*;

public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        // your code here
        head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove(){
        Node currentNode = head;

        if (currentNode == null) 
            System.out.println("Node is empty");
  
        if (currentNode.next == null) { 
            System.out.println("This is only one Node");
        } 
  
        while (currentNode.next.next != null){
            currentNode = currentNode.next; 
        }
        currentNode.next = null; 
    }

    public void printValues(){
        Node currentNode = head;
        System.out.print("NodeList: ");
        while (currentNode != null){
            System.out.print(currentNode + " ");

            currentNode = currentNode.next;
        }
    }

    // public int find(int value){
    //     Node currentNode = head;
    //     int count = 0;

    //     while(currentNode != null){
    //         if (currentNode.data == value){
    //             return count;
    //         }
    //         count++;
    //     }
    // }

}