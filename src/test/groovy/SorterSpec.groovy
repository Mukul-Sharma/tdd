import com.sun.xml.internal.bind.v2.model.annotation.Quick
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
}
