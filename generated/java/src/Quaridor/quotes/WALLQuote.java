package Quaridor.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class WALLQuote {
  private static int hc = 0;
  private static WALLQuote instance = null;

  public WALLQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static WALLQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new WALLQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof WALLQuote;
  }

  public String toString() {

    return "<WALL>";
  }
}
