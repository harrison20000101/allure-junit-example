import io.qameta.allure.AllureId;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class SimpleTest {

    @Test
    @AllureId("1")
    public void check1(){
        assertTrue(true);
    }

    @Test
    @AllureId("2")
    public void check2(){
        assertTrue(false);
    }

    @Test
    @AllureId("3")
    public void check3(){
        assertTrue(true);
    }

    @Test
    public void check4(){
        assertTrue(false);
    }

}
