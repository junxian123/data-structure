/**
 * 二次封装数组
 */
public class Array<E> {
    private E[] data;
    // 数组实际大小
    private int size;

    public Array(int capacity) {
        if(capacity < 1) {
            throw new IllegalArgumentException("create array failed. this capacity must greater than 0");
        }
        data = (E[])new Object[capacity];
        size = 0;
        System.out.println(data);
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
     * @param e
     */
    public void unshift(E e) {
        add(0,e);
    }

    /**
     * 尾插入
     * @param e
     */
    public void push(E e) {
        add(size,e);
    }

    /**
     * 指定数组下标插入
     * @param index
     * @param e
     */
    public void add(int index, E e) {

        if(isFull()) {
            resize(2*data.length);
        }

        if(index<0 || index>size) {
            throw new IllegalArgumentException("add failed. the index illegal");
        }

        for (int i = size-1; i>=index; i--) {
            data[i+1] = data[i];
        }
        data[index] = e;
        size++;
    }

    /**
     * 获取元素
     * @param index
     * @return
     */
    public E get(int index) {
        if(index<0 || index>size) {
            throw new IllegalArgumentException("get failed. the index illegal");
        }
        return data[index];
    }

    /**
     * 修改元素
     * @param index
     * @param e
     */
    public E set(int index,E e){
        if(index<0 || index>=size) {
            throw new IllegalArgumentException("set failed. the index illegal");
        }
        E res = this.data[index];
        data[index] = e;
        return res;
    }

    /**
     * 数组是否包含元素
     * @param e
     * @return
     */
    public boolean contains(E e){
        return this.findIndex(e) !=-1 ? true : false;
    }

    /**
     * 获取指定元素下标
     * @param e
     * @return
     */
    public int findIndex(E e) {
        for (int i = 0; i < size; i++) {
            if(data[i].equals(e)){
                return i;
            }
        }
        return -1;
    }

    /**
     * 删除元素
     * @param index
     * @return
     */
    public E remove(int index) {
        if(index<0 || index >= size) {
            throw new IllegalArgumentException("remove failed. the index illegal");
        }

        E res = data[index];
        for (int i = index+1; i < size; i++) {
            data[i-1] = data[i];
        }
        size --;
        data[size] = null;

        if(size == data.length/4 && data.length/2 != 0) {
            resize(data.length/2);
        }
        return res;
    }

    /**
     * 首删除
     * @return
     */
    public E shift() {
        return remove(0);
    }

    /**
     * 尾删除
     * @return
     */
    public E pop() {
        return remove(size-1);
    }

    /**
     * 动态数组
     */
    public void resize(int capacity) {
        E[] dataArray = (E[])new Object[capacity];
        for (int i = 0; i < size; i++) {
            dataArray[i] = data[i];
        }
        data = dataArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Array:size=%d,capacity=%d\n",size,data.length));
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i].toString());
            if(i != size-1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
