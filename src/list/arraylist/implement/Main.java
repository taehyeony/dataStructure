package list.arraylist.implement;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("add(데이터)");
        System.out.println(list);

        list.add(1,15);
        System.out.println("add(인덱스, 데이터)");
        System.out.println(list);
    }
}
