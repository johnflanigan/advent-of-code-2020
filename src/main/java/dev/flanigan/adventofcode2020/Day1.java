package dev.flanigan.adventofcode2020;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashSet;
import java.util.Set;

import com.google.common.collect.ImmutableSet;

public class Day1 {

  private static final int SUM = 2020;

  public void run() {
    InputStream inputStream = ClassLoader.getSystemResourceAsStream("day1_input.txt");
    Reader reader = new InputStreamReader(inputStream);
    BufferedReader bufferedReader = new BufferedReader(reader);

    Set<Integer> input = bufferedReader.lines().map(Integer::parseInt).collect(ImmutableSet.toImmutableSet());

    System.out.printf("Part one solution: %d%n", twoSum(input, SUM));
    System.out.printf("Part two solution: %d%n", threeSum(input, SUM));
  }

  public int twoSum(Set<Integer> input, int sum) {
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
