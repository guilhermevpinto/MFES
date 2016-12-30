package Quaridor.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class OCCUPIEDQuote {
  private static int hc = 0;
  private static OCCUPIEDQuote instance = null;

  public OCCUPIEDQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static OCCUPIEDQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new OCCUPIEDQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof OCCUPIEDQuote;
  }

  public String toString() {

    return "<OCCUPIED>";
  }
}
