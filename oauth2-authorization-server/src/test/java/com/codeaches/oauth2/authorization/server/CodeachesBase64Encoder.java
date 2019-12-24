package com.codeaches.oauth2.authorization.server;

import java.util.Base64;

import org.junit.jupiter.api.Test;

public class CodeachesBase64Encoder {

  @Test
  void generateBase64EncodedValue() {

    // Get the Base64 password for appclient:appclient@123
    String base64AuthHeader = Base64.getEncoder().encodeToString("appclient:appclient@123".getBytes());

    // This Base64 password for appclient:appclient@123 will be used in the http
    // header when requesting the token
    System.out.println("appclient's Base64 Password is " + base64AuthHeader);
  }
}
