package exerc1;

public class BubbleSort {


    public static <T> void sort(Precedente<T>[] arr) {
        bubbleSort(arr);
    }

    public static <T> void bubbleSort(Precedente<T>[] arr) {

        int n = arr.length;
        boolean keepSorting;
        for (int i = 0; i < n-1; i++) {

            keepSorting = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].precedeA((T)arr[j + 1]) > 0) {
                    Precedente<T> temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    keepSorting = true;
                }
            }
            if (!keepSorting) break;
        }
    }


}
