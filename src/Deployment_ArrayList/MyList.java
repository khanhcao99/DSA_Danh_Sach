package Deployment_ArrayList;

import java.sql.Array;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;


    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        elements = new Object[capacity];
    }

//    Method kiểm tra index thêm vào có nằm trong size hay không
    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
    }

//    Kiểm tra độ dài mảng
    public void ensureCapacity(){
        int newSize = elements.length*2;
        if (size>=elements.length){
            elements = Arrays.copyOf(elements, newSize);
        }
    }

//    Thêm phần tử ở vị trí index
    public void add (int index, E e){
        checkIndex(index);
        ensureCapacity();

        for (int i = size-1; i >=index ; i--) {
            elements[i+1] = elements[i];
        }
        elements[index] = e;
        size++;
    }

    public boolean add(E e){
        ensureCapacity();
        elements[size++] = e;
        return true;
    }

    public E remove (int index){
        checkIndex(index);
        E e = (E) elements[index];

        for (int j = index; j < size - 1; j++){
            elements[j] = elements[j + 1];
        }
        elements[size-1] = null;
        size--;
        return e;
    }

    public int size(){
        return size;
    }

    public E clone(){
     Object[] o = new Object[]{};
     o = Arrays.copyOf(elements, DEFAULT_CAPACITY);
     return (E) o;
    }

    public boolean contains (E o){
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(o)){
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o){
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(o)){
                return i;
            }
        }
        return -1;
    }

//    Lấy ra phần tử
    public E get (int index){
        checkIndex(index);
        return (E) elements[index];
    }

//    Clear mangr
    public void clear(){
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

//    Set
    public void set(int index, E e) {
        checkIndex(index);
        elements[index] = e;
    }
//method tostring
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            result.append(elements[i]);
            if (i < size - 1) result.append(", ");
        }

        return result.toString() + "]";
    }
}
