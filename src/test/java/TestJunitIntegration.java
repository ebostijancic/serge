import android.test.AndroidTestCase;

/**
 * Created by ebostijancic on 12.03.14.
 */
public class TestJunitIntegration extends AndroidTestCase {

    @Test
    public void testShouldAssertTrue() {
        System.out.println("Testing Assert true");
        Assert.assertTrue(true);
    }
}
