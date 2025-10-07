package homework13;

import java.util.* ;

/** * A custom implementation of a doubly linked list.
 */
public class MyLinkedList<E> implements List<E> {
    Node<E> head;
    Node<E> tail;
    int size;
    /** A private static inner class representing a node in the linked list.
     */
    static class Node<E> {
        E data;
        Node<E> next;
        Node<E> prev;

        Node(E data) {
            this.data = data;
        }
        Node(E data, Node<E> next, Node<E> prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    public MyLinkedList(Collection<? extends E> c) {
        head = null;
        tail = null;
        size = 0;
        this.addAll(c);
    }
    public MyLinkedList(E[] array) {
        head = null;
        tail = null;
        size = 0;
        this.addAll(Arrays.asList(array));
    }
    /** A private helper method to get the node at a specific index.
     * @param index the index of the node to retrieve
     * @return the node at the specified index
     */
    private Node<E> getNode(int index) {
        Node<E> x;
        if (index < (size / 2)) {
            x = head;
            for (int i = 0; i < index; i++) {
                x = x.next;
            }
        } else {
            x = tail;
            for (int i = size - 1; i > index; i--) {
                x = x.prev;
            }
        }
        return x;
    }


/**     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Returns true if this list contains no elements.
     * @return true if this list contains no elements
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns true if this list contains the specified element.
     * @param o element whose presence in this list is to be tested
     * @return true if this list contains the specified element
     */
    @Override
    public boolean contains(Object o) {
        if(o == null) {
            for(Node<E> x = head; x != null; x = x.next) {
                if(x.data == null) return true;
            }
        } else {
            for(Node<E> x = head; x != null; x = x.next) {
                if(o.equals(x.data)) return true;
            }
        }
        return false;
    }

    /**
     * Returns an iterator over the elements in this list in proper sequence.
     * @return an iterator over the elements in this list in proper sequence
     */
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> current = head;
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                E data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    /**
     * Returns an array containing all of the elements in this list in proper sequence (from first to last element).
     * @return an array containing all of the elements in this list in proper sequence
     */
    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (Node<E> x = head; x != null; x = x.next) {
            result[i++] = x.data;
        }
        return result;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    /**
     * Appends the specified element to the end of this list.
     * @param e element to be appended to this list
     * @return true (as specified by Collection.add(E))
     */
    @Override
    public boolean add(E e) {
        Node<E> newNode = new Node<>(e);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        size++;
        return true;
    }

    /**
     * Removes the first occurrence of the specified element from this list, if it is present.
     * @param o element to be removed from this list, if present
     * @return true if this list contained the specified element
     */
    @Override
    public boolean remove(Object o) {
        if (o == null) {
            for (Node<E> x = head; x != null; x = x.next) {
                if (x.data == null) {
                    if (x == head) {
                        head = head.next;
                        if (head != null) {
                            head.prev = null;
                        } else if (tail != null) {
                            tail = null;
                        }
                    } else if (x == tail) {
                        tail = tail.prev;
                        if (tail != null) {
                            tail.next = null;
                        } else {
                            head = null;
                        }
                    } else {
                        x.prev.next = x.next;
                        x.next.prev = x.prev;
                    }
                    size--;
                    return true;
                }
            }
        } else {
            for (Node<E> x = head; x != null; x = x.next) {
                if (o.equals(x.data)) {
                    if (x == head) {
                        head = head.next;
                        if (head != null) {
                            head.prev = null;
                        } else if (tail != null) {
                            tail = null;
                        }
                    } else if (x == tail) {
                        tail = tail.prev;
                        if (tail != null) {
                            tail.next = null;
                        } else if (head != null) {
                            head = null;
                        }
                    } else {
                        x.prev.next = x.next;
                        x.next.prev = x.prev;
                    }
                    size--;
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Returns true if this list contains all of the elements of the specified collection.
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
     * Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
     * @param c collection containing elements to be added to this list
     * @return true if this list changed as a result of the call
     */
    @Override
    public boolean addAll(Collection<? extends E> c) {
        for (E element : c) {
            add(element);
        }
        return true;
    }

    /**
     * Inserts all of the elements in the specified collection into this list at the specified position (optional operation).
     * @param index index at which to insert the first element from the specified collection
     * @param c collection containing elements to be added to this list
     * @return true if this list changed as a result of the call
     */
    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        for (E element : c) {
            add(index++, element);
        }
        return true;
    }

    /**
     * Removes from this list all of its elements that are contained in the specified collection (optional operation).
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

    /**
     * Retains only the elements in this list that are contained in the specified collection (optional operation).
     * @param c collection containing elements to be retained in this list
     * @return true if this list changed as a result of the call
     */
    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    /**
     * Removes all of the elements from this list. The list will be empty after this call returns.
     */
    @Override
    public void clear() {
        Node<E> x = head;
        while (x != null) {
            Node<E> next = x.next;

            x.data = null;
            x.next = null;
            x.prev = null;

            x = next;
        }

        head = null;
        tail = null;
        size = 0;
    }

    /**
     * Returns the element at the specified position in this list.
     * @param index index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size())
     */
    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return getNode(index).data;
    }

    /**
     * Replaces the element at the specified position in this list with the specified element.
     * @param index index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size())
     */
    @Override
    public E set(int index, E element) {
        if( index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<E> node = getNode(index);
        E oldValue = node.data;
        node.data = element;
        return element;

    }

    /**
     * Inserts the specified element at the specified position in this list.
     * @param index index at which the specified element is to be inserted
     * @param element element to be inserted
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index > size())
     */
    @Override
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<E> newNode = new Node<>(element);
        if (index == 0) {
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        } else if (index == size) {
            add(element);
        } else {
            Node<E> current = getNode(index);
            Node<E> previous = current.prev;
            previous.next = newNode;
            newNode.prev = previous;
            newNode.next = current;
            current.prev = newNode;
        }
        size++;

    }

    /**
     * Removes the element at the specified position in this list.
     * @param index the index of the element to be removed
     * @return the element that was removed from the list
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size())
     */
    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<E> object = getNode(index);
        if (object == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else if (tail != null) {
                tail = null;
            }
        } else if (object == tail) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else if (head != null) {
                head = null;
            }
        }

        size--;
        return object.data;
    }

    /**
     * Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
     * @param o element to search for
     * @return the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element
     */
    @Override
    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Node<E> x = head; x != null; x = x.next) {
                if (x.data == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (Node<E> x = head; x != null; x = x.next) {
                if (o.equals(x.data)) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }

    /**
     * Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
     * @param o element to search for
     * @return the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element
     */
    @Override
    public int lastIndexOf(Object o) {
        int index = size - 1;
        if (o == null) {
            for (Node<E> x = tail; x != null; x = x.prev) {
                if (x.data == null) {
                    return index;
                }
                index--;
            }
        } else {
            for (Node<E> x = tail; x != null; x = x.prev) {
                if (o.equals(x.data)) {
                    return index;
                }
                index--;
            }
        }
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return List.of();
    }
}
