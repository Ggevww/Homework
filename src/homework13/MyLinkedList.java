package homework13;

import java.util.* ;

public class MyLinkedList<E> implements List<E> {
    Node<E> head;
    Node<E> tail;
    int size;
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



    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

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

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object element : c) {
            if (!contains(element)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        for (E element : c) {
            add(element);
        }
        return true;
    }

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

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return getNode(index).data;
    }

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
