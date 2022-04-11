package algorithmscomparator.algorithms;

import algorithmscomparator.IntegerArrayAlgorithm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Algorithm 4:
// Use Streams to find the max and min. Compute max – min
public class algorithm4 implements IntegerArrayAlgorithm {

    @Override
    public Integer run(Integer[] integers) {

        List<Integer> evenSorted = Arrays.stream(integers)
                .filter(integer -> integer % 2 == 0)
                .sorted(Integer::compareTo).toList();

        return evenSorted.get(evenSorted.size()-1) - evenSorted.get(0);
    }
}
