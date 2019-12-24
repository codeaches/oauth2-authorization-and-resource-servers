package com.codeaches.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class CodeachesBCryptPasswordEncoder {

  static Logger log = LoggerFactory.getLogger(CodeachesBCryptPasswordEncoder.class);

  public static BCryptPasswordEncoder encoder4 = new BCryptPasswordEncoder(4);

  public static void main(String[] args) {

    /*
     * Users: john/john@123 kelly/kelly@123
     * 
     * Generated Bcrypt password will be used in data.sql (users table)
     */

    System.out.println("John's Bcrypt encrypted password = " + encoder4.encode("john@123"));
    System.out.println("John's Bcrypt encrypted password = " + encoder4.encode("kelly@123"));

    /*
     * Users: Client: appclient/appclient@123
     * 
     * Generated Bcrypt password will be used in data.sql (oauth_client_details
     * table)
     */
    System.out.println("appclient's Bcrypt encrypted password = " + encoder4.encode("appclient@123"));
  }
}
