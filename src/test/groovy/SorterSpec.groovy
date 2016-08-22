import sorter.Sorter
import spock.lang.Specification
import strategy.MergeSortStrategy
import strategy.QuickSortStrategy
import strategy.SortingStrategy

/**
 * Created by mukul_sharma on 21/08/16.
 Built with Love
 */
class SorterSpec extends Specification {

    def "given a sorting strategy it should be set properly"() {
        when:

        SortingStrategy strategy = new MergeSortStrategy()
        Sorter sorter = new Sorter(strategy)

        then:
        (sorter.strategy instanceof MergeSortStrategy)

    }

    def "given a sorter, strategy can be changed at runtime"() {

        when:

        SortingStrategy strategy = new MergeSortStrategy()
        Sorter sorter = new Sorter(strategy)

        sorter.setStrategy(new QuickSortStrategy())

        then:
        (sorter.strategy instanceof QuickSortStrategy)
    }

    def "given a sorter, it should call sort method of strategy when sort is called" () {
        int[] input = [1]
        SortingStrategy strategy =  Mock(SortingStrategy)
        strategy.sort(input) >> {input}

        when:
        Sorter sorter = new Sorter(strategy)
        sorter.sort(input)

        then:
        1 * strategy.sort(input)

    }
}
