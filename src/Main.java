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
            public boolean remove(Integer item) {
                return false;
            }

            @Override
            public Integer remove(int index) {
                return null;
            }

            @Override
            public void clear() {

            }
        };
        array.add(30);
        array.add(5);
        array.add(7);
        int elem = array.get(1);
        System.out.println(elem);
    }
}