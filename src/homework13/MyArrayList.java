package homework13;


import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import java.util.ListIterator;


public class MyArrayList implements List<Integer> {
    private Integer[] elements;
    public MyArrayList() {
        elements = new Integer[0];
    }
    @Override
    public int size(){
        return elements.length;
    };
    @Override
    public boolean isEmpty(){
        return elements.length == 0;
    };
    @Override
    public boolean contains(Object o){
        for(Integer element : elements){
            if(element.equals(o)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    ;

    @Override
    public Integer set(int index, Integer element) {
        if(index < 0 || index >= elements.length){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + elements.length);
        }
        elements[index] = element;
        return elements[index];
    }

    @Override
    public void add(int index, Integer element) {
        if(index < 0 || index > elements.length){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + elements.length);
        }
        Integer[] newElements = new Integer[elements.length + 1];
        for(int i = 0, j = 0; i < newElements.length; i++){
            if(i == index){
                newElements[i] = element;
            } else {
                newElements[i] = elements[j++];
            }
        }
        elements = newElements;

    }

    @Override
    public Integer remove(int index) {
        return 0;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public boolean add(Integer e) {
        this.add(elements.length, e);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(o)) {
                this.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Integer get(int index) {
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
