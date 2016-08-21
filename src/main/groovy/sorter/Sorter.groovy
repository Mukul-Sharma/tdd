package sorter

import strategy.MergeSortStrategy
import strategy.SortingStrategy

/**
 * Created by mukuls-webonise on 19/8/16.
 */
class Sorter {

    SortingStrategy strategy;

    Sorter(SortingStrategy strategy) {
        this.strategy = strategy
    }

    void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy
    }

    def sort(int[] array) {
        strategy.sort(array)
    }
}
