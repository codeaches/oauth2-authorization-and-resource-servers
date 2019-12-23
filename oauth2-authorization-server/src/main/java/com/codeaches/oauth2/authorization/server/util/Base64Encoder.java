package com.codeaches.oauth2.authorization.server.util;

import java.util.Base64;

public class Base64Encoder {

  public static void main(String[] args) {

    // Get the Base64 password for appclient:appclient@123
    String base64AuthHeader = Base64.getEncoder().encodeToString("appclient:appclient@123".getBytes());

    // This Base64 password for appclient:appclient@123 will be used in the http
    // header when requesting the token
    System.out.println(String.format("appclient's Base64 Password is %s", base64AuthHeader));
  }
}
