package Quaridor.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class NOWALLQuote {
  private static int hc = 0;
  private static NOWALLQuote instance = null;

  public NOWALLQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static NOWALLQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new NOWALLQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof NOWALLQuote;
  }

  public String toString() {

    return "<NOWALL>";
  }
}
