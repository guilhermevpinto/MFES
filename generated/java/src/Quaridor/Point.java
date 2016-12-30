package Quaridor;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Point {
  private Number x;
  private Number y;

  public void cg_init_Point_1(final Number x_input, final Number y_input) {

    x = x_input;
    y = y_input;
  }

  public Point(final Number x_input, final Number y_input) {

    cg_init_Point_1(x_input, y_input);
  }

  public void setPoint(final Number x_set, final Number y_set) {

    x = x_set;
    y = y_set;
  }

  public Number getX() {

    return x;
  }

  public Number getY() {

    return y;
  }

  public Point() {}

  public String toString() {

    return "Point{" + "x := " + Utils.toString(x) + ", y := " + Utils.toString(y) + "}";
  }
}
