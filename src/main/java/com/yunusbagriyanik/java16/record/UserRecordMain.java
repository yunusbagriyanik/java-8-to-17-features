package com.yunusbagriyanik.java16.record;

import com.yunusbagriyanik.java16.record.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.UUID;

public class UserRecordMain {
    protected static final Logger logger = LogManager.getLogger(UserRecordMain.class);

    public static void main(String[] args) {
        User user = new User(UUID.randomUUID().toString(), "UserFirstName", "UserLastName", 1);
        logger.info("User: {}", user);
        logger.info("User firstname: {}", user.firstName());
        logger.info("User toString: {}", user);
        user.getFullName();

        User user2 = new User("User2FirstName", 1);
        logger.info("User2: {}", user2);

        User user3 = new User(UUID.randomUUID().toString(), "", "User3LastName", 1);
        logger.info("User3: {}", user3);
    }
}
