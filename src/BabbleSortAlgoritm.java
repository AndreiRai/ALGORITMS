import java.util.Arrays;

public class BabbleSortAlgoritm {
    public class BubbleSort {
    public static void main(String[] args) {
        // Отсортировать методом "Bubble" данный массив:
        int[] array = {4, 44, 3, 1, 6, 560, 999, 2, 90, 5};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        //проходим внешним циклом по массиву
        for (int i = 0; i < array.length - 1; i++) {
            //проходим внутренним циклом по массиву, т.к. после первого прохода массив не будет отсортирован
            //но самый большой элемент в массиве будет перемещен в крайнюю правую позицию
            for (int j = array.length - 1; j > i; j--) {
                //проверяем порядок элементов, если порядок нарушен, меняем местами
                if (array[j] > array[i]) {
                    int tmp = array[i]; // создаем временную переменную для хранения значения
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
}
