/**
 * Created by goodmorning on 2014-12-07.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class TestHello {

    @Test
    public void testPasses() {
        int m = 30000;
        int[][] data = new int[][] { { 0, 3, 2, 6, m, 2 },
                { 3, 0, 3, m, 8, m }, { 2, 3, 0, 2, 3, m },
                { 6, m, 2, 0, 7, m }, { m, 8, 3, 7, 0, 1 },
                { 2, m, m, m, 1, 0 },};

        DijkstraTest d = new DijkstraTest(data);
        assertEquals(2, d.start(1,6)); //1 = seoul 6=jeju airplane time is 2 hour
    }
}
