package test.events;

import com4j.*;

/**
 * _DIActiveHomeEvents Interface
 */
@IID("{001000AF-3DEF-0911-10B6-DC5BA692C858}")
public abstract class _DIActiveHomeEvents {
    /**
     * method RecvAction - Called when commands have been received
     */
    @DISPID(0)
    @DefaultMethod
    public void recvAction(
        java.lang.Object bszAction,
        java.lang.Object bszParm1,
        java.lang.Object bszParm2,
        java.lang.Object bszParm3,
        java.lang.Object bszParm4,
        java.lang.Object bszParm5,
        java.lang.Object bszReserved) {
            throw new UnsupportedOperationException();
    }

}
