import org.edu.ka.HelloWorldService;
import org.junit.Test;

public class HelloWorldServiceTest {

    private HelloWorldService helloWorldService = new HelloWorldService("Test");

    @Test
    public void testSayHello() {
        helloWorldService.sayHello();
    }

}
