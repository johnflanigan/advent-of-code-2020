package dev.flanigan.adventofcode2020;

import java.util.List;

public class Day3 {

  public long partOne(List<List<Character>> input) {
    return traverse(input, 3, 1);
  }

  public long partTwo(List<List<Character>> input) {
    return traverse(input, 1, 1) * traverse(input, 3, 1) * traverse(input, 5, 1) * traverse(input, 7, 1) * traverse(input, 1, 2);
  }

  public long traverse(List<List<Character>> input, int right, int down) {
    int index = 0;
    long hits = 0;

    for (int i = 0; i < input.size(); i += down) {
      List<Character> row = input.get(i);

      index = index % row.size();
      if (row.get(index).equals('#')) {
        hits++;
      }
      index += right;
    }

    return hits;
  }
}
