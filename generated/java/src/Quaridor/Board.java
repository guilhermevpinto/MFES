package Quaridor;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Board {
  private Game game;
  public static VDMSeq board =
      SeqUtil.seq(
          SeqUtil.seq(
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance()),
          SeqUtil.seq(
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance()),
          SeqUtil.seq(
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance()),
          SeqUtil.seq(
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance()),
          SeqUtil.seq(
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance()),
          SeqUtil.seq(
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance()),
          SeqUtil.seq(
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance()),
          SeqUtil.seq(
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance()),
          SeqUtil.seq(
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance()),
          SeqUtil.seq(
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance()),
          SeqUtil.seq(
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance()),
          SeqUtil.seq(
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance()),
          SeqUtil.seq(
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance()),
          SeqUtil.seq(
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance()),
          SeqUtil.seq(
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance()),
          SeqUtil.seq(
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance()),
          SeqUtil.seq(
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance(),
              Quaridor.quotes.NOWALLQuote.getInstance(),
              Quaridor.quotes.FREEQuote.getInstance()));
  public VDMSeq conectivity;

  public void cg_init_Board_1(final Game gameObj) {

    conectivity = Utils.copy(Board.board);
    game = gameObj;
  }

  public Board(final Game gameObj) {

    cg_init_Board_1(gameObj);
  }

  public Boolean resetConectivity() {

    conectivity = Utils.copy(Board.board);
    return true;
  }

  public void addWall(final Number row, final Number col, final VDMSeq players) {

    if (Utils.equals(Utils.mod(row.longValue(), 2L), 1L)) {
      Boolean andResult_4 = false;

      if (col.longValue() < 18L) {
        Boolean andResult_5 = false;

        if (row.longValue() < 16L) {
          Boolean andResult_6 = false;

          if (Utils.equals(
              Utils.get(((VDMSeq) Utils.get(board, row)), col),
              Quaridor.quotes.NOWALLQuote.getInstance())) {
            Boolean andResult_7 = false;

            if (Utils.equals(
                Utils.get(((VDMSeq) Utils.get(board, row.longValue() + 1L)), col),
                Quaridor.quotes.NOWALLQuote.getInstance())) {
              if (Utils.equals(
                  Utils.get(((VDMSeq) Utils.get(board, row.longValue() + 2L)), col),
                  Quaridor.quotes.NOWALLQuote.getInstance())) {
                andResult_7 = true;
              }
            }

            if (andResult_7) {
              andResult_6 = true;
            }
          }

          if (andResult_6) {
            andResult_5 = true;
          }
        }

        if (andResult_5) {
          andResult_4 = true;
        }
      }

      if (andResult_4) {
        Utils.mapSeqUpdate(
            board,
            row,
            SeqUtil.mod(
                Utils.copy(((VDMSeq) Utils.get(board, row))),
                MapUtil.map(new Maplet(col, Quaridor.quotes.WALLQuote.getInstance()))));
        Utils.mapSeqUpdate(
            board,
            row.longValue() + 1L,
            SeqUtil.mod(
                Utils.copy(((VDMSeq) Utils.get(board, row.longValue() + 1L))),
                MapUtil.map(new Maplet(col, Quaridor.quotes.WALLQuote.getInstance()))));
        Utils.mapSeqUpdate(
            board,
            row.longValue() + 2L,
            SeqUtil.mod(
                Utils.copy(((VDMSeq) Utils.get(board, row.longValue() + 2L))),
                MapUtil.map(new Maplet(col, Quaridor.quotes.WALLQuote.getInstance()))));
        Long exists1Counter_1 = 0L;
        VDMSeq set_1 = Utils.copy(players);
        for (Iterator iterator_1 = set_1.iterator();
            iterator_1.hasNext() && (exists1Counter_1.longValue() < 2L);
            ) {
          Player p = ((Player) iterator_1.next());
          Boolean andResult_8 = false;

          if (resetConectivity()) {
            if (!(pathToDestination(
                p.getTargetRow(), p.getPosition().getX(), p.getPosition().getY()))) {
              andResult_8 = true;
            }
          }

          if (andResult_8) {
            exists1Counter_1++;
          }
        }
        if (Utils.equals(exists1Counter_1, 1L)) {
          Utils.mapSeqUpdate(
              board,
              row,
              SeqUtil.mod(
                  Utils.copy(((VDMSeq) Utils.get(board, row))),
                  MapUtil.map(new Maplet(col, Quaridor.quotes.NOWALLQuote.getInstance()))));
          Utils.mapSeqUpdate(
              board,
              row.longValue() + 1L,
              SeqUtil.mod(
                  Utils.copy(((VDMSeq) Utils.get(board, row.longValue() + 1L))),
                  MapUtil.map(new Maplet(col, Quaridor.quotes.NOWALLQuote.getInstance()))));
          Utils.mapSeqUpdate(
              board,
              row.longValue() + 2L,
              SeqUtil.mod(
                  Utils.copy(((VDMSeq) Utils.get(board, row.longValue() + 2L))),
                  MapUtil.map(new Maplet(col, Quaridor.quotes.NOWALLQuote.getInstance()))));
        }
      }

    } else {
      Boolean andResult_9 = false;

      if (col.longValue() < 16L) {
        Boolean andResult_10 = false;

        if (row.longValue() < 18L) {
          Boolean andResult_11 = false;

          if (Utils.equals(
              Utils.get(((VDMSeq) Utils.get(board, row)), col),
              Quaridor.quotes.NOWALLQuote.getInstance())) {
            Boolean andResult_12 = false;

            if (Utils.equals(
                Utils.get(((VDMSeq) Utils.get(board, row)), col.longValue() + 1L),
                Quaridor.quotes.NOWALLQuote.getInstance())) {
              if (Utils.equals(
                  Utils.get(((VDMSeq) Utils.get(board, row)), col.longValue() + 2L),
                  Quaridor.quotes.NOWALLQuote.getInstance())) {
                andResult_12 = true;
              }
            }

            if (andResult_12) {
              andResult_11 = true;
            }
          }

          if (andResult_11) {
            andResult_10 = true;
          }
        }

        if (andResult_10) {
          andResult_9 = true;
        }
      }

      if (andResult_9) {
        Utils.mapSeqUpdate(
            board,
            row,
            SeqUtil.mod(
                Utils.copy(((VDMSeq) Utils.get(board, row))),
                MapUtil.map(
                    new Maplet(col, Quaridor.quotes.WALLQuote.getInstance()),
                    new Maplet(col.longValue() + 1L, Quaridor.quotes.WALLQuote.getInstance()),
                    new Maplet(col.longValue() + 2L, Quaridor.quotes.WALLQuote.getInstance()))));
        Long exists1Counter_2 = 0L;
        VDMSeq set_2 = Utils.copy(players);
        for (Iterator iterator_2 = set_2.iterator();
            iterator_2.hasNext() && (exists1Counter_2.longValue() < 2L);
            ) {
          Player p = ((Player) iterator_2.next());
          Boolean andResult_13 = false;

          if (resetConectivity()) {
            if (!(pathToDestination(
                p.getTargetRow(), p.getPosition().getX(), p.getPosition().getY()))) {
              andResult_13 = true;
            }
          }

          if (andResult_13) {
            exists1Counter_2++;
          }
        }
        if (Utils.equals(exists1Counter_2, 1L)) {
          Utils.mapSeqUpdate(
              board,
              row,
              SeqUtil.mod(
                  Utils.copy(((VDMSeq) Utils.get(board, row))),
                  MapUtil.map(
                      new Maplet(col, Quaridor.quotes.NOWALLQuote.getInstance()),
                      new Maplet(col.longValue() + 1L, Quaridor.quotes.NOWALLQuote.getInstance()),
                      new Maplet(
                          col.longValue() + 2L, Quaridor.quotes.NOWALLQuote.getInstance()))));
        }
      }
    }
  }

  private Boolean pathToDestination(final Number rowDest, final Number row, final Number col) {

    if (Utils.equals(row, rowDest)) {
      return true;
    }

    if (!(Utils.equals(
        Utils.get(((VDMSeq) Utils.get(conectivity, row)), col),
        Quaridor.quotes.FREEQuote.getInstance()))) {
      return false;
    }

    Utils.mapSeqUpdate(
        conectivity,
        row,
        SeqUtil.mod(
            Utils.copy(((VDMSeq) Utils.get(conectivity, row))),
            MapUtil.map(new Maplet(col, Quaridor.quotes.VISITEDQuote.getInstance()))));
    if (Utils.equals(row, 1L)) {
      if (Utils.equals(col, 1L)) {
        Boolean orResult_2 = false;

        if (checkRight(rowDest, row, col.longValue() + 1L)) {
          orResult_2 = true;
        } else {
          orResult_2 = checkDown(rowDest, row.longValue() + 1L, col);
        }

        return orResult_2;

      } else {
        if (Utils.equals(col, 17L)) {
          Boolean orResult_3 = false;

          if (checkLeft(rowDest, row, col.longValue() - 1L)) {
            orResult_3 = true;
          } else {
            orResult_3 = checkDown(rowDest, row.longValue() + 1L, col);
          }

          return orResult_3;

        } else {
          Boolean orResult_4 = false;

          if (checkLeft(rowDest, row, col.longValue() - 1L)) {
            orResult_4 = true;
          } else {
            Boolean orResult_5 = false;

            if (checkRight(rowDest, row, col.longValue() + 1L)) {
              orResult_5 = true;
            } else {
              orResult_5 = checkDown(rowDest, row.longValue() + 1L, col);
            }

            orResult_4 = orResult_5;
          }

          return orResult_4;
        }
      }
    }

    if (Utils.equals(row, 17L)) {
      if (Utils.equals(col, 1L)) {
        Boolean orResult_6 = false;

        if (checkRight(rowDest, row, col.longValue() + 1L)) {
          orResult_6 = true;
        } else {
          orResult_6 = checkUp(rowDest, row.longValue() - 1L, col);
        }

        return orResult_6;

      } else {
        if (Utils.equals(col, 17L)) {
          Boolean orResult_7 = false;

          if (checkLeft(rowDest, row, col.longValue() - 1L)) {
            orResult_7 = true;
          } else {
            orResult_7 = checkUp(rowDest, row.longValue() - 1L, col);
          }

          return orResult_7;

        } else {
          Boolean orResult_8 = false;

          if (checkLeft(rowDest, row, col.longValue() - 1L)) {
            orResult_8 = true;
          } else {
            Boolean orResult_9 = false;

            if (checkRight(rowDest, row, col.longValue() + 1L)) {
              orResult_9 = true;
            } else {
              orResult_9 = checkUp(rowDest, row.longValue() - 1L, col);
            }

            orResult_8 = orResult_9;
          }

          return orResult_8;
        }
      }
    }

    if (Utils.equals(col, 1L)) {
      Boolean orResult_10 = false;

      if (checkRight(rowDest, row, col.longValue() + 1L)) {
        orResult_10 = true;
      } else {
        Boolean orResult_11 = false;

        if (checkUp(rowDest, row.longValue() - 1L, col)) {
          orResult_11 = true;
        } else {
          orResult_11 = checkDown(rowDest, row.longValue() + 1L, col);
        }

        orResult_10 = orResult_11;
      }

      return orResult_10;

    } else {
      if (Utils.equals(col, 17L)) {
        Boolean orResult_12 = false;

        if (checkLeft(rowDest, row, col.longValue() - 1L)) {
          orResult_12 = true;
        } else {
          Boolean orResult_13 = false;

          if (checkUp(rowDest, row.longValue() - 1L, col)) {
            orResult_13 = true;
          } else {
            orResult_13 = checkDown(rowDest, row.longValue() + 1L, col);
          }

          orResult_12 = orResult_13;
        }

        return orResult_12;

      } else {
        Boolean orResult_14 = false;

        if (checkLeft(rowDest, row, col.longValue() - 1L)) {
          orResult_14 = true;
        } else {
          Boolean orResult_15 = false;

          if (checkRight(rowDest, row, col.longValue() + 1L)) {
            orResult_15 = true;
          } else {
            Boolean orResult_16 = false;

            if (checkUp(rowDest, row.longValue() - 1L, col)) {
              orResult_16 = true;
            } else {
              orResult_16 = checkDown(rowDest, row.longValue() + 1L, col);
            }

            orResult_15 = orResult_16;
          }

          orResult_14 = orResult_15;
        }

        return orResult_14;
      }
    }
  }

  private Boolean checkDown(final Number rowDest, final Number row, final Number col) {

    if (!(Utils.equals(
        Utils.get(((VDMSeq) Utils.get(conectivity, row)), col),
        Quaridor.quotes.WALLQuote.getInstance()))) {
      return pathToDestination(rowDest, row.longValue() + 1L, col);

    } else {
      return false;
    }
  }

  private Boolean checkUp(final Number rowDest, final Number row, final Number col) {

    if (!(Utils.equals(
        Utils.get(((VDMSeq) Utils.get(conectivity, row)), col),
        Quaridor.quotes.WALLQuote.getInstance()))) {
      return pathToDestination(rowDest, row.longValue() - 1L, col);

    } else {
      return false;
    }
  }

  private Boolean checkRight(final Number rowDest, final Number row, final Number col) {

    if (!(Utils.equals(
        Utils.get(((VDMSeq) Utils.get(conectivity, row)), col),
        Quaridor.quotes.WALLQuote.getInstance()))) {
      return pathToDestination(rowDest, row, col.longValue() + 1L);

    } else {
      return false;
    }
  }

  private Boolean checkLeft(final Number rowDest, final Number row, final Number col) {

    if (!(Utils.equals(
        Utils.get(((VDMSeq) Utils.get(conectivity, row)), col),
        Quaridor.quotes.WALLQuote.getInstance()))) {
      return pathToDestination(rowDest, row, col.longValue() - 1L);

    } else {
      return false;
    }
  }

  public VDMSeq getValidMoves(final Number row, final Number col) {

    VDMSeq result = SeqUtil.seq();
    Boolean andResult_20 = false;

    if (Utils.equals(row, 1L)) {
      if (Utils.equals(
          Utils.get(((VDMSeq) Utils.get(board, row.longValue() + 1L)), col),
          Quaridor.quotes.NOWALLQuote.getInstance())) {
        andResult_20 = true;
      }
    }

    if (andResult_20) {
      if (Utils.equals(
          Utils.get(((VDMSeq) Utils.get(board, row.longValue() + 2L)), col),
          Quaridor.quotes.OCCUPIEDQuote.getInstance())) {
        VDMSeq temp = getAdvancedMoves(row.longValue() + 2L, col);
        result = SeqUtil.conc(Utils.copy(result), Utils.copy(temp));

      } else {
        result =
            SeqUtil.conc(Utils.copy(result), SeqUtil.seq(SeqUtil.seq(row.longValue() + 2L, col)));
      }
    }

    return Utils.copy(result);
  }

  private VDMSeq getAdvancedMoves(final Number row, final Number col) {

    return SeqUtil.seq(SeqUtil.seq(1L, 1L));
  }

  public Board() {}

  public String toString() {

    return "Board{"
        + "game := "
        + Utils.toString(game)
        + ", board := "
        + Utils.toString(board)
        + ", conectivity := "
        + Utils.toString(conectivity)
        + "}";
  }
}
