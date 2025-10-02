package homework13;


import java.util.*;



/** * A custom implementation of a dynamic array list for Integer elements.
 */
public class MyArrayList implements List<Integer> {
    private Integer[] elements;
    private final int INITIAL_CAPACITY = 10;
    private int size;


    public MyArrayList() {
        elements = new Integer[INITIAL_CAPACITY];
        size = 0;
    }

    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero");
        }
        elements = new Integer[capacity];
        size = 0;
    }

    public MyArrayList(Collection<? extends Integer> c) {
        elements = new Integer[c.size()];
        size = 0;
        for (Integer element : c) {
            elements[size++] = element;
        }
    }

    public MyArrayList(Integer[] array) {
        elements = new Integer[array.length];
        size = 0;
        for (Integer element : array) {
            elements[size++] = element;
        }
    }

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Returns true if this list contains no elements.
     *
     * @return true if this list contains no elements
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns true if this list contains the specified element.
     *
     * @param o element whose presence in this list is to be tested
     * @return true if this list contains the specified element
     */
    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(elements[i], o)) return true;
        }

        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    /** Returns an array containing all of the elements in this list in proper sequence (from first to last element).
     *
     * @return an array containing all of the elements in this list in proper sequence
     */
    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elements, size);
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    /**
     * Appends the specified element to the end of this list.
     *
     * @param integer element to be appended to this list
     * @return true (as specified by Collection.add(E))
     */
    @Override
    public boolean add(Integer integer) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, (int) (elements.length * 1.5));
        }
        elements[size++] = integer;
        return true;
    }

    /**
     * Removes the first occurrence of the specified element from this list, if it is present.
     *
     * @param o element to be removed from this list, if present
     * @return true if this list contained the specified element
     */
    @Override
    public boolean remove(Object o) {
        if (!contains(o)) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                System.arraycopy(elements, i + 1, elements, i, size - i - 1);
                elements[--size] = null;
                return true;
            }

        }
        return false;
    }


    /**
     * Returns true if this list contains all of the elements of the specified collection.
     *
     * @param c collection to be checked for containment in this list
     * @return true if this list contains all of the elements of the specified collection
     */
    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object element : c) {
            if (!contains(element)) {
                return false;
            }
        }
        return true;
    }



    /**
     * Appends all of the elements in the specified collection to the end of this list, in the order that they are
     * returned by the specified collection's iterator.
     *
     * @param c collection containing elements to be added to this list
     * @return true if this list changed as a result of the call
     */
    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        for (Integer element : c) {
            add(element);
        }
        return true;
    }

    /**
     * Inserts all of the elements in the specified collection into this list, starting at the specified position.
     *
     * @param index index at which to insert the first element from the specified collection
     * @param c     collection containing elements to be added to this list
     * @return true if this list changed as a result of the call
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index > size())
     */
    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        for (Integer element : c) {
            add(index++, element);
        }
        return true;
    }

    /**
     * Removes from this list all of its elements that are contained in the specified collection.
     *
     * @param c collection containing elements to be removed from this list
     * @return true if this list changed as a result of the call
     */
    @Override
    public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        for (Object element : c) {
            while (remove(element)) {
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    /**
     * Removes all of the elements from this list. The list will be empty after this call returns.
     */
    @Override
    public void clear() {
        Arrays.fill(elements, null);
        size = 0;

    }

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size())
     */
    @Override
    public Integer get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }else {
            return elements[index];
        }

    }

    /**
     * Replaces the element at the specified position in this list with the specified element.
     *
     * @param index   index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size())
     */
    @Override
    public Integer set(int index, Integer element) {
        if (index >= 0 && index < size) {
            Integer oldElement = elements[index];
            elements[index] = element;
            return oldElement;
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    /**
     * Inserts the specified element at the specified position in this list.
     *
     * @param index   index at which the specified element is to be inserted
     * @param element element to be inserted
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index > size())
     */
    @Override
    public void add(int index, Integer element) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, (int) (elements.length * 1.5));
        }
        if (index >= 0 && index <= size) {
            System.arraycopy(elements, index, elements, index + 1, size - index);
            elements[index] = element;
            size++;
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size); }


    }

    /**
     * Removes the element at the specified position in this list.
     *
     * @param index the index of the element to be removed
     * @return the element that was removed from the list
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size())
     */
    @Override
    public Integer remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        Integer old = elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;
        return old;
    }


    /**
     * Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not
     * contain the element.
     *
     * @param o element to search for
     * @return the index of the first occurrence of the specified element in this list, or -1 if this list does not
     * contain the element
     */
    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Integer> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return null;
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        return List.of();
    }


}
