package Deployment_ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("0");
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");

        System.out.println(myList);
        myList.remove(3);
        System.out.println(myList);
        myList.set(4,"55");
        System.out.println(myList);
        myList.add("vcl");
        System.out.println(myList);
        System.out.println(myList.size());
        myList.add(2, "oidoioi");
        System.out.println(myList);

    }
}