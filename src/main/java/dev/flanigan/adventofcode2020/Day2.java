package dev.flanigan.adventofcode2020;

import java.util.Set;

public class Day2 {

  public long partOne(Set<Policy> policies) {
    return policies.stream().filter(policy -> {
      int count = 0;
      for (Character c : policy.getPassword().toCharArray()) {
        if (c.equals(policy.getLetter())) {
          count++;
        }
      }

      return count >= policy.getStart() && count <= policy.getStop();
    }).count();
  }

  public long partTwo(Set<Policy> policies) {
    return policies.stream().filter(policy -> {
      int count = 0;

      if (policy.getPassword().charAt(policy.getStart() - 1) == policy.getLetter()) {
        count++;
      }
      if (policy.getPassword().charAt(policy.getStop() - 1) == policy.getLetter()) {
        count++;
      }

      return count == 1;
    }).count();
  }
}
