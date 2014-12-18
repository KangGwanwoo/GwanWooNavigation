/**
 * Created by goodmorning on 2014-12-07.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class TestHello {

    @Test
    public void testPasses() {
       UserTest ut = new UserTest();
        double a = ut.testMain();
        System.out.println(a);

       int b = (int)a;
        assertEquals(0, b); //1 = seoul 6=jeju airplane time is 2 hour
    }
}
