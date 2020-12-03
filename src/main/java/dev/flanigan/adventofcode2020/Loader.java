package dev.flanigan.adventofcode2020;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;
import java.util.function.Function;

import com.google.common.collect.ImmutableList;

public class Loader<E> {

  public List<E> loadInput(String filename, Function<String, E> parser) {
    try (
        InputStream inputStream = ClassLoader.getSystemResourceAsStream(filename);
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader)) {
      return bufferedReader.lines().map(parser).collect(ImmutableList.toImmutableList());
    } catch (IOException e) {
      e.printStackTrace();
    }

    return ImmutableList.of();
  }
}
