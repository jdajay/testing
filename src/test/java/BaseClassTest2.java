import org.testng.annotations.Test;

public class BaseClassTest2 extends BaseClass{

    @Test
    public void testing(){

        webDriver.get("https://www.youtube.com.co/");
    }
}
