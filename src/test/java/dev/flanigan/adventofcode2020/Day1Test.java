package dev.flanigan.adventofcode2020;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class Day1Test {

  private Day1 day1;
  private Set<Integer> input;

  @Before
  public void setup() {
    day1 = new Day1();
    Loader<Integer> loader = new Loader<>();
    input = loader.loadInput("day1.txt", Integer::parseInt);
  }

  @Test
  public void partOne() {
    assertThat(day1.partOne(input)).isEqualTo(1007104);
  }

  @Test
  public void partTwo() {
    assertThat(day1.partTwo(input)).isEqualTo(18847752);
  }
}
