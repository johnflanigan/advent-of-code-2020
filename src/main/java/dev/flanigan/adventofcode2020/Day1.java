package dev.flanigan.adventofcode2020;

import java.util.HashSet;
import java.util.Set;

public class Day1 {

  private static final int SUM = 2020;

  public long partOne(Set<Integer> input) {
    return twoSum(input, SUM);
  }

  public long partTwo(Set<Integer> input) {
    return threeSum(input, SUM);
  }

  private int twoSum(Set<Integer> input, int sum) {
    Set<Integer> set = new HashSet<>();

    for (int current : input) {
      if (set.contains(sum - current)) {
        return (sum - current) * current;
      } else {
        set.add(current);
      }
    }

    return -1;
  }

  private int threeSum(Set<Integer> input, int sum) {
    for (int current : input) {
      Set<Integer> copy = new HashSet<>(input);
      copy.remove(current);

      int solution = twoSum(copy, sum - current);
      if (solution != -1) {
        return current * solution;
      }
    }

    return -1;
  }
}
