package Quaridor;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TestMain {
  public static void main() {

    new TestPoint().test();
    new TestPlayer().test();
    new TestBoard().test();
  }

  public TestMain() {}

  public String toString() {

    return "TestMain{}";
  }
}
