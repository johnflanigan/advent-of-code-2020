package dev.flanigan.adventofcode2020;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Set;
import java.util.function.Function;

import com.google.common.collect.ImmutableSet;

public class Loader<E> {

  public Set<E> loadInput(String filename, Function<String, E> parser) {
    try (
        InputStream inputStream = ClassLoader.getSystemResourceAsStream(filename);
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader)) {
      return bufferedReader.lines().map(parser).collect(ImmutableSet.toImmutableSet());
    } catch (IOException e) {
      e.printStackTrace();
    }

    return ImmutableSet.of();
  }
}
