package algorithmscomparator.algorithms;

import algorithmscomparator.IntegerArrayAlgorithm;

// Algorithm 3:
// Use one loop. Find max and min of even integers. Compute max – min
public class algorithm3 implements IntegerArrayAlgorithm {

    @Override
    public Integer run(Integer[] integers) {
        
        Integer min = Integer.MAX_VALUE;
        Integer max = Integer.MIN_VALUE;

        for (Integer integer : integers) {
            if (integer % 2 != 0)
                continue;

            if (integer < min)
                min = integer;
            if (integer > max)
                max = integer;
        }

        return max-min;
    }
}
