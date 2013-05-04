package test  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
    private ClassFactory() {} // instanciation is not allowed


    /**
     * ActiveHome Class
     */
    public static test.IActiveHome createActiveHome() {
        return COM4J.createInstance( test.IActiveHome.class, "{001000AF-2DEF-0208-10B6-DC5BA692C858}" );
    }
}
