package homework13.test;

import homework13.MyArrayList;

public class ALTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println("Initial size: " + list.size()); // Expected: 0
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Size after adding 3 elements: " + list.size()); // Expected: 3
        System.out.println("Element at index 1: " + list.get(1)); // Expected: 2
        list.set(1, 20);
        System.out.println("Element at index 1 after set: " + list.get(1)); // Expected: 20
        list.add(1, 15);
        System.out.println("Element at index 1 after add: " + list.get(1)); // Expected: 15
        System.out.println("Size after adding element at index 1: " + list.size()); // Expected: 4
        list.remove(2);
        System.out.println("Size after removing element at index 2: " + list.size()); // Expected: 3
        System.out.println("Element at index 2 after removal: " + list.get(2)); // Expected: 3

    }
}
