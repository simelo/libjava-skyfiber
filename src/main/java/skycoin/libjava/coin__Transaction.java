/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package skycoin.libjava;

public class coin__Transaction {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected coin__Transaction(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(coin__Transaction obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        skycoinJNI.delete_coin__Transaction(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int isEqual(coin__Transaction t) {
    return skycoinJNI.coin__Transaction_isEqual(swigCPtr, this, coin__Transaction.getCPtr(t), t);
  }

  public int setInnerHash(cipher_SHA256 h) {
    return skycoinJNI.coin__Transaction_setInnerHash(swigCPtr, this, cipher_SHA256.getCPtr(h), h);
  }

  public void setLength(int value) {
    skycoinJNI.coin__Transaction_Length_set(swigCPtr, this, value);
  }

  public int getLength() {
    return skycoinJNI.coin__Transaction_Length_get(swigCPtr, this);
  }

  public void setType(byte value) {
    skycoinJNI.coin__Transaction_Type_set(swigCPtr, this, value);
  }

  public byte getType() {
    return skycoinJNI.coin__Transaction_Type_get(swigCPtr, this);
  }

  public void setInnerHash(SWIGTYPE_p_GoUint8_ value) {
    skycoinJNI.coin__Transaction_InnerHash_set(swigCPtr, this, SWIGTYPE_p_GoUint8_.getCPtr(value));
  }

  public SWIGTYPE_p_GoUint8_ getInnerHash() {
    long cPtr = skycoinJNI.coin__Transaction_InnerHash_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_GoUint8_(cPtr, false);
  }

  public void setSigs(SWIGTYPE_p_GoSlice_ value) {
    skycoinJNI.coin__Transaction_Sigs_set(swigCPtr, this, SWIGTYPE_p_GoSlice_.getCPtr(value));
  }

  public SWIGTYPE_p_GoSlice_ getSigs() {
    return new SWIGTYPE_p_GoSlice_(skycoinJNI.coin__Transaction_Sigs_get(swigCPtr, this), true);
  }

  public void setIn(SWIGTYPE_p_GoSlice_ value) {
    skycoinJNI.coin__Transaction_In_set(swigCPtr, this, SWIGTYPE_p_GoSlice_.getCPtr(value));
  }

  public SWIGTYPE_p_GoSlice_ getIn() {
    return new SWIGTYPE_p_GoSlice_(skycoinJNI.coin__Transaction_In_get(swigCPtr, this), true);
  }

  public void setOut(SWIGTYPE_p_GoSlice_ value) {
    skycoinJNI.coin__Transaction_Out_set(swigCPtr, this, SWIGTYPE_p_GoSlice_.getCPtr(value));
  }

  public SWIGTYPE_p_GoSlice_ getOut() {
    return new SWIGTYPE_p_GoSlice_(skycoinJNI.coin__Transaction_Out_get(swigCPtr, this), true);
  }

  public coin__Transaction() {
    this(skycoinJNI.new_coin__Transaction(), true);
  }

}
