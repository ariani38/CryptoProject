package com.example.demo;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

 
import service.CryptoService;
 

@TestPropertySource("classpath:application.properties")

@SpringBootTest
class ApplicationTests {
	@Autowired
	CryptoService cryptoService;

	@Test
	void testCrypto() {
		assertEquals(1, cryptoService.recoverCrypto("Bitcoin").size());
		assertTrue(cryptoService.recoverCrypto("alguna").size()==0);
	}

	@Test
	void testTodasCriptomonedas() {
		assertEquals(9, cryptoService.recoverCryptos().size());
	}
	
	
	
}

