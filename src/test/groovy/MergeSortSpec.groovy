import spock.lang.Specification
import strategy.MergeSortStrategy

/**
 * Created by mukul_sharma on 21/08/16.
 Built with Love
 */
class MergeSortSpec extends Specification {

    MergeSortStrategy strategy = new MergeSortStrategy()

    def "given a small positive array, it should get sorted" () {
        when:

        int[] toSort = [3, 1, 2]
        strategy.sort(toSort)

        then: "Array is sorted"
        toSort == [1, 2, 3] as int[]
    }

    def "given a big positive array, it should get sorted" () {
        when:

        int[] toSort = [3, 1, 2, 4, 6, 3, 56, 3, 5, 2, 1, 6, 2, 1, 6, 1]
        strategy.sort(toSort)

        then: "Array is sorted"
        def sortedUsingApi = [3, 1, 2, 4, 6, 3, 56, 3, 5, 2, 1, 6, 2, 1, 6, 1] as int[]
        Arrays.sort(sortedUsingApi)
        toSort == sortedUsingApi
    }

    def "given that input is null exception is thrown" () {
        when:

        int[] toSort = null
        strategy.sort(toSort)

        then: "Exception is thrown"

        thrown Exception
    }

    def "given that input is zero or one item, original is returned" () {
        when :

        int[] empty = []
        int[] singleItem = [1]

        int[] emptySorted = strategy.sort(empty)
        int[] singleSorted = strategy.sort(singleItem)

        then: "Original array gets returned"

        empty == emptySorted
        singleItem == singleSorted

    }

    def "given a negative array, is should be sorted" () {
        when:

        int[] toSort = [-3, -1, -2]
        strategy.sort(toSort)

        then: "Array is sorted"
        toSort == [-3, -2, -1] as int[]
    }
}
