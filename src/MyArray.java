public class MyArray<T> implements MyArrayList<T> {
    private T[] arr;
    private int size;

    MyArray() {
        this.arr = (T[]) new Object[5];
        this.size = size();
    }
    public void IndexChecker(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
    }

    public void increaseBuffer() {
        T[] newArr = (T[]) new Object[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }


    @Override
    public int size() {

        return size;
    }

    @Override
    public boolean contains(Object o) {
        for(int i =0; i < size; i++){
            if(arr[i] == o){
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(T item) {
        if (size == arr.length) {
            increaseBuffer();
        }
        arr[size++] = item;
    }

    @Override
    public void add(T item, int index) {
        if (size == arr.length) {
            increaseBuffer();
        }
        arr[index] = (T) item;
        size++;
    }

    @Override
    public void remove(T item) {
        int newIndex = 0;
        for (int i = 0; i < size; i++) {
            if (!arr[i].equals(item)) {
                arr[newIndex++] = arr[i];
            }
            size--;
        }
    }

    @Override
    public void remove(int index) {
        IndexChecker(index);
        for(int i = index; i < index; i++){
            arr[i-1] = arr[i];
        }
        size --;

    }

    @Override
    public void clear() {
        for(int i = 0; i < size; i++){
            arr[i] = null;
        }
        size = 0;

    }

    @Override
    public T get(int index) {
        IndexChecker(index);
        return arr[index];
    }

    @Override
    public int indexOf(Object o) {
        int index1 = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == o) {
                index1 = i;
            }
        }
        return index1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int lastIndex = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(o)) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    @Override
    public void sort() {

    }
}
