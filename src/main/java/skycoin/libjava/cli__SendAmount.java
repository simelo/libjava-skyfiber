/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package skycoin.libjava;

public class cli__SendAmount {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected cli__SendAmount(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(cli__SendAmount obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        skycoinJNI.delete_cli__SendAmount(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setAddr(SWIGTYPE_p_GoString_ value) {
    skycoinJNI.cli__SendAmount_Addr_set(swigCPtr, this, SWIGTYPE_p_GoString_.getCPtr(value));
  }

  public SWIGTYPE_p_GoString_ getAddr() {
    return new SWIGTYPE_p_GoString_(skycoinJNI.cli__SendAmount_Addr_get(swigCPtr, this), true);
  }

  public void setCoins(long value) {
    skycoinJNI.cli__SendAmount_Coins_set(swigCPtr, this, value);
  }

  public long getCoins() {
    return skycoinJNI.cli__SendAmount_Coins_get(swigCPtr, this);
  }

  public cli__SendAmount() {
    this(skycoinJNI.new_cli__SendAmount(), true);
  }

}
