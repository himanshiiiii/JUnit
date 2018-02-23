import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class SubtractionTest {

    private Subtraction subtraction=new Subtraction();

    @Test
    public void canaryTest(){
        Assert.assertTrue(true);
    }


    @Test

    public void testTheSubWithTwoInts(){
        int a=10;
        int b=20;
        Assert.assertEquals(subtraction.sub(20,10),10);
        Assert.assertEquals(subtraction.sub(20,10),10);
    }
    @Ignore
    @Test

    public void testTheSumWithTwoFloats(){
        Float fa=20.0f;
        Float fb=10.0f;
        Assert.assertEquals(subtraction.sub(20.0f,10.0f), 10.0f,0.1);


    }

    @Test

    public void testTheSumWithTwoDoubles() {
        Double da = 20.0;
        Double db = 10.0;
        Assert.assertEquals(subtraction.sub(20.0, 10.0), 10.0, 0.1);


    }


}
