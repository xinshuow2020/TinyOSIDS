/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'PrintfMsg'
 * message type.
 */

public class PrintfMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 28;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 100;

    /** Create a new PrintfMsg of size 28. */
    public PrintfMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new PrintfMsg of the given data_length. */
    public PrintfMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new PrintfMsg with the given data_length
     * and base offset.
     */
    public PrintfMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new PrintfMsg using the given byte array
     * as backing store.
     */
    public PrintfMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new PrintfMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public PrintfMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new PrintfMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public PrintfMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new PrintfMsg embedded in the given message
     * at the given base offset.
     */
    public PrintfMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new PrintfMsg embedded in the given message
     * at the given base offset and length.
     */
    public PrintfMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <PrintfMsg> \n";
      try {
        s += "  [nx_struct printf_msg 28 100
=0x"+Long.toHexString(get_nx_struct printf_msg 28 100
())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: nx_struct printf_msg 28 100

    //   Field type: 
    //   Offset (bits): 0
    //   Size (bits): 
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'nx_struct printf_msg 28 100
' is signed (false).
     */
    public static boolean isSigned_nx_struct printf_msg 28 100
() {
        return false;
    }

    /**
     * Return whether the field 'nx_struct printf_msg 28 100
' is an array (false).
     */
    public static boolean isArray_nx_struct printf_msg 28 100
() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'nx_struct printf_msg 28 100
'
     */
    public static int offset_nx_struct printf_msg 28 100
() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'nx_struct printf_msg 28 100
'
     */
    public static int offsetBits_nx_struct printf_msg 28 100
() {
        return 0;
    }

    /**
     * Return the value (as a ) of the field 'nx_struct printf_msg 28 100
'
     */
    public  get_nx_struct printf_msg 28 100
() {
        return ()get(offsetBits_nx_struct printf_msg 28 100
(), );
    }

    /**
     * Set the value of the field 'nx_struct printf_msg 28 100
'
     */
    public void set_nx_struct printf_msg 28 100
( value) {
        set(offsetBits_nx_struct printf_msg 28 100
(), , value);
    }

    /**
     * Return the size, in bytes, of the field 'nx_struct printf_msg 28 100
'
     */
    public static int size_nx_struct printf_msg 28 100
() {
        return ( / 8);
    }

    /**
     * Return the size, in bits, of the field 'nx_struct printf_msg 28 100
'
     */
    public static int sizeBits_nx_struct printf_msg 28 100
() {
        return ;
    }

}
