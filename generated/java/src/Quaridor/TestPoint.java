package Quaridor;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TestPoint extends MyTest {
  public void test() {

    Point point = new Point(1L, 2L);
    assertTrue(Utils.equals(point.getX(), 1L));
    assertTrue(Utils.equals(point.getY(), 2L));
    point.setPoint(2L, 1L);
    Boolean andResult_50 = false;

    if (Utils.equals(point.getX(), 2L)) {
      if (Utils.equals(point.getY(), 1L)) {
        andResult_50 = true;
      }
    }

    assertTrue(andResult_50);
  }

  public TestPoint() {}

  public String toString() {

    return "TestPoint{}";
  }
}
