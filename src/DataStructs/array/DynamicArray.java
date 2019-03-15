package DataStructs.array;

public class DynamicArray<E> {
    private int size;
    private E []data;

    public DynamicArray(int capacity){
        if (capacity < 0)
            throw  new IllegalArgumentException("capacity error! capacity: " + capacity);
        data = (E[]) new Object[capacity];

    }

    public DynamicArray(){
        this(10);
    }

    //获取当前实际大小
    public int getSize() { return size; }

    //获取数组的长度
    public int getCapacity() { return data.length; }

    //返回数组是否为空
    public boolean isEmpty() { return size == 0; }

    public void add(int index,E element){

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index out of range");
        }

        if (size == data.length)
            resize(2*data.length);

        for(int i=size-1 ; i >= index ; i--){
            data[i + 1] = data[i];
        }
        data[index] = element;
        size++;
    }

    // 在所有元素前添加一个新元素
    public void addFirst(E  element) { add(0, element); }

    // 在所有元素末尾添加一个新元素
    public void addEnd(E  element){ add(size, element);  }

    // 在所有元素末尾添加一个新元素
    public void add(E  element){ add(size, element);}

    //获取当前索引的元素
    public E  get(int index){
        if (index < 0 || index > size-1)
            throw new IllegalArgumentException("get index out of range");
        return data[index];
    }

    //设置指定索引的元素
    public void set(int index , E  element){
        if (index < 0 || index > size-1)
            throw new IllegalArgumentException("set index out of range");
        data[index]=element;
    }

    //找到指定元素的第一个索引位置
    public int findFirstIndex(E  element){
        for (int i = 0 ; i <= size-1 ; i++){
            if (data[i] .equals(element) )
                return i;
        }
        return -1;
    }

    //判断指定元素是否在数组中
    public boolean contains(E  element){
        for (int i = 0 ; i <= size-1 ; i++){
            if (data[i] . equals(element) )
                return true;
        }
        return false;
    }

    //删除指定元素
    public void removeElement(E  element){
        int index = find(element);
        if (index != -1){
            remove(index);
        }
    }

    private int find(E  element){
        for (int i=0 ; i < size ; i++){
            if (data[0] .equals(element) )
                return i;
        }
        return -1;
    }

    //删除指定索引的元素
    public E  remove(int index){
        if (index < 0 || index > size-1)
            throw new IllegalArgumentException("set index out of range");
        E  res = data[index];
        for (int i = index ; i < size - 1 ; i++)
            data[i] = data[i+1];
        data[size-1] = null;
        size --;

        if (size == data.length/2)
            resize(data.length/2);
        return res;
    }

    //删除第一个元素
    public E  removeFirst() { return remove(0); }

    //删除末尾元素
    public E  removeEnd() { return remove(size - 1);}

    private void resize(int minCapacity){
        E[] newData = (E[]) new Object[minCapacity];
        for (int i = 0 ; i < size ; i ++)
            newData[i] = data[i];
        data = newData;
    }

    @Override
    public String  toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("DynamicArray: size = %d ,capacity = %d\n" ,size,data.length));
        res.append('[');
        for (int i = 0 ; i < size ; i++) {
            res.append(data[i]);
            if (i != size - 1)
                res.append(", ");
        }
        res.append(']');
        return res.toString();
        }
}
