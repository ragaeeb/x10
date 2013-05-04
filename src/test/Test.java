package test;

import test.events._DIActiveHomeEvents;
import com4j.Com4jObject;
import com4j.EventCookie;

public class Test
{
    public static void main(String[] args)
    {
        IActiveHome ah
        = ClassFactory.createActiveHome();
        ah.sendAction("sendplc", "A1 off", "", "");
        EventCookie eventSubscription =
            ah.advise(_DIActiveHomeEvents.class,
                    new EventReceiver());

        while(true)
        {
            try
            {
                Thread.sleep(15000);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }

        //not necessary here, but usually you should
        //not forget to release the event listener:
        //eventSubscription.close();

    }
}

class EventReceiver extends _DIActiveHomeEvents
{
    public void recvAction(
            java.lang.Object
            bszAction,
            java.lang.Object bszParm1,
            java.lang.Object bszParm2,
            java.lang.Object bszParm3,
            java.lang.Object bszParm4,
            java.lang.Object bszParm5,
            java.lang.Object
            bszReserved)
    {
        System.out.println("Called");
        String receptionType  = "<null>";
        String x10Address     = "<null>";
        String plcCommand     = "<null>";
        String additionalData = "<null>";
        String rfCommand      = "<null>";
        String keyData        = "<null>";
        String timestamp      = "<null>";

        if(bszAction != null)
            System.out.println("action: " +
                    bszAction.getClass().getName());
        if(bszParm1 != null)
            System.out.println("1: " +

                    bszParm1.getClass().getName());
        if(bszParm2 != null)
            System.out.println("2: " +
                    bszParm2.getClass().getName());
        if(bszParm3 != null)
            System.out.println("3: " +
                    bszParm3.getClass().getName());
        if(bszParm4 != null)
            System.out.println("4: " +
                    bszParm4.getClass().getName());
        if(bszParm5 != null)
            System.out.println("5: " +
                    bszParm5.getClass().getName());

        // if action is recvplc, then the param
        // types are as follows:
        //1: String  -- X10 Address
        //2: String  -- X10 command
        //3: String  -- X10 additional data
        //4: String  -- not used ?
        //5: String  -- not used ?

        // if action is recvrf, then the param types
        // are as follows:
        //1: java.lang.String  -- X10 Address
        //2: java.lang.String  -- RF Command
        //3: java.lang.Integer -- key data
        //4: java.util.Date    -- timestamp
        //5: java.lang.String  -- not used ?
    }
}