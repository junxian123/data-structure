public class ArrayStack<E> implements Stack<E> {
    private Array<E> array;

    public ArrayStack() {
        array = new Array<>();
    }

    public ArrayStack(int capacity) {
        array = new Array<>(capacity);
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void push(E e) {
        array.push(e);
    }

    @Override
    public E pop() {
        return array.pop();
    }

    @Override
    public E peek() {
        return array.get(array.getSize()-1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.getSize(); i++) {
            sb.append(array.get(i));
            if(i != array.getSize()-1) {
                sb.append(",");
            }
        }
        sb.append("] top");
        return sb.toString();
    }
}
