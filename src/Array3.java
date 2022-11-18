import java.util.Arrays;

public class Array3 {


    public static void main(String[] args) {
        int[] array3 = {24, -66, 30, 6, 99, 55, 77};
        sortArray3(array3);
//создали массив array3, который хотим отсортировать.
//        boolean elSorted = false;
//        // также создали переменную elSorted, которая покажет, отсортирован ли уже массив или нет.
//        int tmp;
//        //создали переменную tmp, которая нам нужна при обмене
//
//        while (!elSorted) {
//            // создали цикл while, который будет делать проход за проходом
//            //  и если массив  уже отсортирован, мы сделаем  проход для того,
//            //  чтобы убедиться, что ни одного обмена не было
//            // действием в цикле будет установка значения в true
//            // дальше попарно сравнивааются все элементы массива.
//
//            elSorted = true;
//            for (int i = 0; i < array3.length - 1; i++) {
//                //В цикле for проверяем, больше ли i-й элемент, чем элемент i+1
//                if (array3[i] < array3[i + 1]) {
//                    // по тому же принципу, только знак <
//                    elSorted = false;
////Если да, то обьявляется false (есть обмен, поэтому массив все еще не отсортирован)
//                    //это возможно только при отсутствии того, что array2[i] > array2[i + 1]
//                    tmp = array3[i];
//                    //делаем обмен через созданную ранее переменную tmp
//                    array3[i] = array3[i + 1];
//                    array3[i + 1] = tmp;

//                }
//            }
////        }// //цикл while будет работать,
//        // пока переменная elSorted будет в положении false на момент окончания попарной проверки.
//        //то есть до отсутствия обменов.
//        System.out.println(Arrays.toString(array3));
//    }
//}
    }


    public static void sortArray3(int[] array3) {
        boolean elSorted = false;
        int tmp;
        while (!elSorted) {
            elSorted = true;
            for (int i = 0; i < array3.length - 1; i++) {
                if (array3[i] < array3[i + 1]) {
                    elSorted = false;
                    tmp = array3[i];
                    array3[i] = array3[i + 1];
                    array3[i + 1] = tmp;


                }
            }
        }
        System.out.println(Arrays.toString(array3));
    }

}



