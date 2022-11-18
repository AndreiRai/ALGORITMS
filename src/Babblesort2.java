public class Babblesort2 {
    public static void bubbleSort(int[] array) {
        int i = 0;
        while (i < array.length){
            int j = array.length - 1;
            while (j > i){
                if (array[j] < array[i]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
                j--;
            }
            i++;
        }
    }
}// вариант  преподавателя  сорт babble в while
