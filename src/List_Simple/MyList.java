package List_Simple;

import java.util.Arrays;

public class MyList<E>{
//    Số phần tử trong mảng
    private int size = 0;
//    Chiều dài mảng
    private static final int DEFAULT_CAPACITY = 10;
//    Tạo 1 mảng elements với thuộc tính objects
    private Object[] elements;

    //    Tạo 1 đối tượng
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //    Tăng gấp đôi kích thước mảng chứa các phần tử
//    copyOf() được sử dụng để sao chép mảng được chỉ định vào mảng mới của cùng một kiểu.
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

//    Thêm phần tử mới vào
    public void add(E e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }

//    Lấy ra phần tử ở vị trí index
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

//    Thay đổi element tại vị trí index
    public void set(int i, E e){
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
         elements[i] = e;
    }

}