package Quaridor;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Game {
  private VDMSeq players = SeqUtil.seq();
  private Number currentPlayerID = 1L;
  private Board board;

  public void cg_init_Game_1() {

    players = SeqUtil.seq(new Player(1L), new Player(2L));
    currentPlayerID = 1L;
    board = new Board(this);
  }

  public Game() {

    cg_init_Game_1();
  }

  public void move(final Number new_x, final Number new_y, final Player player) {

    throw new UnsupportedOperationException();
  }

  public Board getBoard() {

    return this.board;
  }

  public void addWall(final Number row, final Number col) {

    board.addWall(row, col, Utils.copy(players));
  }

  public String toString() {

    return "Game{"
        + "players := "
        + Utils.toString(players)
        + ", currentPlayerID := "
        + Utils.toString(currentPlayerID)
        + ", board := "
        + Utils.toString(board)
        + "}";
  }
}
