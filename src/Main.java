public class Main {
    public static void main(String[] args) {
        MyArray<Integer> array = new MyArray<Integer>() {
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public void add(Integer item, int index) {

            }

            @Override
            public void remove(Integer item) {

            }

            @Override
            public void remove(int index) {

            }

            @Override
            public void clear() {

            }
        };
        array.add(30);
        array.add(5);
        array.add(7);
        int elem = array.get(0);
        System.out.println(elem);
    }
}