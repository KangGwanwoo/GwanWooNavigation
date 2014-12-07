/**
 * Created by goodmorning on 2014-12-07.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class TestHello {

    @Test
    public void testPasses() {
       PathFindTest p = new PathFindTest();

        assertEquals(2, p.TestMain()); //1 = seoul 6=jeju airplane time is 2 hour
    }
}
