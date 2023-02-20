package barket;
public class ArrayGenerator {
    private int[] array;

    public ArrayGenerator(int length) {
        array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = length - i;
        }
    }

    public int[] getArray() {
        return array;
    }
}
