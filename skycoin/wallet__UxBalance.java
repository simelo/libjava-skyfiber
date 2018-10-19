/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class wallet__UxBalance {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected wallet__UxBalance(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(wallet__UxBalance obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        skycoinJNI.delete_wallet__UxBalance(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setHash(SWIGTYPE_p_GoUint8_ value) {
    skycoinJNI.set_wallet__UxBalance_Hash(swigCPtr, this, SWIGTYPE_p_GoUint8_.getCPtr(value));
  }

  public SWIGTYPE_p_GoUint8_ getHash() {
    long cPtr = skycoinJNI.get_wallet__UxBalance_Hash(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_GoUint8_(cPtr, false);
  }

  public void setBkSeq(SWIGTYPE_p_GoInt64_ value) {
    skycoinJNI.set_wallet__UxBalance_BkSeq(swigCPtr, this, SWIGTYPE_p_GoInt64_.getCPtr(value));
  }

  public SWIGTYPE_p_GoInt64_ getBkSeq() {
    return new SWIGTYPE_p_GoInt64_(skycoinJNI.get_wallet__UxBalance_BkSeq(swigCPtr, this), true);
  }

  public void setAddress(cipher__Address value) {
    skycoinJNI.set_wallet__UxBalance_Address(swigCPtr, this, cipher__Address.getCPtr(value), value);
  }

  public cipher__Address getAddress() {
    long cPtr = skycoinJNI.get_wallet__UxBalance_Address(swigCPtr, this);
    return (cPtr == 0) ? null : new cipher__Address(cPtr, false);
  }

  public void setCoins(SWIGTYPE_p_GoInt64_ value) {
    skycoinJNI.set_wallet__UxBalance_Coins(swigCPtr, this, SWIGTYPE_p_GoInt64_.getCPtr(value));
  }

  public SWIGTYPE_p_GoInt64_ getCoins() {
    return new SWIGTYPE_p_GoInt64_(skycoinJNI.get_wallet__UxBalance_Coins(swigCPtr, this), true);
  }

  public void setHours(SWIGTYPE_p_GoInt64_ value) {
    skycoinJNI.set_wallet__UxBalance_Hours(swigCPtr, this, SWIGTYPE_p_GoInt64_.getCPtr(value));
  }

  public SWIGTYPE_p_GoInt64_ getHours() {
    return new SWIGTYPE_p_GoInt64_(skycoinJNI.get_wallet__UxBalance_Hours(swigCPtr, this), true);
  }

  public wallet__UxBalance() {
    this(skycoinJNI.new_wallet__UxBalance(), true);
  }

}