package com.devops.hellospringboot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HellospringbootApplicationTests {

	@Test
	void contextLoads() {
		Assertions.assertNotNull("hola mundo");
	}

}
