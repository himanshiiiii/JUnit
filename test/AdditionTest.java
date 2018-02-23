import org.junit.Assert;
import org.junit.Test;

public class AdditionTest {

    private Addition addition=new Addition();

    @Test
    public void canaryTest(){
        Assert.assertTrue(true);
    }

    @Test

    public void testTheMainMethod(){
        String[] str= {"12","13"};
    }

    @Test

    public void testTheSumWithTwoInts(){
        int a=10;
        int b=20;
        Assert.assertEquals(addition.sum(10,20),30);
        Assert.assertEquals(addition.sum(10,20),30);
    }


    @Test
    public void testTheSumWithTwoStrings(){
        String fname="himanshi";
        String lname="gupta";
        Assert.assertEquals(addition.sum("himanshi","gupta"),"himanshigupta");
    }

    @Test

    public void testTheSumWithTwoFloats(){
        Float fa=10.0f;
        Float fb=20.0f;
        Assert.assertEquals(addition.sum(10.0f,20.0f), 30.0f,0.1);


    }

    @Test

    public void testTheSumWithTwoDoubles() {
        Double da = 10.0;
        Double db = 20.0;
        Assert.assertEquals(addition.sum(10.0, 20.0), 30.0, 0.1);


    }


}
