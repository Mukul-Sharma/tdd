package strategy

/**
 * Created by mukul_sharma on 21/08/16.
 Built with Love
 */
class MergeSortStrategy extends BaseSortStrategy {

    @Override
    int[] sortImpl(int[] what) {
        int n = what.length - 1
        int half = n / 2
        int[] l1 = what[0..half]
        int[] l2 = what[(half + 1)..n]

        l1 = sort(l1)
        l2 = sort(l2)
        int[] merged = merge(l1, l2)

        merged.length.times {
            what[it] = merged[it]
        }

        return what
    }


    public static int[] merge(int[] a, int[] b) {
        if (null == a || null == b) {
            throw new Exception("Input cannot be null")
        }
        int[] mergeTarget = new int[a.length + b.length];

        int aIndex = 0
        int bIndex = 0
        int mergeIndex = 0;

        while (aIndex < a.length && bIndex < b.length) {
            if (a[aIndex] > b[bIndex]) {
                mergeTarget[mergeIndex] = b[bIndex]
                bIndex++
            } else {
                mergeTarget[mergeIndex] = a[aIndex]
                aIndex++
            }
            mergeIndex++
        }

        for (int i = aIndex; i < a.length; i++) {
            mergeTarget[mergeIndex] = a[i];
            mergeIndex++
        }

        for (int i = bIndex; i < b.length; i++) {
            mergeTarget[mergeIndex] = b[i];
            mergeIndex++
        }

        return mergeTarget

    }
}
