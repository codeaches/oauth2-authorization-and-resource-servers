package com.codeaches.carinventoryservice;

import java.util.Base64;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CarInventoryServiceApplicationTests {

	@Test
	void contextLoads() {
	}

  @Test
  void generateBase64EncodedValue() {

    // Get the Base64 password for appclient:appclient@123
    String base64AuthHeader = Base64.getEncoder().encodeToString("appclient:appclient@123".getBytes());

    // This Base64 password for appclient:appclient@123 will be used in the http
    // header when requesting the token
    System.out.println("appclient's Base64 Password is " + base64AuthHeader);
  }
}
