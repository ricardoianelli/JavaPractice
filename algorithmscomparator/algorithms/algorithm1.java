package algorithmscomparator.algorithms;


import algorithmscomparator.IntegerArrayAlgorithm;

// Algorithm 1:
// Create a new array consisting of even numbers only. Then use nested loops to solve the problem using
// the newly created array of even numbers only.
public class algorithm1 implements IntegerArrayAlgorithm {

    @Override
    public Integer run(Integer[] integers) {

        Integer[] evens = new Integer[integers.length];

        int totalEvens = 0;
        for (Integer integer: integers) {
            if (integer % 2 == 0) {
                evens[totalEvens] = integer;
                totalEvens++;
            }
        }

        int maxDifference = 0;
        for (int i = 0; i < totalEvens; i++) {
            int currentDifference;

            for (int j = 0; j < totalEvens; j++) {
                if (i == j || evens[i] < evens[j]) continue;

                currentDifference = evens[i] - evens[j];

                if (currentDifference > maxDifference)
                    maxDifference = currentDifference;
            }
        }

        return maxDifference;
    }
}
