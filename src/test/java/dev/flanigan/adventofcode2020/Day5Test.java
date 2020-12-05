package dev.flanigan.adventofcode2020;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Day5Test {

    private Day5 day5;
    private List<String> input;

    @Before
    public void setup() {
        day5 = new Day5();
        Loader<String> loader = new Loader<>();
        input = loader.loadInput("day5.txt", (s) -> s);
    }

    @Test
    public void partOne() {
        assertThat(day5.partOne(input)).isEqualTo(828L);
    }

    @Test
    public void partTwo() {
        assertThat(day5.partTwo(input)).isEqualTo(565L);
    }
}
