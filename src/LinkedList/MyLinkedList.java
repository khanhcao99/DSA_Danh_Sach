package LinkedList;

import javax.xml.soap.Node;

//Lớp MyLinkedList chứa lớp Node.
public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node{
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

//    Cài đặt phương thức add
//Thêm đối tượng vào vị trí thứ index trong danh sách

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

//    Cài đặt phương thức addFirst()
//Thêm đối tượng vào vị trí đầu tiên trong danh sách

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

//    Cài đặt phương thức get()
//Lấy phần tử ở vị trí index từ danh sách

    public Node get(int index){
        Node temp=head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }

//    Cài đặt phương thức printList
//Hiển thị danh sách các phần tử trong danh sách

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
