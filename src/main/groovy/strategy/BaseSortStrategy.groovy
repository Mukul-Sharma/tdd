package strategy

/**
 * Created by mukuls-webonise on 19/8/16.
 */
abstract class BaseSortStrategy implements SortingStrategy {
    @Override
    int[] sort(int[] what) {
        if (null == what) {
            throw new IllegalArgumentException("Array cannot be null or empty")
        }
        if (what.length < 2) {
            return what
        }
        return sortImpl(what)
    }

    abstract int[] sortImpl(int[] what)
}
