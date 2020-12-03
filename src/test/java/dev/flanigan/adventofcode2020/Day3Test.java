package dev.flanigan.adventofcode2020;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.google.common.primitives.Chars;

public class Day3Test {

  private Day3 day3;
  private List<List<Character>> input;

  @Before
  public void setup() {
    day3 = new Day3();
    Loader<List<Character>> loader = new Loader<>();
    input = loader.loadInput("day3.txt", (s) -> Chars.asList(s.toCharArray()));
  }

  @Test
  public void partOne() {
    assertThat(day3.partOne(input)).isEqualTo(259L);
  }

  @Test
  public void partTwo() {
    assertThat(day3.partTwo(input)).isEqualTo(2224913600L);
  }
}
