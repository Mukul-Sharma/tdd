import spock.lang.Specification
import strategy.QuickSortStrategy

/**
 * Created by mukuls-webonise on 23/8/16.
 */
class PivoterSpec extends Specification {

    def "given when input is null then exception is thrown" () {
        when:

        QuickSortStrategy.pivot(null, 1, 0)

        then: "Exception is thrown"

        thrown Exception
    }

    def "given an incorrect start or end pivot should throw exception" () {
        when:

        QuickSortStrategy.pivot(new int[2], 1, 0)

        then: "Exception is thrown"

        thrown Exception
    }

    def "given an array pivot should be middle element b/w start and end" () {
        when:

        int[] toSort = [3, 1, 2, 4, 5]
        int pivot = QuickSortStrategy.pivot(toSort, 0, 4)

        then: "Pivot is 2"
        pivot == 2
    }
}
