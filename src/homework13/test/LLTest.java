package homework13.test;

import homework13.MyLinkedList;

public class LLTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        System.out.println("Initial size: " + myLinkedList.size()); // Expected: 0
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        System.out.println("Size after adding 3 elements: " + myLinkedList.size()); // Expected: 3
        System.out.println("Element at index 1: " + myLinkedList.get(1)); // Expected: 2
        myLinkedList.set(1, 20);
        System.out.println("Element at index 1 after set: " + myLinkedList.get(1)); // Expected: 20
        myLinkedList.add(1, 15);
        System.out.println("Element at index 1 after add: " + myLinkedList.get(1)); // Expected: 15
        System.out.println("Size after adding element at index 1: " + myLinkedList.size()); // Expected: 4
        myLinkedList.remove(2);
        System.out.println("Size after removing element at index 2: " + myLinkedList.size()); // Expected: 3
        System.out.println("Element at index 2 after removal: " + myLinkedList.get(2)); // Expected: 3

    }
}
