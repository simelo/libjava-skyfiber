/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package skycoin.libjava;

public class api__RichlistParams {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected api__RichlistParams(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(api__RichlistParams obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        skycoinJNI.delete_api__RichlistParams(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setN(long value) {
    skycoinJNI.api__RichlistParams_N_set(swigCPtr, this, value);
  }

  public long getN() {
    return skycoinJNI.api__RichlistParams_N_get(swigCPtr, this);
  }

  public void setIncludeDistribution(SWIGTYPE_p_BOOL value) {
    skycoinJNI.api__RichlistParams_IncludeDistribution_set(swigCPtr, this, SWIGTYPE_p_BOOL.getCPtr(value));
  }

  public SWIGTYPE_p_BOOL getIncludeDistribution() {
    return new SWIGTYPE_p_BOOL(skycoinJNI.api__RichlistParams_IncludeDistribution_get(swigCPtr, this), true);
  }

  public api__RichlistParams() {
    this(skycoinJNI.new_api__RichlistParams(), true);
  }

}
