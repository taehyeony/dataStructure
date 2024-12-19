package list.arraylist.api;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ArrayList API 사용 방법
 */
public class Main {
    public static void main(String[] args) {
        //ArrayList 객체 생성
        ArrayList<Integer> numbers = new ArrayList<>();

        //데이터 추가
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("add(값)");
        System.out.println(numbers);

        numbers.add(1,50);
        System.out.println("\nadd(인덱스, 값)");
        System.out.println(numbers);

        //데이터 삭제
        numbers.remove(2);
        System.out.println("\nremove(인덱스)");
        System.out.println(numbers);

        //데이터 가져오기
        System.out.println("\nget(인덱스)");
        System.out.println(numbers.get(2));

        //ArrayList 크기
        System.out.println("\nsize()");
        System.out.println(numbers.size());

        //특정 문자열 찾기
        System.out.println("\nindexOf()");
        System.out.println(numbers.indexOf(30));

        //Iterator를 이용한 순회
        Iterator<Integer> iterator = numbers.iterator();
        System.out.println("iterator를 이용한 순회");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //for-each를 이용한 순회
        System.out.println("for-each를 이용한 순회");
        for(Integer number : numbers) {
            System.out.println(number);
        }
    }
}
