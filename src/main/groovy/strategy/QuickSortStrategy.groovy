package strategy
/**
 * Created by mukuls-webonise on 19/8/16.
 */
class QuickSortStrategy extends BaseSortStrategy {

    @Override
    int[] sortImpl(int[] what) {
        sort(what, 0, what.length - 1)
        return what
    }

    private static void sort(int[] array, int low, int high) {
        if (low >= high)
            return;

        int pivot = pivot(array, low, high)

        int i = low, j = high;

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }

            sort(array, low, j)
            sort(array, i, high)
        }

    }

    public static int pivot(int[] array, int low, int high) {
        if (low > high || null == array || array.length < high - 1) throw new Exception("Invalid Arguments")
        int middle = low + ((high - low) / 2);
        int pivot = array[middle];
        return pivot
    }
}
