public class GetMinMaxElement {
    static int getMaxElement(int[] arr, int index) {
        int max;
        int length = arr.length;

        if (length > index) {
            max = getMaxElement(arr, index + 1);
            if (arr[index] > max)
                return arr[index];
            else
                return max;

        } else {
            return arr[index - 1];
        }
    }

    static int getMinElement(int[] arr, int index) {
        int min;
        int length = arr.length;

        if (length > index) {
            min = getMinElement(arr, index + 1);
            if (arr[index] < min)
                return arr[index];
            else
                return min;

        } else {
            return arr[index - 1];
        }
    }
}
//A