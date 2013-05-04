package test  ;

import com4j.*;

/**
 * IActiveHome Interface
 */
@IID("{001000AF-3DEF-0910-10B6-DC5BA692C858}")
public interface IActiveHome extends Com4jObject {
    /**
     * method SendAction - use to send commands
     */
    @VTID(7)
    @DefaultMethod
    @ReturnValue(type=NativeType.VARIANT)
    java.lang.Object sendAction(
        @MarshalAs(NativeType.VARIANT) java.lang.Object bszAction,
        @MarshalAs(NativeType.VARIANT) @DefaultValue("0")java.lang.Object bstrParam,
        @MarshalAs(NativeType.VARIANT) @DefaultValue("0")java.lang.Object vReserved1,
        @MarshalAs(NativeType.VARIANT) @DefaultValue("0")java.lang.Object vReserved2);

    @VTID(8)
    void onRecvAction(
        @MarshalAs(NativeType.Dispatch) com4j.Com4jObject rhs);

    /**
     * method EnumerateInterfaces
     */
    @VTID(9)
    void enumerateInterfaces(
        java.lang.Object pCount);

    /**
     * method GetInterfaceName
     */
    @VTID(10)
    void getInterfaceName(
        java.lang.Object pInterfaceName);

}
