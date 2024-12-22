package list.arraylist.implement;

import java.util.ListIterator;

/**
 * 구현한 ArrayList의 기능을 확인하는 Main 클래스 
 */
public class Main {
    public static void main(String[] args) {
        //ArrayList 객체 생성
        ArrayList<Integer> list = new ArrayList<>();
        
        //데이터 추가
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("add(데이터)");
        System.out.println(list);

        list.add(1,15);
        System.out.println("\nadd(인덱스, 데이터)");
        System.out.println(list);
        
        //데이터 삭제
        System.out.println("\nremove(인덱스)");
        System.out.println(list.remove(2));
        System.out.println(list);

        //데이터 가져오기
        System.out.println("\nget(인덱스)");
        System.out.println(list.get(2));

        //ArrayList 크기
        System.out.println("\nsize()");
        System.out.println(list.size());

        //특정 문자열 찾기
        System.out.println("\nindexOf()");
        System.out.println(list.indexOf(30));

        //Iterator를 이용한 순회
        ListIterator<Integer> iterator = list.listIterator();
        System.out.println("\niterator를 이용한 순회");
        System.out.println(list);
        while (iterator.hasNext()) {
            iterator.set((int)iterator.next()*2);
        }
        System.out.println(list);
        while(iterator.hasPrevious()) {
            iterator.set((int)iterator.previous()*2);
        }
        System.out.println(list);

        //for-each를 이용한 순회
        System.out.println("\nfor-each를 이용한 순회");
        for(Object element : list) {
            System.out.println(element);
        }
    }
}
