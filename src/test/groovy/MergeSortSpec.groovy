import spock.lang.Specification
import strategy.MergeSortStrategy

/**
 * Created by mukul_sharma on 21/08/16.
 Built with Love
 */
class MergeSortSpec extends Specification {

 def "given two array merge is done correctly" () {

  when:
  int[] a = [1, 3, 4]
  int[] b = [2, 5, 6]

  int[] merged = MergeSortStrategy.merge(a, b)

  then: "Merge is done in sorted order"
  merged == [1, 2, 3, 4, 5, 6] as int[]
 }


}
