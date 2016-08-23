import spock.lang.Specification
import strategy.MergeSortStrategy

/**
 * Created by mukuls-webonise on 23/8/16.
 */
class MergerSpec extends Specification {


    def "given any of input is null exception is thrown" () {

        when:
        int[] a = [1, 2]
        int[] b = null

        MergeSortStrategy.merge(a, b)

        then:
        thrown Exception
    }

    def "given two arrays of length m and n array of length m + n is returned" () {
        when:
        int[] a = [1, 3]
        int[] b = [2, 4]

        int[] c = MergeSortStrategy.merge(a, b)
        then : "array of length m + n is returned"
        c.length == a.length + b.length
    }

    def "given two array merge is done correctly"() {

        when:
        int[] a = [1, 3, 4]
        int[] b = [2, 5, 6]

        int[] merged = MergeSortStrategy.merge(a, b)

        then: "Merge is done in sorted order"
        merged == [1, 2, 3, 4, 5, 6] as int[]
    }
}
