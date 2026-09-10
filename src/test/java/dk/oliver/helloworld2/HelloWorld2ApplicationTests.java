package dk.oliver.helloworld2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HelloWorld2ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void TestFail() {
        int expected = 5;
        int actual = 3;
        assertEquals(expected, actual, "The actual value does not match the expected value");
    }

}
