package list.arraylist.implement;

/**
 * ArrayList 구현
 * 동적으로 크기를 변경하지 않으며 고정적인 크기(100)의 배열로 요소를 관리하는 자료 구조
 */
public class ArrayList {
    private final int size = 100; //ArrayList 크기
    private int index = 0; //현재 ArrayList에 들어있는 데이터의 수
    private Object[] elements = new Object[size]; //데이터를 담을 배열

    /**
     * 끝에 요소를 추가하는 함수
     * @param element 추가할 요소 
     * @return 성공 여부
     */
    public boolean add(Object element) {
        if(isFull()) return false;
        elements[index++] = element;
        return true;
    }

    /**
     * 특정 위치에 요소를 추가하는 함수
     * @param index 요소를 추가할 위치
     * @param element 추가할 요소
     * @return 성공 여부
     */
    public boolean add(Integer index, Object element) {
        if(isFull()) return false;
        for(int i = this.index; i > index; i--) {
            elements[i] = elements[i-1];
        }
        elements[index] = element;
        this.index++;
        return true;
    }

    /**
     * 특정 위치의 요소를 삭제하는 함수
     * @param index 요소를 삭제할 위치
     * @return 삭제한 요소, 만약 삭제할 요소가 없으면 false 반환
     */
    public Object remove(Integer index) {
        Object removedElement = elements[index];
        if(this.index <= index) return false;
        for(int i = index; i < this.index-1; i++) {
            elements[i] = elements[i+1];
        }
        this.index--;
        return removedElement;
    }

    /**
     * 특정 위치의 요소를 반환하는 함수
     * @param index 가져올 요소의 위치
     * @return 해당 index에 해당하는 요소, 만약 가져올 요소가 없으면 false 반환
     */
    public Object get(int index) {
        return elements[index];
    }

    /**
     * ArrayList가 가득 찼는지 확인하는 함수
     * @return ArrayList가 가득차면 true 아니면 false
     */
    public boolean isFull() {
        return index == size;
    }

    /**
     * ArrayList가 비어있는지 확인하는 함수
     * @return ArrayList가 비여있으면 true 아니면 false
     */
    public boolean isEmpty(){
        return index == 0;
    }

    /**
     * ArrayList의 요소들을 문자열로 변환하여 반환하는 함수
     * 각 요소는 ", "로 구분되며, 배열의 시작과 끝은 대괄호("[]")로 둘러싸입니다.
     * @return ArrayList의 요소들을 나타내는 문자열
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        // 배열의 각 요소를 출력, 요소 사이에 ", "를 추가
        for (int i = 0; i < index; i++) {
            sb.append(elements[i]);
            if (i < index - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }
}
