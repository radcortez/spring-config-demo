package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	Server server;

	@Test
	void contextLoads() {
		System.out.println(server.getHost());
		System.out.println(server.getAlias());
		System.out.println(server.getLog().isEnabled());
		System.out.println(server.getAliases());
	}
}
