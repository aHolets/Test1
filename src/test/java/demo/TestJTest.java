package demo;


import org.junit.Assert;
import org.junit.Test;

public class TestJTest {

    @Test
    public void testJ() {
        Assert.assertEquals("OK", TestJ.test());
    }

    @Test
    public void testJ2() {
        Assert.assertNotEquals("OK", TestJ.test());
    }


}
