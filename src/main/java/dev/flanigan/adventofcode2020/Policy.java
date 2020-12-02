package dev.flanigan.adventofcode2020;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Policy {

  private int start;
  private int stop;
  private char letter;
  private String password;

  private Policy() {
  }

  public int getStart() {
    return start;
  }

  public void setStart(int start) {
    this.start = start;
  }

  public int getStop() {
    return stop;
  }

  public void setStop(int stop) {
    this.stop = stop;
  }

  public char getLetter() {
    return letter;
  }

  public void setLetter(char letter) {
    this.letter = letter;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public static Policy parsePolicy(String s) {
    String regex = "([0-9]*)-([0-9]*) ([a-z]): ([a-z]*)";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(s);

    if (!matcher.find()) {
      throw new IllegalArgumentException(String.format("Unable to parse policy: %s", s));
    }

    Policy policy = new Policy();
    policy.setStart(Integer.parseInt(matcher.group(1)));
    policy.setStop(Integer.parseInt(matcher.group(2)));
    policy.setLetter(matcher.group(3).charAt(0));
    policy.setPassword(matcher.group(4));
    return policy;
  }
}
