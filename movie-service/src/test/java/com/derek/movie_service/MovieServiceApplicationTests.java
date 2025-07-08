package com.derek.movie_service;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class MovieServiceApplicationTests {

// private static final Logger log = LoggerFactory.getLogger
// (MovieServiceApplicationTests.class);


	@Test
	void contextLoads() {
	}

}
