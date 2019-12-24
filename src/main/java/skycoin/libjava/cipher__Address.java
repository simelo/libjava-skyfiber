/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package skyfiber.libjava;

public class cipher__Address {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected cipher__Address(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(cipher__Address obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        skycoinJNI.delete_cipher__Address(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int isEqual(cipher__Address a) {
    return skycoinJNI.cipher__Address_isEqual(swigCPtr, this, cipher__Address.getCPtr(a), a);
  }

  public void setVersion(short value) {
    skycoinJNI.cipher__Address_Version_set(swigCPtr, this, value);
  }

  public short getVersion() {
    return skycoinJNI.cipher__Address_Version_get(swigCPtr, this);
  }

  public void setKey(SWIGTYPE_p_GoUint8_ value) {
    skycoinJNI.cipher__Address_Key_set(swigCPtr, this, SWIGTYPE_p_GoUint8_.getCPtr(value));
  }

  public SWIGTYPE_p_GoUint8_ getKey() {
    long cPtr = skycoinJNI.cipher__Address_Key_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_GoUint8_(cPtr, false);
  }

  public cipher__Address() {
    this(skycoinJNI.new_cipher__Address(), true);
  }

}
