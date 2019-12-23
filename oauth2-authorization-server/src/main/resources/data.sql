--
--Users: john/john@123 kelly/kelly@123
--Generate Bcrypt password using com.codeaches.oauth2.authorization.server.util.EncryptBCryptPassword.java (4 rounds)
--

INSERT INTO users (username,password,enabled) 
    VALUES ('john', '$2a$04$Ts1ry6sOr1BXXie5Eez.j.bsvqC0u3x7xAwOInn2qrItwsUUIC9li', TRUE);
INSERT INTO users (username,password,enabled) 
    VALUES ('kelly','$2a$04$qkCGgz.e5dkTiZogvzxla.KXbIvWXrQzyf8wTPJOOJBKjtHAQhoBa', TRUE);
  
INSERT INTO groups (id, group_name) VALUES (1, 'INVENTORY_GROUP_1');
INSERT INTO groups (id, group_name) VALUES (2, 'INVENTORY_GROUP_2');

INSERT INTO group_authorities (group_id, authority) VALUES (1, 'INVENTORY_VIEW');
INSERT INTO group_authorities (group_id, authority) VALUES (1, 'INVENTORY_ADD');

INSERT INTO group_authorities (group_id, authority) VALUES (2, 'INVENTORY_VIEW');

INSERT INTO group_members (username, group_id) VALUES ('john', 1);
INSERT INTO group_members (username, group_id) VALUES ('kelly', 2);

--
--Client: appclient/appclient@123
--Generate Bcrypt password using com.codeaches.oauth2.authorization.server.util.EncryptBCryptPassword.java (8 rounds)
--
INSERT INTO
  oauth_client_details (
    client_id,
    client_secret,
    resource_ids,
    scope,
    authorized_grant_types,
    access_token_validity,
    refresh_token_validity
  )
VALUES
  (
    'appclient',
    '$2a$08$dKyJRiySVD6wP.TElU52kOdkBq.8qId0o8KjwJqIEE5PjkwZQUoWu',
    'carInventory',
    'read,write',
    'authorization_code,check_token,refresh_token,password',
    1000000,
    1000000
  );
