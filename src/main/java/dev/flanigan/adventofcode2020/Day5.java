package dev.flanigan.adventofcode2020;

import com.google.common.collect.ImmutableList;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Day5 {

    public long partOne(List<String> input) {
        return input.stream().mapToInt(this::calculateSeatId).max().getAsInt();
    }

    public long partTwo(List<String> input) {
        List<Integer> seatIds = input.stream().map(this::calculateSeatId).collect(ImmutableList.toImmutableList());

        int min = seatIds.stream().min(Comparator.naturalOrder()).get();
        int max = seatIds.stream().max(Comparator.naturalOrder()).get();

        int actual = seatIds.stream().mapToInt(Integer::valueOf).sum();
        int expected = IntStream.range(min, max + 1).sum();

        return expected - actual;
    }

    private int calculateSeatId(String seatCode) {
        String rowVals = seatCode.substring(0, 7);
        String seatVals = seatCode.substring(7);

        int row = evaluateRow(rowVals);
        int seat = evaluateSeat(seatVals);

        return (row * 8) + seat;
    }

    private int evaluateSeat(String seatVals) {
        int seat = 0;

        String reversedSeatVals = new StringBuffer(seatVals).reverse().toString();
        for (int i = 0; i < reversedSeatVals.length(); i++) {
            if (reversedSeatVals.charAt(i) == 'R') {
                seat += (int) Math.pow(2, i);
            }
        }

        return seat;
    }

    private int evaluateRow(String rowVals) {
        int seat = 0;

        String reversedRowVals = new StringBuffer(rowVals).reverse().toString();
        for (int i = 0; i < reversedRowVals.length(); i++) {
            if (reversedRowVals.charAt(i) == 'B') {
                seat += (int) Math.pow(2, i);
            }
        }

        return seat;
    }
}
