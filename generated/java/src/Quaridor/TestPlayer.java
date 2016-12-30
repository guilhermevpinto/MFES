package Quaridor;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TestPlayer extends MyTest {
  public void test() {

    Player p1 = new Player(1L);
    Player p2 = new Player(2L);
    Point point = new Point(1L, 7L);
    Boolean andResult_47 = false;

    if (Utils.equals(p1.getPosition().getX(), point.getX())) {
      if (Utils.equals(p1.getPosition().getY(), point.getY())) {
        andResult_47 = true;
      }
    }

    assertTrue(andResult_47);

    point = new Point(17L, 11L);
    Boolean andResult_48 = false;

    if (Utils.equals(p2.getPosition().getX(), point.getX())) {
      if (Utils.equals(p2.getPosition().getY(), point.getY())) {
        andResult_48 = true;
      }
    }

    assertTrue(andResult_48);

    p1.setPosition(5L, 7L);
    Boolean andResult_49 = false;

    if (Utils.equals(p1.getPosition().getX(), 5L)) {
      if (Utils.equals(p1.getPosition().getY(), 7L)) {
        andResult_49 = true;
      }
    }

    assertTrue(andResult_49);
  }

  public TestPlayer() {}

  public String toString() {

    return "TestPlayer{}";
  }
}
