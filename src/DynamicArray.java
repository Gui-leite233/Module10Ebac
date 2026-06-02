public class DynamicArray {

    public Object insert;
    private int[] arr;
    private int count;

    public DynamicArray(int size) {
        arr = new int[size];
    }

    public void insert(int value) {

        if (count == arr.length) {

            int[] newArr = new int[arr.length * 2];

            System.arraycopy(arr, 0, newArr, 0, arr.length);

            arr = newArr;
        }

        arr[count++] = value;
    }

    public int[] toArray() {

        int[] result = new int[count];

        System.arraycopy(arr, 0, result, 0, count);

        return result;
    }
}
