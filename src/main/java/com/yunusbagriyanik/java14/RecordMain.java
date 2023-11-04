package com.yunusbagriyanik.java14;

import com.yunusbagriyanik.java14.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.UUID;

public class RecordMain {
    protected static final Logger logger = LogManager.getLogger(RecordMain.class);

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
