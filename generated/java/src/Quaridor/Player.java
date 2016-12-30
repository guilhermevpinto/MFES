package Quaridor;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Player {
  private Number numberID;
  private Point position;
  private Number walls = 10L;
  private Number targetRow;

  public void cg_init_Player_1(final Number id) {

    if (Utils.equals(id, 1L)) {
      position = new Point(1L, 7L);
      targetRow = 17L;
      numberID = id;

    } else {
      if (Utils.equals(id, 2L)) {
        position = new Point(17L, 11L);
        targetRow = 1L;
        numberID = id;
      }
    }
  }

  public Player(final Number id) {

    cg_init_Player_1(id);
  }

  public Point getPosition() {

    return position;
  }

  public void setPosition(final Number new_x, final Number new_y) {

    position = new Point(new_x, new_y);
  }

  public Number getTargetRow() {

    return this.targetRow;
  }

  public Player() {}

  public String toString() {

    return "Player{"
        + "numberID := "
        + Utils.toString(numberID)
        + ", position := "
        + Utils.toString(position)
        + ", walls := "
        + Utils.toString(walls)
        + ", targetRow := "
        + Utils.toString(targetRow)
        + "}";
  }
}
