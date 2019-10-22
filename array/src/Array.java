/**
 * 二次封装数组
 */
public class Array {
    private int[] data;
    // 数组实际大小
    private int size;

    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public Array() {
        this(10);
    }

    /**
     * 获取数组实际长度
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * 获取数组容量
     * @return
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * 数组是否为空数组
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 数组是否已经满了
     * @return
     */
    public boolean isFull() {
        return size == data.length;
    }

    /**
     * 首插入
     * @param item
     */
    public void unshift(int item) {
        add(0,item);
    }

    /**
     * 尾插入
     * @param item
     */
    public void push(int item) {
        add(size,item);
    }

    /**
     * 指定数组下标插入
     * @param index
     * @param item
     */
    public void add(int index, int item) {
        if(isFull()) {
            throw new ArrayIndexOutOfBoundsException("the array is full");
        }

        if(index<0 || index>size) {
            throw new IllegalArgumentException("the index illegal");
        }

        for (int i = size-1; i>=index; i--) {
            data[i+1] = data[i];
        }
        data[index] = item;
        size++;
    }

}
