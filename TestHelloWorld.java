import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestHelloWorld {

    @Test
    public void testGetMessage() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello, World!", helloWorld.getMessage());
    }
}
