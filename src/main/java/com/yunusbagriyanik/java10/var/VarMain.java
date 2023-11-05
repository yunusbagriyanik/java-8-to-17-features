package com.yunusbagriyanik.java10.var;

import com.yunusbagriyanik.java10.var.model.Student;
import com.yunusbagriyanik.java14.record.RecordMain;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Local variable type inference
 * this feature is available only for local variables with the initializer
 * var is not a keyword
 * var is a reserved type name
 */
public class VarMain {
    protected static final Logger logger = LogManager.getLogger(RecordMain.class);

    public static void main(String[] args) {
        var url = "example.com";
        logger.info(url);
        var number = 10.0;
        logger.info("Double " + number);
        var number2 = 10;
        logger.info("Integer " + number2);

        var idToNameMap = new HashMap<Integer, String>();
        idToNameMap.put(1, "Github");
        idToNameMap.put(2, "Java");
        logger.info(idToNameMap);

        /*
        var x; // error: Cannot infer type: 'var' on variable without initializer
        var nullVar = null; // error: Cannot infer type: variable initializer is 'null'
        public var java10 ="Java 10"; // error: Modifier 'public' not allowed here
        var p = (String s) -> s.length() > 10; // error: Cannot infer type: lambda expression requires an explicit target type
        var array = {1, 2, 3}; // error: Array initializer is not allowed here
         */

        var studentList = new ArrayList<>();
        var studentList2 = new ArrayList<Student>();

        var students = findStudent();
        var x = students.stream()
                .filter(student -> student.getAge() > 35)
                .map(Student::getName)
                .findFirst()
                .orElse("Not Found");
        logger.info(x);
    }

    public static List<Student> findStudent() {
        return List.of(
                new Student("TestUser", 25, "1234567890"),
                new Student("TestUser2", 30, "1234567890")
        );
    }
}
