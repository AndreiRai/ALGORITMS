package SortAlgoritm;

import java.util.Random;

public class SortAlgorithm {

    public class BogoSortAlgorithm extends SortAlgorithm {

        //Если есть массив, значит его можно отсортировать
        public void sort(int data[]) throws Exception {
            if (data.length > 0) runBogoSort(data);
        }

        //А вот и сортировочное болото
        private void runBogoSort(int data[]) throws Exception {

            Random generator;
            int tempVariable;
            int randomPosition;

            do {

                generator = new Random();

                for (int i = 0; i < data.length; i++) {

                    randomPosition = generator.nextInt(data.length);
                    tempVariable = data[i];
                    data[i] = data[randomPosition];
                    data[randomPosition] = tempVariable;
                    pause(i,randomPosition);

                }

            } while(!isSorted(data)); //Пока не отсортируем

        }

        private void pause(int i, int randomPosition) {
        }

        //Проверяем, отсортирован ли массив
        private boolean isSorted(int data[]) {

            for (int i = 1; i < data.length; i++)
                if (data[i] < data[i - 1]) return false;

            return true;

        }

    }

}
//Algoritms