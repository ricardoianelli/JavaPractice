package algorithmscomparator.algorithms;


import algorithmscomparator.IntegerArrayAlgorithm;

// Algorithm 2:
// Use a nested loop to solve the problem without creating an extra array.
public class algorithm2 implements IntegerArrayAlgorithm {

    @Override
    public Integer run(Integer[] integers) {
        int maxDifference = 0;

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 != 0)
                continue;

            int currentDifference;

            for (int j = 0; j < integers.length; j++) {
                if (i == j || integers[j] % 2 != 0 || integers[i] < integers[j])
                    continue;

                currentDifference = integers[i] - integers[j];

                if (currentDifference > maxDifference)
                    maxDifference = currentDifference;
            }
        }

        return maxDifference;
    }
}
