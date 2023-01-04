import java.util.Arrays;

public class BabbleSortTest {
    public static void main(String[] args) {
        int[] array = {4, 44, 3, 1, 6, 560, 999, 2, 90, 5};
        babbleSorter(array);
        System.out.println(Arrays.toString(array));
        ;
    }

    public static void babbleSorter(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

        }
        //Algoritms 2/
//yes