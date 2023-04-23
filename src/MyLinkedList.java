import org.w3c.dom.Node;

public class MyLinkedList<T> implements MyArrayList<T> {
    private Node head;
    private int size;
    public MyLinkedList(){
        this.head = null;
        this.size = 0;
    }

    /**
     * @return
     */
    @Override
    public int size() {
        return 0;
    }

    /**
     * @param o
     * @return
     */
    @Override
    public boolean contains(Object o) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(o)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * @param item
     */
    @Override
    public void add(T item) {

    }

    /**
     * @param item
     * @param index
     */
    @Override
    public void add(T item, int index) {

    }

    /**
     * @param item
     */
    @Override
    public void remove(T item) {

    }

    /**
     * @param index
     */
    @Override
    public void remove(int index) {

    }

    /**
     *
     */
    @Override
    public void clear() {

    }

    /**
     * @param index
     * @return
     */
    @Override
    public T get(int index) {
        return null;
    }

    /**
     * @param o
     * @return
     */
    @Override
    public int indexOf(Object o) {
        return 0;
    }

    /**
     * @param o
     * @return
     */
    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    /**
     *
     */
    @Override
    public void sort() {

    }

    private class Node{
        T data;
        Node next;
    }
}
