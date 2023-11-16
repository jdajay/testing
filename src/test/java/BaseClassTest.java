import org.testng.annotations.Test;

public class BaseClassTest extends BaseClass{

    @Test
    public void testing(){

        webDriver.get("https://www.google.com.co/");
    }
}
