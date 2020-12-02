package dev.flanigan.adventofcode2020;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class Day2Test {

  private Day2 day2;
  private Set<Policy> input;

  @Before
  public void setup() {
    day2 = new Day2();
    Loader<Policy> loader = new Loader<>();
    input = loader.loadInput("day2.txt", Policy::parsePolicy);
  }

  @Test
  public void partOne() {
    assertThat(day2.partOne(input)).isEqualTo(569);
  }

  @Test
  public void partTwo() {
    assertThat(day2.partTwo(input)).isEqualTo(346);
  }
}
