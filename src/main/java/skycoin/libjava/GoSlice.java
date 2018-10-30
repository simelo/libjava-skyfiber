/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package skycoin.libjava;

public class GoSlice {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GoSlice(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GoSlice obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        skycoinJNI.delete_GoSlice(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int isEqual(GoSlice slice) {
    return skycoinJNI.GoSlice_isEqual(swigCPtr, this, GoSlice.getCPtr(slice), slice);
  }

  public void convertString(_GoString_ data) {
    skycoinJNI.GoSlice_convertString(swigCPtr, this, _GoString_.getCPtr(data), data);
  }

  public void setAtChar(char p, long i) {
    skycoinJNI.GoSlice_setAtChar(swigCPtr, this, p, i);
  }

  public void getString(_GoString_ out) {
    skycoinJNI.GoSlice_getString(swigCPtr, this, _GoString_.getCPtr(out), out);
  }

  public void setData(SWIGTYPE_p_void value) {
    skycoinJNI.GoSlice_data_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getData() {
    long cPtr = skycoinJNI.GoSlice_data_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setLen(long value) {
    skycoinJNI.GoSlice_len_set(swigCPtr, this, value);
  }

  public long getLen() {
    return skycoinJNI.GoSlice_len_get(swigCPtr, this);
  }

  public void setCap(long value) {
    skycoinJNI.GoSlice_cap_set(swigCPtr, this, value);
  }

  public long getCap() {
    return skycoinJNI.GoSlice_cap_get(swigCPtr, this);
  }

  public GoSlice() {
    this(skycoinJNI.new_GoSlice(), true);
  }

}
