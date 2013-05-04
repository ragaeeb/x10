package test  ;

import com4j.*;

/**
 * _IActiveHomeEvents Interface
 */
@IID("{001000AF-3DEF-0912-10B6-DC5BA692C858}")
public interface _IActiveHomeEvents extends Com4jObject {
    /**
     * method RecvAction - Called when commands have been received
     */
    @VTID(3)
    @DefaultMethod
    void recvAction(
        @MarshalAs(NativeType.VARIANT) java.lang.Object bszAction,
        @MarshalAs(NativeType.VARIANT) java.lang.Object bszParm1,
        @MarshalAs(NativeType.VARIANT) java.lang.Object bszParm2,
        @MarshalAs(NativeType.VARIANT) java.lang.Object bszParm3,
        @MarshalAs(NativeType.VARIANT) java.lang.Object bszParm4,
        @MarshalAs(NativeType.VARIANT) java.lang.Object bszParm5,
        @MarshalAs(NativeType.VARIANT) java.lang.Object bszReserved);

}
