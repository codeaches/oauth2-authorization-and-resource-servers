package com.codeaches.oauth2.authorization.server.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncryptBCryptPassword {

  static Logger log = LoggerFactory.getLogger(EncryptBCryptPassword.class);

  public static void main(String[] args) {

    /*
     * Users: john/john@123 kelly/kelly@123
     * 
     * Generated Bcrypt password will be used in data.sql (users table)
     */
    BCryptPasswordEncoder encoder4 = new BCryptPasswordEncoder(4);

    String johnRawPassword = "john@123";
    String johnEncryptedPassword = encoder4.encode(johnRawPassword);

    String kellyRawPassword = "kelly@123";
    String kellyEncryptedPassword = encoder4.encode(kellyRawPassword);

    System.out.println(String.format("John's Raw Password                     = %s", johnRawPassword));
    System.out.println(String.format("John's Bcrypt Encrypted Password        = %s", johnEncryptedPassword));
    System.out.println(String.format("John's Bcrypt Encrypted Password Valid  = %s",
        encoder4.matches(johnRawPassword, johnEncryptedPassword)));

    System.out.println(String.format("Kelly's Raw Password                    = %s", kellyRawPassword));
    System.out.println(String.format("Kelly's Bcrypt Encrypted Password       = %s", kellyEncryptedPassword));
    System.out.println(String.format("Kelly's Bcrypt Encrypted Password Valid = %s",
        encoder4.matches(kellyRawPassword, kellyEncryptedPassword)));

    /*
     * Users: Client: appclient/appclient@123
     * 
     * Generated Bcrypt password will be used in data.sql (oauth_client_details
     * table)
     */
    BCryptPasswordEncoder encoder8 = new BCryptPasswordEncoder(8);

    String appclientRawPassword = "appclient@123";
    String appclientEncryptedPassword = encoder8.encode(appclientRawPassword);

    System.out.println(String.format("appclient Raw Password                    = %s", appclientRawPassword));
    System.out.println(String.format("appclient Bcrypt Encrypted Password       = %s", appclientEncryptedPassword));
    System.out.println(String.format("appclient Bcrypt Encrypted Password Valid = %s",
        encoder4.matches(appclientRawPassword, appclientEncryptedPassword)));
  }
}
