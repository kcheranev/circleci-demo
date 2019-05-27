package test.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(properties = {
        "SPRING_DATA_MONGODB_HOST = localhost",
        "SPRING_DATA_MONGODB_PORT = 27017"
})
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }

}
