package list.arraylist.implement;

public class ArrayList {
    private final int size = 100;
    private int index = 0;
    private Object[] elements = new Object[size];

    public boolean add(Object element) {
        if(isFull()) return false;
        elements[index++] = element;
        return true;
    }

    public boolean add(Integer index, Object element) {
        if(isFull()) return false;
        for(int i = this.index; i > index; i--) {
            elements[i] = elements[i-1];
        }
        elements[index] = element;
        this.index++;
        return true;
    }

    public boolean isFull() {
        return index == size;
    }

    public boolean isEmpty(){
        return index == 0;
    }

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
