/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'MultiPingMsg'
 * message type.
 */

public class MultiPingMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 13;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 12;

    /** Create a new MultiPingMsg of size 13. */
    public MultiPingMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new MultiPingMsg of the given data_length. */
    public MultiPingMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MultiPingMsg with the given data_length
     * and base offset.
     */
    public MultiPingMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MultiPingMsg using the given byte array
     * as backing store.
     */
    public MultiPingMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MultiPingMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public MultiPingMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MultiPingMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public MultiPingMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MultiPingMsg embedded in the given message
     * at the given base offset.
     */
    public MultiPingMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MultiPingMsg embedded in the given message
     * at the given base offset and length.
     */
    public MultiPingMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <MultiPingMsg> \n";
      try {
        s += "  [nx_struct MultiPingMsg 13 12
=0x"+Long.toHexString(get_nx_struct MultiPingMsg 13 12
())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [nx_struct MultiPingMsg 13 12
=0x"+Long.toHexString(get_nx_struct MultiPingMsg 13 12
())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [nx_struct MultiPingMsg 13 12
=0x"+Long.toHexString(get_nx_struct MultiPingMsg 13 12
())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [nx_struct MultiPingMsg 13 12
=0x"+Long.toHexString(get_nx_struct MultiPingMsg 13 12
())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [nx_struct MultiPingMsg 13 12
=0x"+Long.toHexString(get_nx_struct MultiPingMsg 13 12
())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [nx_struct MultiPingMsg 13 12
=0x"+Long.toHexString(get_nx_struct MultiPingMsg 13 12
())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [nx_struct MultiPingMsg 13 12
=0x"+Long.toHexString(get_nx_struct MultiPingMsg 13 12
())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [nx_struct MultiPingMsg 13 12
=0x"+Long.toHexString(get_nx_struct MultiPingMsg 13 12
())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [nx_struct MultiPingMsg 13 12
=0x"+Long.toHexString(get_nx_struct MultiPingMsg 13 12
())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: nx_struct MultiPingMsg 13 12

    //   Field type: 
    //   Offset (bits): 0
    //   Size (bits):   txpower Nnx_uint8_t 32 8

    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'nx_struct MultiPingMsg 13 12
' is signed (false).
     */
    public static boolean isSigned_nx_struct MultiPingMsg 13 12
() {
        return false;
    }

    /**
     * Return whether the field 'nx_struct MultiPingMsg 13 12
' is an array (false).
     */
    public static boolean isArray_nx_struct MultiPingMsg 13 12
() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int offset_nx_struct MultiPingMsg 13 12
() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int offsetBits_nx_struct MultiPingMsg 13 12
() {
        return 0;
    }

    /**
     * Return the value (as a ) of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public  get_nx_struct MultiPingMsg 13 12
() {
        return ()get(offsetBits_nx_struct MultiPingMsg 13 12
(),   txpower Nnx_uint8_t 32 8
);
    }

    /**
     * Set the value of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public void set_nx_struct MultiPingMsg 13 12
( value) {
        set(offsetBits_nx_struct MultiPingMsg 13 12
(),   txpower Nnx_uint8_t 32 8
, value);
    }

    /**
     * Return the size, in bytes, of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int size_nx_struct MultiPingMsg 13 12
() {
        return (  txpower Nnx_uint8_t 32 8
 / 8);
    }

    /**
     * Return the size, in bits, of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int sizeBits_nx_struct MultiPingMsg 13 12
() {
        return   txpower Nnx_uint8_t 32 8
;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: nx_struct MultiPingMsg 13 12

    //   Field type: 
    //   Offset (bits): 0
    //   Size (bits):   txpower Nnx_uint8_t 32 8

    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'nx_struct MultiPingMsg 13 12
' is signed (false).
     */
    public static boolean isSigned_nx_struct MultiPingMsg 13 12
() {
        return false;
    }

    /**
     * Return whether the field 'nx_struct MultiPingMsg 13 12
' is an array (false).
     */
    public static boolean isArray_nx_struct MultiPingMsg 13 12
() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int offset_nx_struct MultiPingMsg 13 12
() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int offsetBits_nx_struct MultiPingMsg 13 12
() {
        return 0;
    }

    /**
     * Return the value (as a ) of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public  get_nx_struct MultiPingMsg 13 12
() {
        return ()get(offsetBits_nx_struct MultiPingMsg 13 12
(),   txpower Nnx_uint8_t 32 8
);
    }

    /**
     * Set the value of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public void set_nx_struct MultiPingMsg 13 12
( value) {
        set(offsetBits_nx_struct MultiPingMsg 13 12
(),   txpower Nnx_uint8_t 32 8
, value);
    }

    /**
     * Return the size, in bytes, of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int size_nx_struct MultiPingMsg 13 12
() {
        return (  txpower Nnx_uint8_t 32 8
 / 8);
    }

    /**
     * Return the size, in bits, of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int sizeBits_nx_struct MultiPingMsg 13 12
() {
        return   txpower Nnx_uint8_t 32 8
;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: nx_struct MultiPingMsg 13 12

    //   Field type: 
    //   Offset (bits): 0
    //   Size (bits):   txpower Nnx_uint8_t 32 8

    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'nx_struct MultiPingMsg 13 12
' is signed (false).
     */
    public static boolean isSigned_nx_struct MultiPingMsg 13 12
() {
        return false;
    }

    /**
     * Return whether the field 'nx_struct MultiPingMsg 13 12
' is an array (false).
     */
    public static boolean isArray_nx_struct MultiPingMsg 13 12
() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int offset_nx_struct MultiPingMsg 13 12
() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int offsetBits_nx_struct MultiPingMsg 13 12
() {
        return 0;
    }

    /**
     * Return the value (as a ) of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public  get_nx_struct MultiPingMsg 13 12
() {
        return ()get(offsetBits_nx_struct MultiPingMsg 13 12
(),   txpower Nnx_uint8_t 32 8
);
    }

    /**
     * Set the value of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public void set_nx_struct MultiPingMsg 13 12
( value) {
        set(offsetBits_nx_struct MultiPingMsg 13 12
(),   txpower Nnx_uint8_t 32 8
, value);
    }

    /**
     * Return the size, in bytes, of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int size_nx_struct MultiPingMsg 13 12
() {
        return (  txpower Nnx_uint8_t 32 8
 / 8);
    }

    /**
     * Return the size, in bits, of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int sizeBits_nx_struct MultiPingMsg 13 12
() {
        return   txpower Nnx_uint8_t 32 8
;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: nx_struct MultiPingMsg 13 12

    //   Field type: 
    //   Offset (bits): 0
    //   Size (bits):   txpower Nnx_uint8_t 32 8

    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'nx_struct MultiPingMsg 13 12
' is signed (false).
     */
    public static boolean isSigned_nx_struct MultiPingMsg 13 12
() {
        return false;
    }

    /**
     * Return whether the field 'nx_struct MultiPingMsg 13 12
' is an array (false).
     */
    public static boolean isArray_nx_struct MultiPingMsg 13 12
() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int offset_nx_struct MultiPingMsg 13 12
() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int offsetBits_nx_struct MultiPingMsg 13 12
() {
        return 0;
    }

    /**
     * Return the value (as a ) of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public  get_nx_struct MultiPingMsg 13 12
() {
        return ()get(offsetBits_nx_struct MultiPingMsg 13 12
(),   txpower Nnx_uint8_t 32 8
);
    }

    /**
     * Set the value of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public void set_nx_struct MultiPingMsg 13 12
( value) {
        set(offsetBits_nx_struct MultiPingMsg 13 12
(),   txpower Nnx_uint8_t 32 8
, value);
    }

    /**
     * Return the size, in bytes, of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int size_nx_struct MultiPingMsg 13 12
() {
        return (  txpower Nnx_uint8_t 32 8
 / 8);
    }

    /**
     * Return the size, in bits, of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int sizeBits_nx_struct MultiPingMsg 13 12
() {
        return   txpower Nnx_uint8_t 32 8
;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: nx_struct MultiPingMsg 13 12

    //   Field type: 
    //   Offset (bits): 0
    //   Size (bits):   txpower Nnx_uint8_t 32 8

    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'nx_struct MultiPingMsg 13 12
' is signed (false).
     */
    public static boolean isSigned_nx_struct MultiPingMsg 13 12
() {
        return false;
    }

    /**
     * Return whether the field 'nx_struct MultiPingMsg 13 12
' is an array (false).
     */
    public static boolean isArray_nx_struct MultiPingMsg 13 12
() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int offset_nx_struct MultiPingMsg 13 12
() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int offsetBits_nx_struct MultiPingMsg 13 12
() {
        return 0;
    }

    /**
     * Return the value (as a ) of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public  get_nx_struct MultiPingMsg 13 12
() {
        return ()get(offsetBits_nx_struct MultiPingMsg 13 12
(),   txpower Nnx_uint8_t 32 8
);
    }

    /**
     * Set the value of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public void set_nx_struct MultiPingMsg 13 12
( value) {
        set(offsetBits_nx_struct MultiPingMsg 13 12
(),   txpower Nnx_uint8_t 32 8
, value);
    }

    /**
     * Return the size, in bytes, of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int size_nx_struct MultiPingMsg 13 12
() {
        return (  txpower Nnx_uint8_t 32 8
 / 8);
    }

    /**
     * Return the size, in bits, of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int sizeBits_nx_struct MultiPingMsg 13 12
() {
        return   txpower Nnx_uint8_t 32 8
;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: nx_struct MultiPingMsg 13 12

    //   Field type: 
    //   Offset (bits): 0
    //   Size (bits):   txpower Nnx_uint8_t 32 8

    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'nx_struct MultiPingMsg 13 12
' is signed (false).
     */
    public static boolean isSigned_nx_struct MultiPingMsg 13 12
() {
        return false;
    }

    /**
     * Return whether the field 'nx_struct MultiPingMsg 13 12
' is an array (false).
     */
    public static boolean isArray_nx_struct MultiPingMsg 13 12
() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int offset_nx_struct MultiPingMsg 13 12
() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int offsetBits_nx_struct MultiPingMsg 13 12
() {
        return 0;
    }

    /**
     * Return the value (as a ) of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public  get_nx_struct MultiPingMsg 13 12
() {
        return ()get(offsetBits_nx_struct MultiPingMsg 13 12
(),   txpower Nnx_uint8_t 32 8
);
    }

    /**
     * Set the value of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public void set_nx_struct MultiPingMsg 13 12
( value) {
        set(offsetBits_nx_struct MultiPingMsg 13 12
(),   txpower Nnx_uint8_t 32 8
, value);
    }

    /**
     * Return the size, in bytes, of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int size_nx_struct MultiPingMsg 13 12
() {
        return (  txpower Nnx_uint8_t 32 8
 / 8);
    }

    /**
     * Return the size, in bits, of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int sizeBits_nx_struct MultiPingMsg 13 12
() {
        return   txpower Nnx_uint8_t 32 8
;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: nx_struct MultiPingMsg 13 12

    //   Field type: 
    //   Offset (bits): 0
    //   Size (bits):   txpower Nnx_uint8_t 32 8

    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'nx_struct MultiPingMsg 13 12
' is signed (false).
     */
    public static boolean isSigned_nx_struct MultiPingMsg 13 12
() {
        return false;
    }

    /**
     * Return whether the field 'nx_struct MultiPingMsg 13 12
' is an array (false).
     */
    public static boolean isArray_nx_struct MultiPingMsg 13 12
() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int offset_nx_struct MultiPingMsg 13 12
() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int offsetBits_nx_struct MultiPingMsg 13 12
() {
        return 0;
    }

    /**
     * Return the value (as a ) of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public  get_nx_struct MultiPingMsg 13 12
() {
        return ()get(offsetBits_nx_struct MultiPingMsg 13 12
(),   txpower Nnx_uint8_t 32 8
);
    }

    /**
     * Set the value of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public void set_nx_struct MultiPingMsg 13 12
( value) {
        set(offsetBits_nx_struct MultiPingMsg 13 12
(),   txpower Nnx_uint8_t 32 8
, value);
    }

    /**
     * Return the size, in bytes, of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int size_nx_struct MultiPingMsg 13 12
() {
        return (  txpower Nnx_uint8_t 32 8
 / 8);
    }

    /**
     * Return the size, in bits, of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int sizeBits_nx_struct MultiPingMsg 13 12
() {
        return   txpower Nnx_uint8_t 32 8
;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: nx_struct MultiPingMsg 13 12

    //   Field type: 
    //   Offset (bits): 0
    //   Size (bits):   txpower Nnx_uint8_t 32 8

    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'nx_struct MultiPingMsg 13 12
' is signed (false).
     */
    public static boolean isSigned_nx_struct MultiPingMsg 13 12
() {
        return false;
    }

    /**
     * Return whether the field 'nx_struct MultiPingMsg 13 12
' is an array (false).
     */
    public static boolean isArray_nx_struct MultiPingMsg 13 12
() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int offset_nx_struct MultiPingMsg 13 12
() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int offsetBits_nx_struct MultiPingMsg 13 12
() {
        return 0;
    }

    /**
     * Return the value (as a ) of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public  get_nx_struct MultiPingMsg 13 12
() {
        return ()get(offsetBits_nx_struct MultiPingMsg 13 12
(),   txpower Nnx_uint8_t 32 8
);
    }

    /**
     * Set the value of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public void set_nx_struct MultiPingMsg 13 12
( value) {
        set(offsetBits_nx_struct MultiPingMsg 13 12
(),   txpower Nnx_uint8_t 32 8
, value);
    }

    /**
     * Return the size, in bytes, of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int size_nx_struct MultiPingMsg 13 12
() {
        return (  txpower Nnx_uint8_t 32 8
 / 8);
    }

    /**
     * Return the size, in bits, of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int sizeBits_nx_struct MultiPingMsg 13 12
() {
        return   txpower Nnx_uint8_t 32 8
;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: nx_struct MultiPingMsg 13 12

    //   Field type: 
    //   Offset (bits): 0
    //   Size (bits):   txpower Nnx_uint8_t 32 8

    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'nx_struct MultiPingMsg 13 12
' is signed (false).
     */
    public static boolean isSigned_nx_struct MultiPingMsg 13 12
() {
        return false;
    }

    /**
     * Return whether the field 'nx_struct MultiPingMsg 13 12
' is an array (false).
     */
    public static boolean isArray_nx_struct MultiPingMsg 13 12
() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int offset_nx_struct MultiPingMsg 13 12
() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int offsetBits_nx_struct MultiPingMsg 13 12
() {
        return 0;
    }

    /**
     * Return the value (as a ) of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public  get_nx_struct MultiPingMsg 13 12
() {
        return ()get(offsetBits_nx_struct MultiPingMsg 13 12
(),   txpower Nnx_uint8_t 32 8
);
    }

    /**
     * Set the value of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public void set_nx_struct MultiPingMsg 13 12
( value) {
        set(offsetBits_nx_struct MultiPingMsg 13 12
(),   txpower Nnx_uint8_t 32 8
, value);
    }

    /**
     * Return the size, in bytes, of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int size_nx_struct MultiPingMsg 13 12
() {
        return (  txpower Nnx_uint8_t 32 8
 / 8);
    }

    /**
     * Return the size, in bits, of the field 'nx_struct MultiPingMsg 13 12
'
     */
    public static int sizeBits_nx_struct MultiPingMsg 13 12
() {
        return   txpower Nnx_uint8_t 32 8
;
    }

}
