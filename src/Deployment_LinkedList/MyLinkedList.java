package Deployment_LinkedList;

public class MyLinkedList {
    private Node head;
    private int numNode;
    private boolean flag;

    class Node{
        public Node next;
        public Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }

    }

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public void add(int index, Object data){
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNode++;

    }

    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNode++;
    }

    public void addLast(Object data){
        if (head == null){
            addFirst(data);
        }else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(data);
            numNode++;
        }
    }

    public void remote(int index){
        Node temp = head;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp.next = temp.next.next;
        }

        numNode--;
    }

    public Node get(int index){
        Node temp = head;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        return temp;

    }

    public boolean contains (Object data){
        Node temp = head;

        for (int i = 0; i < numNode; i++) {
            if ((temp.data).equals(data)){
                flag = true;
                break;
            }else {
                flag = false;
                temp = temp.next;
            }
        }
        return false;
    }

    public int indexOf(Object data){
        Node temp = head;
        int index = 0;
        for (int i = 0; i <= numNode; i++) {
            if ((temp.data).equals(data)){
                index = i;
                break;
            }
        }
        return index;
    }

    public int size(){
        return numNode;
    }

    public void clear(){
        head = null;
    }

    public void printList(){
        Node temp = head;
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
}
