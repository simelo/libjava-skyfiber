/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class coin__UxHead {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected coin__UxHead(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(coin__UxHead obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        skycoinJNI.delete_coin__UxHead(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTime(SWIGTYPE_p_GoUint64_ value) {
    skycoinJNI.set_coin__UxHead_Time(swigCPtr, this, SWIGTYPE_p_GoUint64_.getCPtr(value));
  }

  public SWIGTYPE_p_GoUint64_ getTime() {
    return new SWIGTYPE_p_GoUint64_(skycoinJNI.get_coin__UxHead_Time(swigCPtr, this), true);
  }

  public void setBkSeq(SWIGTYPE_p_GoUint64_ value) {
    skycoinJNI.set_coin__UxHead_BkSeq(swigCPtr, this, SWIGTYPE_p_GoUint64_.getCPtr(value));
  }

  public SWIGTYPE_p_GoUint64_ getBkSeq() {
    return new SWIGTYPE_p_GoUint64_(skycoinJNI.get_coin__UxHead_BkSeq(swigCPtr, this), true);
  }

  public coin__UxHead() {
    this(skycoinJNI.new_coin__UxHead(), true);
  }

}