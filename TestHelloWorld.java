import org.junit.Test;
import static org.junit.Assert.*;
public class TestHelloWorld {

    @Test
    public void testGetMessage() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello, World!", helloWorld.getMessage());
    }
}
