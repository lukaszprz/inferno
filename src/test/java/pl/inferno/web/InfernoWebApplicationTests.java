package pl.inferno.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = InfernoWebApplication.class)
@TestPropertySource(locations = "classpath:application-test.properties")
@WebAppConfiguration
public class InfernoWebApplicationTests {

	@Test
	public void contextLoads() {
	}

}
