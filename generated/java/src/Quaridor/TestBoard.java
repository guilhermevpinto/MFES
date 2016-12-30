package Quaridor;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TestBoard extends MyTest {
  private Board board;

  public void test() {

    testConstructor();
    testResetConectivity();
    testAddWall();
  }

  private void testConstructor() {

    board = new Board(new Game());
    assertTrue(Utils.equals(board.board.size(), 17L));
    Boolean forAllExpResult_1 = true;
    VDMSeq set_3 = board.board;
    for (Iterator iterator_3 = set_3.iterator(); iterator_3.hasNext() && forAllExpResult_1; ) {
      VDMSeq s = ((VDMSeq) iterator_3.next());
      forAllExpResult_1 = Utils.equals(s.size(), 17L);
    }
    assertTrue(forAllExpResult_1);

    assertEqual(board.board, board.conectivity);
  }

  private void testResetConectivity() {

    board = new Board(new Game());
    board.conectivity = SeqUtil.seq();
    assertNotEqual(board.board, board.conectivity);
    assertTrue(board.resetConectivity());
    assertEqual(board.board, board.conectivity);
  }

  private void testAddWall() {

    board = new Board(new Game());
    board.addWall(1L, 6L, SeqUtil.seq(new Player(1L), new Player(2L)));
    Boolean andResult_29 = false;

    if (Utils.equals(
        Utils.get(((VDMSeq) Utils.get(board.board, 1L)), 6L),
        Quaridor.quotes.WALLQuote.getInstance())) {
      Boolean andResult_30 = false;

      if (Utils.equals(
          Utils.get(((VDMSeq) Utils.get(board.board, 2L)), 6L),
          Quaridor.quotes.WALLQuote.getInstance())) {
        if (Utils.equals(
            Utils.get(((VDMSeq) Utils.get(board.board, 3L)), 6L),
            Quaridor.quotes.WALLQuote.getInstance())) {
          andResult_30 = true;
        }
      }

      if (andResult_30) {
        andResult_29 = true;
      }
    }

    assertTrue(andResult_29);

    board.addWall(3L, 6L, SeqUtil.seq(new Player(1L), new Player(2L)));
    Boolean andResult_31 = false;

    if (Utils.equals(
        Utils.get(((VDMSeq) Utils.get(board.board, 3L)), 6L),
        Quaridor.quotes.WALLQuote.getInstance())) {
      Boolean andResult_32 = false;

      if (Utils.equals(
          Utils.get(((VDMSeq) Utils.get(board.board, 4L)), 6L),
          Quaridor.quotes.NOWALLQuote.getInstance())) {
        if (Utils.equals(
            Utils.get(((VDMSeq) Utils.get(board.board, 5L)), 6L),
            Quaridor.quotes.NOWALLQuote.getInstance())) {
          andResult_32 = true;
        }
      }

      if (andResult_32) {
        andResult_31 = true;
      }
    }

    assertTrue(andResult_31);

    board.addWall(2L, 7L, SeqUtil.seq(new Player(1L), new Player(2L)));
    Boolean andResult_33 = false;

    if (Utils.equals(
        Utils.get(((VDMSeq) Utils.get(board.board, 2L)), 7L),
        Quaridor.quotes.WALLQuote.getInstance())) {
      Boolean andResult_34 = false;

      if (Utils.equals(
          Utils.get(((VDMSeq) Utils.get(board.board, 2L)), 8L),
          Quaridor.quotes.WALLQuote.getInstance())) {
        if (Utils.equals(
            Utils.get(((VDMSeq) Utils.get(board.board, 2L)), 9L),
            Quaridor.quotes.WALLQuote.getInstance())) {
          andResult_34 = true;
        }
      }

      if (andResult_34) {
        andResult_33 = true;
      }
    }

    assertTrue(andResult_33);

    board.addWall(1L, 10L, SeqUtil.seq(new Player(1L), new Player(2L)));
    Boolean andResult_35 = false;

    if (Utils.equals(
        Utils.get(((VDMSeq) Utils.get(board.board, 1L)), 10L),
        Quaridor.quotes.NOWALLQuote.getInstance())) {
      Boolean andResult_36 = false;

      if (Utils.equals(
          Utils.get(((VDMSeq) Utils.get(board.board, 2L)), 10L),
          Quaridor.quotes.NOWALLQuote.getInstance())) {
        if (Utils.equals(
            Utils.get(((VDMSeq) Utils.get(board.board, 3L)), 10L),
            Quaridor.quotes.NOWALLQuote.getInstance())) {
          andResult_36 = true;
        }
      }

      if (andResult_36) {
        andResult_35 = true;
      }
    }

    assertTrue(andResult_35);

    board.addWall(2L, 9L, SeqUtil.seq(new Player(1L), new Player(2L)));
    Boolean andResult_37 = false;

    if (Utils.equals(
        Utils.get(((VDMSeq) Utils.get(board.board, 2L)), 9L),
        Quaridor.quotes.WALLQuote.getInstance())) {
      Boolean andResult_38 = false;

      if (Utils.equals(
          Utils.get(((VDMSeq) Utils.get(board.board, 2L)), 10L),
          Quaridor.quotes.NOWALLQuote.getInstance())) {
        if (Utils.equals(
            Utils.get(((VDMSeq) Utils.get(board.board, 2L)), 11L),
            Quaridor.quotes.NOWALLQuote.getInstance())) {
          andResult_38 = true;
        }
      }

      if (andResult_38) {
        andResult_37 = true;
      }
    }

    assertTrue(andResult_37);

    board.addWall(15L, 8L, SeqUtil.seq(new Player(1L), new Player(2L)));
    Boolean andResult_39 = false;

    if (Utils.equals(
        Utils.get(((VDMSeq) Utils.get(board.board, 15L)), 8L),
        Quaridor.quotes.WALLQuote.getInstance())) {
      Boolean andResult_40 = false;

      if (Utils.equals(
          Utils.get(((VDMSeq) Utils.get(board.board, 16L)), 8L),
          Quaridor.quotes.WALLQuote.getInstance())) {
        if (Utils.equals(
            Utils.get(((VDMSeq) Utils.get(board.board, 17L)), 8L),
            Quaridor.quotes.WALLQuote.getInstance())) {
          andResult_40 = true;
        }
      }

      if (andResult_40) {
        andResult_39 = true;
      }
    }

    assertTrue(andResult_39);

    board.addWall(16L, 9L, SeqUtil.seq(new Player(1L), new Player(2L)));
    Boolean andResult_41 = false;

    if (Utils.equals(
        Utils.get(((VDMSeq) Utils.get(board.board, 16L)), 9L),
        Quaridor.quotes.WALLQuote.getInstance())) {
      Boolean andResult_42 = false;

      if (Utils.equals(
          Utils.get(((VDMSeq) Utils.get(board.board, 16L)), 10L),
          Quaridor.quotes.WALLQuote.getInstance())) {
        if (Utils.equals(
            Utils.get(((VDMSeq) Utils.get(board.board, 16L)), 11L),
            Quaridor.quotes.WALLQuote.getInstance())) {
          andResult_42 = true;
        }
      }

      if (andResult_42) {
        andResult_41 = true;
      }
    }

    assertTrue(andResult_41);

    board.addWall(16L, 12L, SeqUtil.seq(new Player(1L), new Player(2L)));
    Boolean andResult_43 = false;

    if (Utils.equals(
        Utils.get(((VDMSeq) Utils.get(board.board, 16L)), 12L),
        Quaridor.quotes.WALLQuote.getInstance())) {
      Boolean andResult_44 = false;

      if (Utils.equals(
          Utils.get(((VDMSeq) Utils.get(board.board, 16L)), 13L),
          Quaridor.quotes.WALLQuote.getInstance())) {
        if (Utils.equals(
            Utils.get(((VDMSeq) Utils.get(board.board, 16L)), 14L),
            Quaridor.quotes.WALLQuote.getInstance())) {
          andResult_44 = true;
        }
      }

      if (andResult_44) {
        andResult_43 = true;
      }
    }

    assertTrue(andResult_43);

    board.addWall(16L, 15L, SeqUtil.seq(new Player(1L), new Player(2L)));
    Boolean andResult_45 = false;

    if (Utils.equals(
        Utils.get(((VDMSeq) Utils.get(board.board, 16L)), 15L),
        Quaridor.quotes.NOWALLQuote.getInstance())) {
      Boolean andResult_46 = false;

      if (Utils.equals(
          Utils.get(((VDMSeq) Utils.get(board.board, 16L)), 16L),
          Quaridor.quotes.NOWALLQuote.getInstance())) {
        if (Utils.equals(
            Utils.get(((VDMSeq) Utils.get(board.board, 16L)), 17L),
            Quaridor.quotes.NOWALLQuote.getInstance())) {
          andResult_46 = true;
        }
      }

      if (andResult_46) {
        andResult_45 = true;
      }
    }

    assertTrue(andResult_45);
  }

  public TestBoard() {}

  public String toString() {

    return "TestBoard{" + "board := " + Utils.toString(board) + "}";
  }
}
