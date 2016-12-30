package Quaridor.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class VISITEDQuote {
  private static int hc = 0;
  private static VISITEDQuote instance = null;

  public VISITEDQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static VISITEDQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new VISITEDQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof VISITEDQuote;
  }

  public String toString() {

    return "<VISITED>";
  }
}
